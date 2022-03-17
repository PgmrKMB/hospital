package com.kmb.hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Hospital {

	@Id
	@GeneratedValue
	int id;
	
	String sido, name, tel, address ;
	int medical, room;
	
}
