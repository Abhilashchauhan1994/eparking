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
@Table(name="vehicle_details",schema="sang_parking_system")
public class VehicleDetails implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Vehicle_id")
	private Long vehicleId;
	
	@Column(name="Vehicle_name")
	private String vehicleName;
	
	@Column(name="Vehicle_code")
	private String vehicleCode;

	@Column(name="Last_update_date")
	private Date lastUpdateDate;
	
	@Column(name="Created_date")
	private Date createdDate;

	public VehicleDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleDetails(Long vehicleId, String vehicleName, String vehicleCode, Date lastUpdateDate,
			Date createdDate) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.vehicleCode = vehicleCode;
		this.lastUpdateDate = lastUpdateDate;
		this.createdDate = createdDate;
	}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
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
		return "VehicleDetails [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleCode="
				+ vehicleCode + ", lastUpdateDate=" + lastUpdateDate + ", createdDate=" + createdDate + "]";
	}
	
}
