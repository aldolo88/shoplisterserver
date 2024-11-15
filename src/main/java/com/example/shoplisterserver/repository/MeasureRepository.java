package com.example.shoplisterserver.repository;

import com.example.shoplisterserver.model.Measure;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasureRepository extends MongoRepository<Measure, String> {
}
