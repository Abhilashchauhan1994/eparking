package com.sangCreators.eParking.services;

import java.util.List;

import com.sangCreators.eParking.Response.CreateUserResponseApi;
import com.sangCreators.eParking.Response.DeleteUserResponseApi;
import com.sangCreators.eParking.Response.UpdateUserResponseApi;
import com.sangCreators.eParking.models.ParkingDetails;
import com.sangCreators.eParking.models.UserDetails;

public interface UserServices {
	
	//UserDetails saveUserDetails(UserDetails userData);
	CreateUserResponseApi saveResponse(UserDetails userData);
	List<UserDetails> getUserDetails();
	UserDetails createPayload(UserDetails userData);
	UpdateUserResponseApi updateUser(Long userId,UserDetails userData);
	DeleteUserResponseApi deleteUser(Long userId);
	ParkingDetails createParking(UserDetails userData);
}
