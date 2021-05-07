package com.tcs.evaluation.profileEvaluation.Controller;
import com.tcs.evaluation.profileEvaluation.Entity.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;
import com.tcs.evaluation.profileEvaluation.Services.ProfileService;

@RestController

public class LeadController {
	
	@Autowired
	ProfileRepo repo;
	@Autowired
	ProfileService service;
	
	@GetMapping("/getProfiles")
	public List<Profile> getData() {
		return service.getAllProfile();
	}
	
	
	
	
}
	
	
	
