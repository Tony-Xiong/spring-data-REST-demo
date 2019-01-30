package com.xyz.model.repository;

import com.xyz.model.entity.Store;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreRepository extends MongoRepository<Store, ObjectId> {
}
