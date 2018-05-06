package se.mibis.VppSpringBootFleetMan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import se.mibis.VppSpringBootFleetMan.data.VehicleRepository;
import se.mibis.VppSpringBootFleetMan.domain.Vehicle;

@Controller
@RequestMapping("/website/vehicles")
public class VehicleController {
	@Autowired
	private VehicleRepository data;

	@RequestMapping(value = "/newVehicle.html", method = RequestMethod.POST)
	public String newVehicle(Vehicle vehicle) {
		data.save(vehicle);
		System.out.println("UABTROM: BLABLALBA");
		return "redirect:/website/vehicles/list.html";
	}

	@GetMapping(value = "/newVehicle.html")
	public ModelAndView renderNewVehicleForm() {
		// instantiate a place holder for vehicle data, i.e. the 'Backing object'
		Vehicle newVehicle = new Vehicle();
		return new ModelAndView("newVehicle", "form", newVehicle);
	}

	@RequestMapping(value = "/list.html", method = RequestMethod.GET)
	public ModelAndView vehicles() {
		List<Vehicle> vehicles = data.findAll();
		return new ModelAndView("allVehicles", "vehicles", vehicles);
	}

	@RequestMapping(value = "/vehicle/{name}") // GET is default method
	public ModelAndView showVehicleByName(@PathVariable("name") String name) {
		Vehicle vehicle = data.findByName(name);
		return new ModelAndView("vehicleInfo", "vehicle", vehicle);

	}

}