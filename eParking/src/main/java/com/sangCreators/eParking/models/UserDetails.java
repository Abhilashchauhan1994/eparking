/**
 * 
 */
package com.sangCreators.eParking.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abhilash Chauhan
 *
 */
@Entity
@Table(name="user_details",schema="sang_parking_system")
public class UserDetails implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="User_id")
	private Long userId;
	
	@Column(name="User_name")
	private String userName;
	
	@Column(name="First_name")
	private String firstName;
	
	@Column(name="Last_name")
	private String lastName;
	
	@Column(name="Vehicle_number")
	private String vehicleNumber;
	
	@Column(name="Phone_number")
	private String phoneNumber;
	
	@Column(name="Vehicle_code")
	private String vehicleCode;
	
	@Column(name="Last_update_date")
	private Date lastUpdateDate;
	
	@Column(name="Created_date")
	private Date createdDate;

	public UserDetails() {
		
	}

	public UserDetails(String userName, String firstName, String lastName, String vehicleNumber, String phoneNumber,
			String vehicleCode, Date lastUpdateDate, Date createdDate) {
		super();
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vehicleNumber = vehicleNumber;
		this.phoneNumber = phoneNumber;
		this.vehicleCode = vehicleCode;
		this.lastUpdateDate = lastUpdateDate;
		this.createdDate = createdDate;
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

	public void setvehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", vehicleNumber=" + vehicleNumber + ", phoneNumber=" + phoneNumber + ", vehicleCode="
				+ vehicleCode + ", lastUpdateDate=" + lastUpdateDate + ", createdDate=" + createdDate + "]";
	}


}
