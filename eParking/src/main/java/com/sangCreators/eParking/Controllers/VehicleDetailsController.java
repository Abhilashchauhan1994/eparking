package com.sangCreators.eParking.Controllers;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangCreators.eParking.models.VehicleDetails;
import com.sangCreators.eParking.repository.VehicleDetailsRepo;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
public class VehicleDetailsController {

	private Logger LOGGER =LoggerFactory.getLogger(VehicleDetailsController.class);
	
	@Autowired
	VehicleDetailsRepo vehicleDetailsRepo;
	
	@GetMapping("/eParking/VehicleDetails/all")
	List<VehicleDetails> getParkingDetails(){
		LOGGER.info("Loading All Vehicle Details...");
		return vehicleDetailsRepo.findAll();
		
	}
	
	 @PostMapping("/eParking/create/vehicle")
	    public VehicleDetails create(@RequestBody VehicleDetails vehicleData){
		 LOGGER.info("we got userDetails: "+vehicleData);
		 Date date = new Date();
		 LOGGER.info("We have Date:"+date);
		 vehicleData.setCreatedDate(date);
		 vehicleData.setLastUpdateDate(date);
		 LOGGER.info("we have new userDetails: "+vehicleData);
	      return vehicleDetailsRepo.save(vehicleData);
	    }
}

