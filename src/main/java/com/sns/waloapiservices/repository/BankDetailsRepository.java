package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.BankDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BankDetailsRepository extends MongoRepository<BankDetails , String> {

}
