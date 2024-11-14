package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Shop;

import java.util.List;
import java.util.Optional;

public interface ShopService {
    List<Shop> getAll();
    Optional<Shop> findById(String id);
    Shop insert(Shop shop);
    void deleteById(String id);
}
