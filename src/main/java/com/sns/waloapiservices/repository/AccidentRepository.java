package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.Accidents;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccidentRepository extends MongoRepository<Accidents, String> {

}
