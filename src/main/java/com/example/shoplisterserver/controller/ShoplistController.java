package com.example.shoplisterserver.controller;

import com.example.shoplisterserver.model.Shoplist;
import com.example.shoplisterserver.service.ShoplistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shoplist")
public class ShoplistController {
    @Autowired
    private ShoplistService shoplistService;

    @GetMapping("/getAll")
    public List<Shoplist> getAllShops() {
        return shoplistService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Shoplist> getShopById(@PathVariable String id) {
        return shoplistService.findById(id);
    }

    @PostMapping("/save")
    public Shoplist upsertShop(@RequestBody Shoplist shoplist) {
        return shoplistService.upsert(shoplist);
    }
}
