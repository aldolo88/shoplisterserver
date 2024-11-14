package com.example.shoplisterserver.controller;

import com.example.shoplisterserver.model.Shop;
import com.example.shoplisterserver.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/getAll")
    public List<Shop> getAllShops() {
        return shopService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Shop> getShopById(@PathVariable String id) {
        return shopService.findById(id);
    }

    @PostMapping("/add")
    public Shop insertShop(@RequestBody Shop shop) {
        return shopService.insert(shop);
    }
}
