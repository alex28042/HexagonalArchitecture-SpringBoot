package com.example.App.Users.Domain;

import com.example.App.Users.Domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {
    @Query("{'email':  ?0}")
    Users findByEmail(String email);
}