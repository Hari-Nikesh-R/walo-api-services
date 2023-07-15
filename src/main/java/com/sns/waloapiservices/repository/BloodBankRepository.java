package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.BankDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BloodBankRepository extends MongoRepository<BankDetails, String> {

}
