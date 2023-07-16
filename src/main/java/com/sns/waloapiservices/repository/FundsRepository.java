package com.sns.waloapiservices.repository;

import com.sns.waloapiservices.model.BloodBank;
import com.sns.waloapiservices.model.Funds;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FundsRepository extends MongoRepository<Funds, String> {

}
