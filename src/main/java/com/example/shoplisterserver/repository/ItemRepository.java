package com.example.shoplisterserver.repository;

import com.example.shoplisterserver.model.Item;
import com.example.shoplisterserver.model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
