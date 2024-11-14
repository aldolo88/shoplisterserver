package com.example.shoplisterserver.repository;

import com.example.shoplisterserver.model.Shop;
import com.example.shoplisterserver.model.Shoplist;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoplistRepository extends MongoRepository<Shoplist, String> {
}
