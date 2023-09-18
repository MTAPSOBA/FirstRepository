package com.tapsoba.restws;

import java.util.List;

import com.tapsoba.restws.model.Patient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/patientservice")
public interface patientService {

	
	@Path("/patients")
	@GET
	List<Patient>getpatients();
	  
}
