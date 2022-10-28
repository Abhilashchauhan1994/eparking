package com.sangCreators.eParking.Controllers;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sangCreators.eParking.services.StatisticsDataService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*",exposedHeaders="Access-Control-Allow-Origin")
public class StatisticsDataController {
	
	private static final Logger LOGGER =LoggerFactory.getLogger(StatisticsDataController.class);

	@Autowired 
	StatisticsDataService statisticsDataService;
	
	@GetMapping("/eParking/staticsData/all")
	HashMap<String, Object> getParkingDetails(){
		LOGGER.info("Loading Parking stats Details...");
		return statisticsDataService.getParkingData();
		
	}
}
