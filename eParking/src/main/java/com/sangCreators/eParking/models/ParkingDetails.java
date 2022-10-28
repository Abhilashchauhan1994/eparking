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
@Table(name="parking_details",schema="sang_parking_system")
public class ParkingDetails implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Parking_id")
	private Long parkingId;
	
	@Column(name="Parking_start_date")
	private Date parkingStartDate;
	
	@Column(name="Parking_end_date")
	private Date parkingEndDate;
	
	@Column(name="Vehicle_type_code")
	private String vehicleTypeCode;
	
	@Column(name="Parking_status")
	private String parkingStatus;
	
	@Column(name="User_id")
	private Long userId;
	
	@Column(name="last_update_date")
	private Date lastUpdateDate;
	
	@Column(name="Created_date")
	private Date createdDate;
	
	
	
	public String getParkingStatus() {
		return parkingStatus;
	}

	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
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

	public Long getParkingId() {
		return parkingId;
	}

	public void setParkingId(Long parkingId) {
		this.parkingId = parkingId;
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

	public String getVehicleTypeCode() {
		return vehicleTypeCode;
	}

	public void setVehicleTypeCode(String vehicleTypeCode) {
		this.vehicleTypeCode = vehicleTypeCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public ParkingDetails() {
		
	}

	public ParkingDetails(Long parkingId, Date parkingStartDate, Date parkingEndDate, String vehicleTypeCode,
			String parkingStatus, Long userId, Date lastUpdateDate, Date createdDate) {
		super();
		this.parkingId = parkingId;
		this.parkingStartDate = parkingStartDate;
		this.parkingEndDate = parkingEndDate;
		this.vehicleTypeCode = vehicleTypeCode;
		this.parkingStatus = parkingStatus;
		this.userId = userId;
		this.lastUpdateDate = lastUpdateDate;
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "ParkingDetails [parkingId=" + parkingId + ", parkingStartDate=" + parkingStartDate + ", parkingEndDate="
				+ parkingEndDate + ", vehicleTypeCode=" + vehicleTypeCode + ", parkingStatus=" + parkingStatus
				+ ", userId=" + userId + ", lastUpdateDate=" + lastUpdateDate + ", createdDate=" + createdDate + "]";
	}

	
	
}
