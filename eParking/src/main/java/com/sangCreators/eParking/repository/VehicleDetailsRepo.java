package com.sangCreators.eParking.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sangCreators.eParking.models.VehicleDetails;

@Transactional
@Repository
public interface VehicleDetailsRepo extends JpaRepository<VehicleDetails, Long>{

}
