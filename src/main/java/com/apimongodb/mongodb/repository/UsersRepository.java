package com.apimongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.apimongodb.mongodb.model.users;

public interface UsersRepository extends MongoRepository<users, String>{

}
