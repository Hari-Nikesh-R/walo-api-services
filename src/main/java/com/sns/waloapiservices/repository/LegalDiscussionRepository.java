package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.LegalDiscussion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LegalDiscussionRepository extends MongoRepository<LegalDiscussion, String> {

}
