package com.example.shoplisterserver.controller;

import com.example.shoplisterserver.model.Item;
import com.example.shoplisterserver.model.Shop;
import com.example.shoplisterserver.service.ItemService;
import com.example.shoplisterserver.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/getAll")
    public List<Item> getAllItems() {
        return itemService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Item> getItemById(@PathVariable String id) {
        return itemService.findById(id);
    }

    @PostMapping("/add")
    public Item insertItem(@RequestBody Item item) {
        return itemService.insert(item);
    }
}
