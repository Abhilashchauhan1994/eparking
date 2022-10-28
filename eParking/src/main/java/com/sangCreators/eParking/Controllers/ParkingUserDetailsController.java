package com.sangCreators.eParking.Controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangCreators.eParking.models.ParkingUserDetails;
import com.sangCreators.eParking.repository.ParkingUserDetailsRepo;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
public class ParkingUserDetailsController {
	private static final Logger LOGGER =LoggerFactory.getLogger(ParkingUserDetailsController.class);
	
	@Autowired
	ParkingUserDetailsRepo parkingUserDetailsRepo;
	
	@GetMapping("/eParking/ParkingDetails/all")
	List<ParkingUserDetails> getParkingDetails(){
		LOGGER.info("Loding Parking details for all Users");
		return parkingUserDetailsRepo.findAll();
		
	}
	
	
}
