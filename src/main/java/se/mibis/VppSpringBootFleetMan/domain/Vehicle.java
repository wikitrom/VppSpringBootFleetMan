package se.mibis.VppSpringBootFleetMan.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	private int odometer;
	private String status;
	private String latLong;
	private String currentDriver;

	// -- constructors --
	public Vehicle() {  // hibernate requirement
	}


	// -- methods --

	public String toString() {
		return this.name + " odometer " + this.odometer;
	}


	// -- getters

	public String getName() {
		return name;
	}


	public int getOdometer() {
		return odometer;
	}

	public String getStatus() {
		return status;
	}

	public String getLatLong() {
		return latLong;
	}

	public String getCurrentDriver() {
		return currentDriver;
	}


	// -- setters

	public void setName(String name) {
		this.name = name;
	}


	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}

}
