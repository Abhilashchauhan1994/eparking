package com.sangCreators.eParking.Response;

import java.util.Date;

import com.sangCreators.eParking.utility.StatusResponse;

public class DeleteUserResponseApi {
	
	private Long userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String vehicleNumber;
	private String phoneNumber;
	private String vehicleType;
	private Date createdDate;


	private StatusResponse statusResponse;

	public StatusResponse getStatusResponse() {
		return statusResponse;
	}

	public void setStatusResponse(StatusResponse statusResponse) {
		this.statusResponse = statusResponse;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public DeleteUserResponseApi() {
		
	}

	public DeleteUserResponseApi(Long userId, String userName, String firstName, String lastName, String vehicleNumber,
			String phoneNumber, String vehicleType, Date createdDate, StatusResponse statusResponse) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vehicleNumber = vehicleNumber;
		this.phoneNumber = phoneNumber;
		this.vehicleType = vehicleType;
		this.createdDate = createdDate;
		this.statusResponse = statusResponse;
	}
	
	
}
