package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.AppliedJobs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppliedJobsRepository extends MongoRepository <AppliedJobs, String> {

}
