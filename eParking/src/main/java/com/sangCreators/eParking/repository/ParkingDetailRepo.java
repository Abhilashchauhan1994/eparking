package com.sangCreators.eParking.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sangCreators.eParking.models.ParkingDetails;

@Transactional
@Repository
public interface ParkingDetailRepo extends JpaRepository<ParkingDetails, Long> {
	
	  @Modifying
	 @Query("delete from ParkingDetails parking where parking.userId = :userId")
	 void deletebyuserId(@Param("userId") Long userId);
	  
	  long countByparkingStatus(String parkingStatus);
	  
	  @Query("SELECT p.parkingStatus,count(*) from ParkingDetails p where p.parkingStatus =:parkingStatus")
	    List<Object[]> findParkingStatus(@Param("parkingStatus") String parkingStatus);

}
