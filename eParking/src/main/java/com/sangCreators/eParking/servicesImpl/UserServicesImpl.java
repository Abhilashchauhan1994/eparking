package com.sangCreators.eParking.servicesImpl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangCreators.eParking.Response.CreateUserResponseApi;
import com.sangCreators.eParking.Response.DeleteUserResponseApi;
import com.sangCreators.eParking.Response.UpdateUserResponseApi;
import com.sangCreators.eParking.models.ParkingDetails;
import com.sangCreators.eParking.models.UserDetails;
import com.sangCreators.eParking.repository.ParkingDetailRepo;
import com.sangCreators.eParking.repository.UserDetailsRepo;
import com.sangCreators.eParking.services.UserServices;
import com.sangCreators.eParking.utility.CommonConstant;
import com.sangCreators.eParking.utility.StatusResponse;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	@Autowired
	ParkingDetailRepo parkingDetailRepo;

	@Override
	public CreateUserResponseApi saveResponse(UserDetails userData) {
		CreateUserResponseApi createUser = new CreateUserResponseApi();
		UserDetails newUsercreated = new UserDetails();
		StatusResponse statusResponse = new StatusResponse();
		if(userData != null) {
			newUsercreated=userDetailsRepo.save(userData);
			System.out.println("New User Details from Repo: "+newUsercreated);
			ParkingDetails createParking =  createParking(newUsercreated);
			if(createParking != null) {
				createUser.setParkingCreated(CommonConstant.PARKING_CREATION_SUCCESS);
			}else {
				createUser.setParkingCreated(CommonConstant.PARKING_CREATION_ERROR);
			}
			statusResponse.setErrorCode(CommonConstant.SUCCESS);
			statusResponse.setMessage(CommonConstant.USER_CREATED);
			createUser.setStatusResponse(statusResponse);
			return createUser;
		}
		else {

			statusResponse.setErrorCode(CommonConstant.SUCCESS);
			statusResponse.setMessage(CommonConstant.USER_CREATION_FAILED);
			createUser.setStatusResponse(statusResponse);
			return createUser;	
		}
	}

	@Override
	public List<UserDetails> getUserDetails() {
		return userDetailsRepo.findAll();
	}

	@Override
	public UserDetails createPayload(UserDetails userData) {
		 Date date = new Date();
		 String firstName = userData.getFirstName();
		 String lastName = userData.getLastName();
		 String userName =firstName.toLowerCase()+"."+lastName.toLowerCase();
		 userData.setUserName(userName);
		 userData.setCreatedDate(date);
		 userData.setLastUpdateDate(date);
		 userData.setFirstName(userData.getFirstName());
		 userData.setLastName(userData.getLastName());
		 userData.setPhoneNumber(userData.getPhoneNumber());
		 userData.setvehicleNumber(userData.getVehicleNumber());
		 userData.setVehicleCode(userData.getVehicleCode());
		return userData;
	}

	@Override
	public UpdateUserResponseApi updateUser(Long userId,UserDetails userData) {
		UpdateUserResponseApi updateuser =new UpdateUserResponseApi();
		StatusResponse statusResponse = new StatusResponse();
		UserDetails updatePayload =  new UserDetails();
		UserDetails checkUser = userDetailsRepo.findById(userId).get();
		System.out.println("CHeckUser details :"+ checkUser);
		if(checkUser!= null) {
			 Date date = new Date();
			 String firstName = userData.getFirstName();
			 String lastName = userData.getLastName();
			 String userName =firstName.toLowerCase()+"."+lastName.toLowerCase();
			 String presentUserName = checkUser.getUserName();
			 System.out.println("UserName :"+ userName+" PresentUserName: "+presentUserName);
			 if(!presentUserName.equals(userName)) {
				 updatePayload.setUserName(userName); 
			 }else {
				 updatePayload.setUserName(presentUserName); 
			 }
			 updatePayload.setCreatedDate(checkUser.getCreatedDate());
			 updatePayload.setUserId(checkUser.getUserId());
			 updatePayload.setLastUpdateDate(date);
			 updatePayload.setFirstName(userData.getFirstName());
			 updatePayload.setLastName(userData.getLastName());
			 updatePayload.setPhoneNumber(userData.getPhoneNumber());
			 updatePayload.setvehicleNumber(userData.getVehicleNumber());
			 updatePayload.setVehicleCode(userData.getVehicleCode());
			 userDetailsRepo.save(updatePayload);
			 statusResponse.setErrorCode(CommonConstant.SUCCESS);
			 statusResponse.setMessage(CommonConstant.USER_UPDATED);
			 updateuser.setStatusResponse(statusResponse);
			 return updateuser;
		}else  {
			statusResponse.setErrorCode(CommonConstant.SUCCESS);
			 statusResponse.setMessage(CommonConstant.USER_UPDATED_FAILED);
			 updateuser.setStatusResponse(statusResponse);
			 return updateuser;
		}

	}

	@Override
	public DeleteUserResponseApi deleteUser(Long userId) {
		DeleteUserResponseApi deleteUser = new DeleteUserResponseApi();
		StatusResponse statusResponse = new StatusResponse();
		if(userId != null) {
			parkingDetailRepo.deletebyuserId(userId);
			userDetailsRepo.deleteById(userId);
			statusResponse.setErrorCode(CommonConstant.SUCCESS);
			statusResponse.setMessage(CommonConstant.USER_DELETED);
			deleteUser.setStatusResponse(statusResponse);
			return deleteUser;
		}
		else {

			statusResponse.setErrorCode(CommonConstant.SUCCESS);
			statusResponse.setMessage(CommonConstant.USER_DELETED_FAILED);
			deleteUser.setStatusResponse(statusResponse);
			return deleteUser;	
		}
	}

	@Override
	public ParkingDetails createParking(UserDetails userData) {
		ParkingDetails parking = new ParkingDetails();
		/*current date*/
		Date currdate = new Date();
		/*setting calender*/
		
		 Calendar c = Calendar.getInstance();
	     c.setTime(currdate);
	     c.add(Calendar.MONTH, 1);
	     
	     Date currentDatePlusOne = c.getTime();
		
		parking.setUserId(userData.getUserId());
		parking.setVehicleTypeCode(userData.getVehicleCode());
		parking.setParkingStartDate(userData.getCreatedDate());
		parking.setCreatedDate(currdate);
		parking.setLastUpdateDate(currdate);
		parking.setParkingEndDate(currentDatePlusOne);
		parking.setParkingStatus(CommonConstant.PARKING_STATUS_ACTIVE);
		parkingDetailRepo.save(parking);
		return parking;
	}
	
}
