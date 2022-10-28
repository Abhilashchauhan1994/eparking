package com.sangCreators.eParking.servicesImpl;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangCreators.eParking.repository.ParkingDetailRepo;
import com.sangCreators.eParking.services.StatisticsDataService;

@Service
public class StatisticsDataImpl implements StatisticsDataService{
	
	private static final Logger LOGGER =LoggerFactory.getLogger(StatisticsDataImpl.class);

	@Autowired
	ParkingDetailRepo parkingDetailRepo;
	
	@Override
	public HashMap<String, Object> getParkingData() {
		/*long active =parkingDetailRepo.countByparkingStatus("Active");
		LOGGER.info("Count of Active Parking: "+active);
		long inactive =parkingDetailRepo.countByparkingStatus("Inactive");
		LOGGER.info("Count of inactive Parking: "+inactive);
		long warning =parkingDetailRepo.countByparkingStatus("Warning");
		LOGGER.info("Count of Warning Parking: "+warning);
		*/
		HashMap<String, Object> status = new HashMap<>();
		
		List<Object[]> active = parkingDetailRepo.findParkingStatus("Active");
		for (Object[] ob : active){
            String key = (String)ob[0];
            status.put("Status", key);
            LOGGER.info("Status: "+key);
            long value = (long) ob[1];
            status.put("value", value);
            LOGGER.info("value: "+value);
        } 
		
		List<Object[]> inactive = parkingDetailRepo.findParkingStatus("Inactive");
        for (Object[] ob : inactive){
            String key = (String)ob[0];
            status.put("Status", key);
            LOGGER.info("Status: "+key);
            long value = (long) ob[1];
            status.put("value", value);
            LOGGER.info("value: "+value);
        }
        
        List<Object[]> warning = parkingDetailRepo.findParkingStatus("Warning");
        for (Object[] ob : warning){
            String key = (String)ob[0];
            status.put("Status", key);
            LOGGER.info("Status: "+key);
            long value = (long) ob[1];
            status.put("value", value);
            LOGGER.info("value: "+value);
        }
        
		
		return status;
	}

}
