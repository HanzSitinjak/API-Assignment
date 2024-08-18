package com.example.api_assignment.controller;

import com.example.api_assignment.model.Proyek;
import com.example.api_assignment.service.ProyekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proyek")
public class ProyekController {

    @Autowired
    private ProyekService proyekService;

    @GetMapping
    public List<Proyek> getAllProyek() {
        return proyekService.getAllProyek();
    }

    @PostMapping
    public ResponseEntity<Proyek> createProyek(@RequestBody Proyek proyek) {
        Proyek createdProyek = proyekService.createProyek(proyek);
        return new ResponseEntity<>(createdProyek, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyek> getProyekById(@PathVariable("id") Long id) {
        Optional<Proyek> proyek = proyekService.getProyekById(id);
        if (proyek.isPresent()) {
            return new ResponseEntity<>(proyek.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proyek> updateProyek(@PathVariable("id") Long id, @RequestBody Proyek proyek) {
        Optional<Proyek> existingProyek = proyekService.getProyekById(id);
        if (existingProyek.isPresent()) {
            Proyek updatedProyek = existingProyek.get();
            updatedProyek.setNamaProyek(proyek.getNamaProyek());
            updatedProyek.setClient(proyek.getClient());
            updatedProyek.setTglMulai(proyek.getTglMulai());
            updatedProyek.setTglSelesai(proyek.getTglSelesai());
            updatedProyek.setPimpinanProyek(proyek.getPimpinanProyek());
            updatedProyek.setKeterangan(proyek.getKeterangan());
            updatedProyek.setCreatedAt(proyek.getCreatedAt()); // Update createdAt if necessary

            Proyek savedProyek = proyekService.createProyek(updatedProyek);
            return new ResponseEntity<>(savedProyek, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProyek(@PathVariable("id") Long id) {
        Optional<Proyek> existingProyek = proyekService.getProyekById(id);
        if (existingProyek.isPresent()) {
            proyekService.deleteProyek(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
