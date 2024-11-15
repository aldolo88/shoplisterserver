package com.example.shoplisterserver.service;

import com.example.shoplisterserver.model.Measure;
import com.example.shoplisterserver.repository.MeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MeasureServiceImpl implements MeasureService {
    @Autowired
    private MeasureRepository measureRepository;

    @Override
    public List<Measure> getAll() {
        return measureRepository.findAll();
    }

    @Override
    public Optional<Measure> findById(String id) {
        return measureRepository.findById(id);
    }

    @Override
    public Measure insert(Measure measure) {
        return measureRepository.save(measure);
    }

    @Override
    public void deleteById(String id) {
        measureRepository.deleteById(id);
    }
}
