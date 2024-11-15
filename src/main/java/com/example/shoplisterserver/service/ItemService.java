package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Item;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    List<Item> getAll();
    Optional<Item> findById(String id);
    Item insert(Item item);
    void deleteById(String id);
}
