package se.mibis.VppSpringBootFleetMan.data;

import org.springframework.data.jpa.repository.JpaRepository;

import se.mibis.VppSpringBootFleetMan.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	// -- declare abstract methods for non-standard findBy<field name>
	public Vehicle findByName(String name);
}
