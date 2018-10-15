package com.expertus.expertusgames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expertus.expertusgames.model.Challenge;
import com.expertus.expertusgames.service.ChallengeService;


/**
 * @author Otmane Benameur
 *
 */

@RestController
@RequestMapping("/api/challenge")
public class ChallengeController {
	
	@Autowired
	private ChallengeService service;
	
	@RequestMapping("/")
	public List<Challenge> getAll() {
		return service.getAll();
	}
	
	@GetMapping(value = "/{id}")
	public Challenge findById(@PathVariable final String id) {
		return service.findById(id);
	}
	
	@PostMapping(value = "/")
	public Challenge create(@RequestBody final Challenge challenge) {
		return service.create(challenge);
	}
	
	@PutMapping(value = "/")
	public Challenge update(@RequestBody final Challenge challenge) {
		return service.update(challenge);
	}
	
	@DeleteMapping(value = "/{id}")
	public String delete(@PathVariable final String id) {
		return service.delete(id);
	}
}
