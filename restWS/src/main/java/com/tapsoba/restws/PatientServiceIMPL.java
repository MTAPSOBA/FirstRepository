package com.tapsoba.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.tapsoba.restws.model.Patient;

@Service
public class PatientServiceIMPL implements patientService {
	
	Map<Long,Patient> patients = new HashMap<>();
	long currentId =123;
	
	public PatientServiceIMPL() {
		init();
	
		}
	void init() {
		Patient patient = new Patient();
		patient.setId(currentId);
		patient.setName("john");
		patients.put(patient.getId(),patient);
	}
	@Override
	public List<Patient> getpatients() {
Collection<Patient> results = patients.values();

ArrayList response = new ArrayList( results);

		return response;
	}
	
	
	
}
