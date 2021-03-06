package com.tcs.evaluation.profileEvaluation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.evaluation.profileEvaluation.Entity.Evaluator;
import com.tcs.evaluation.profileEvaluation.Entity.Profile;
import com.tcs.evaluation.profileEvaluation.Repository.ProfileRepo;
import com.tcs.evaluation.profileEvaluation.Repository.newjavaclass;

@Service
public class ProfileService {
	@Autowired
	ProfileRepo repo;
	
	public List<Profile> getAllProfile(){
		return repo.findAll();
	}
	Long value = 100000L;
	public String postProfile(Profile profile){
		if (profile.getId() == null) {
			profile.setId(++this.value);
		}
//		System.out.println(profile);
		if(repo.existsById(profile.getId())) {
			return "Sorry";
		}
		else {
			repo.save(profile);
			return "success";
		}
	}

	
}
