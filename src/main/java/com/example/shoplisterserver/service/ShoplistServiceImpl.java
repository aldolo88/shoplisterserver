package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Item;
import com.example.shoplisterserver.model.Shop;
import com.example.shoplisterserver.model.Shoplist;
import com.example.shoplisterserver.repository.ItemRepository;
import com.example.shoplisterserver.repository.ShoplistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoplistServiceImpl implements ShoplistService {
    @Autowired
    private ShoplistRepository shoplistRepository;

    @Override
    public List<Shoplist> getAll() {
        return shoplistRepository.findAll();
    }

    @Override
    public Optional<Shoplist> findById(String id) {
        return shoplistRepository.findById(id);
    }

    @Override
    public Shoplist upsert(Shoplist shoplist) {
        return shoplistRepository.save(shoplist);
    }

    @Override
    public void deleteById(String id) {
        shoplistRepository.deleteById(id);
    }
}
