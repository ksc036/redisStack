package com.redis.om.skeleton.repository;

import com.redis.om.skeleton.models.User;
import com.redis.om.spring.repository.RedisDocumentRepository;

import java.util.Optional;
import java.util.Set;

public interface UserRepository extends RedisDocumentRepository<User,String> {
    // find one by property
//    Optional<User> findOneByName(String name);

//    Set<String> getKeysByPattern(String key);
}