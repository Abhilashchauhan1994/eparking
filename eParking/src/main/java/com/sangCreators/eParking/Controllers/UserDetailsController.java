package com.sangCreators.eParking.Controllers;


import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangCreators.eParking.Response.CreateUserResponseApi;
import com.sangCreators.eParking.Response.DeleteUserResponseApi;
import com.sangCreators.eParking.Response.UpdateUserResponseApi;
import com.sangCreators.eParking.models.UserDetails;
import com.sangCreators.eParking.services.UserServices;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*",exposedHeaders="Access-Control-Allow-Origin")
public class UserDetailsController {

private static final Logger LOGGER =LoggerFactory.getLogger(UserDetailsController.class);
	
	@Autowired
	UserServices userServices;
	
	@GetMapping("/eParking/userDetails/all")
	List<UserDetails> getParkingDetails(){
		LOGGER.info("Loading All Users' Details...");
		return userServices.getUserDetails();
		
	}
	
	 @PostMapping("/eParking/create/User")
	    public CreateUserResponseApi createUser(@RequestBody UserDetails userData){
		 UserDetails userPayload = new UserDetails();
		  userPayload =userServices.createPayload(userData);
		  LOGGER.info("we have userPayload: "+userPayload);
		return userServices.saveResponse(userPayload);
	    }
	
	 @PutMapping("/eParking/UpdateUser/{userId}")
	 	public UpdateUserResponseApi update(@PathVariable("userId") long userId,@RequestBody UserDetails userData) {
		 LOGGER.info("we are going to update details for UserID: "+userId);
		 LOGGER.info("We got this detail for updating: "+userData);
		 return userServices.updateUser(userId, userData);
	 }
	 
	 @DeleteMapping("/eParking/deleteUser/{userId}")
	 	public DeleteUserResponseApi deleteUser(@PathVariable("userId") long userId) {
		 LOGGER.info("We got UserId: "+userId);
		 return userServices.deleteUser(userId);
	 }
}
