package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Measure;

import java.util.List;
import java.util.Optional;

public interface MeasureService {
    List<Measure> getAll();
    Optional<Measure> findById(String id);
    Measure insert(Measure item);
    void deleteById(String id);
}
