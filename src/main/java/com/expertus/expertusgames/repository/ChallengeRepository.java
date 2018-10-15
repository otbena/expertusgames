package com.expertus.expertusgames.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.expertus.expertusgames.model.Challenge;


/**
 * @author Otmane Benameur
 *
 */
@Repository
public interface ChallengeRepository extends MongoRepository<Challenge, String>{
	
}

