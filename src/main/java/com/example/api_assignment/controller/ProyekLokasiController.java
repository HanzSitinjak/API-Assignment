package com.example.api_assignment.controller;

import com.example.api_assignment.dto.ProyekLokasiDTO;
import com.example.api_assignment.model.ProyekLokasi;
import com.example.api_assignment.service.ProyekLokasiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyek-lokasi")
public class ProyekLokasiController {

    @Autowired
    private ProyekLokasiService proyekLokasiService;

    @GetMapping
    public ResponseEntity<List<ProyekLokasi>> getAllProyekLokasi() {
        List<ProyekLokasi> proyekLokasiList = proyekLokasiService.getAllProyekLokasi();
        return new ResponseEntity<>(proyekLokasiList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ProyekLokasi> createProyekLokasi(@RequestBody ProyekLokasiDTO proyekLokasiDTO) {
    ProyekLokasi proyekLokasi = proyekLokasiService.createProyekLokasi(proyekLokasiDTO);
    return new ResponseEntity<>(proyekLokasi, HttpStatus.CREATED);
    }
}
