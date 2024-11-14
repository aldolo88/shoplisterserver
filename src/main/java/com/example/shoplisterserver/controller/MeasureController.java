package com.example.shoplisterserver.controller;

import com.example.shoplisterserver.model.Item;
import com.example.shoplisterserver.model.Measure;
import com.example.shoplisterserver.service.ItemService;
import com.example.shoplisterserver.service.MeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/measure")
public class MeasureController {
    @Autowired
    private MeasureService measureService;

    @GetMapping("/getAll")
    public List<Measure> getAllMeasures() {
        return measureService.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Measure> getMeasureById(@PathVariable String id) {
        return measureService.findById(id);
    }

    @PostMapping("/add")
    public Measure insertMeasure(@RequestBody Measure measure) {
        return measureService.insert(measure);
    }
}
