package com.kmb.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kmb.hospital.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer> {

	
}
