package com.example.api_assignment.service;

import com.example.api_assignment.model.Proyek;
import com.example.api_assignment.repository.ProyekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyekService {

    @Autowired
    private ProyekRepository proyekRepository;

    public List<Proyek> getAllProyek() {
        return proyekRepository.findAll();
    }

    public Proyek createProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }

    public Optional<Proyek> getProyekById(Long id) {
        return proyekRepository.findById(id);
    }

    public void deleteProyek(Long id) {
        proyekRepository.deleteById(id);
    }
}
