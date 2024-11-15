package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Shoplist;

import java.util.List;
import java.util.Optional;

public interface ShoplistService {
    List<Shoplist> getAll();
    Optional<Shoplist> findById(String id);
    Shoplist upsert(Shoplist shoplist);
    void deleteById(String id);
}
