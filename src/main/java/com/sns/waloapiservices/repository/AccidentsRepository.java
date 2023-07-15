package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.Accidents;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccidentsRepository extends MongoRepository<Accidents, String> {

}
