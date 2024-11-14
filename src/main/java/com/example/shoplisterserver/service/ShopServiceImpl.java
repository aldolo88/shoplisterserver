package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Shop;
import com.example.shoplisterserver.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopRepository shopRepository;

    @Override
    public List<Shop> getAll() {
        return shopRepository.findAll();
    }

    @Override
    public Optional<Shop> findById(String id) {
        return shopRepository.findById(id);
    }

    @Override
    public Shop insert(Shop shop) {
        return shopRepository.save(shop);
    }

    @Override
    public void deleteById(String id) {
        shopRepository.deleteById(id);
    }
}
