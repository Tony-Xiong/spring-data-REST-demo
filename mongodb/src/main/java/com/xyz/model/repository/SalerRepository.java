package com.xyz.model.repository;

import com.xyz.model.entity.Saler;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalerRepository extends MongoRepository<Saler, ObjectId> {
}
