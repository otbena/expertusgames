package com.expertus.expertusgames.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expertus.expertusgames.model.Challenge;
import com.expertus.expertusgames.repository.ChallengeRepository;


/**
 * @author Otmane Benameur
 *
 */

@Service
public class ChallengeService {
	
	@Autowired
	private ChallengeRepository repository;
	
	
	public Challenge create(Challenge challenge) {
		//set id to null to let mongoDB generated
		challenge.setId(null);
		return repository.save(challenge);
	}
	
	public Challenge update(Challenge challenge) {
		Challenge oldValue = repository.findById(challenge.getId()).orElse(null);
		if(oldValue != null)
			return repository.save(challenge);
		else
			return null;
	}
	
	public String delete(String id) {
		Challenge challenge = repository.findById(id).orElse(null);
		if(challenge != null) {
			repository.delete(challenge);
			return "Chalenge with Id: " + id +  " was deleted";
		}
		return "no challenge with Id: " + id +  " found";
	}

	public List<Challenge> getAll() {
		return repository.findAll();
	}
	
	public Challenge findById(String id) {
		return repository.findById(id).orElse(null);
	}
	
}
