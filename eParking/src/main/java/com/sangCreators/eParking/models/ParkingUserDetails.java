/**
 * 
 */
package com.sangCreators.eParking.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author USER
 *
 */
@Entity
@Table(name="parking_user_details")
public class ParkingUserDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="User_id")
	private Long userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="vehicle_name")
	private String vehicleName;
	
	@Column(name="Vehicle_number")
	private String vehicleNumber;
	
	@Column(name="parking_status")
	private String parkingStatus;
	
	@Column(name="Parking_start_date")
	private Date parkingStartDate;
	
	@Column(name="Parking_end_date")
	private Date parkingEndDate;

	public ParkingUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingUserDetails(Long userId, String firstName, String lastName, String vehicleName, String vehicleNumber,
			String parkingStatus, Date parkingStartDate, Date parkingEndDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.parkingStatus = parkingStatus;
		this.parkingStartDate = parkingStartDate;
		this.parkingEndDate = parkingEndDate;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getParkingStatus() {
		return parkingStatus;
	}

	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public Date getParkingStartDate() {
		return parkingStartDate;
	}

	public void setParkingStartDate(Date parkingStartDate) {
		this.parkingStartDate = parkingStartDate;
	}

	public Date getParkingEndDate() {
		return parkingEndDate;
	}

	public void setParkingEndDate(Date parkingEndDate) {
		this.parkingEndDate = parkingEndDate;
	}

	@Override
	public String toString() {
		return "ParkingUserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber + ", parkingStatus="
				+ parkingStatus + ", parkingStartDate=" + parkingStartDate + ", parkingEndDate=" + parkingEndDate + "]";
	}

}
