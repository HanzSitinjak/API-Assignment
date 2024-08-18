package com.example.api_assignment.controller;

import com.example.api_assignment.model.Lokasi;
import com.example.api_assignment.service.LokasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lokasi")
public class LokasiController {

    @Autowired
    private LokasiService lokasiService;

    @GetMapping
    public ResponseEntity<List<Lokasi>> getAllLokasi() {
        List<Lokasi> lokasiList = lokasiService.getAllLokasi();
        return new ResponseEntity<>(lokasiList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lokasi> getLokasiById(@PathVariable("id") Long id) {
        return lokasiService.getLokasiById(id)
                .map(lokasi -> new ResponseEntity<>(lokasi, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Lokasi> createLokasi(@RequestBody Lokasi lokasi) {
        Lokasi savedLokasi = lokasiService.createLokasi(lokasi);
        return new ResponseEntity<>(savedLokasi, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lokasi> updateLokasi(@PathVariable("id") Long id, @RequestBody Lokasi lokasi) {
        return lokasiService.updateLokasi(id, lokasi)
                .map(updatedLokasi -> new ResponseEntity<>(updatedLokasi, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLokasi(@PathVariable("id") Long id) {
        if (lokasiService.deleteLokasi(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
