package com.example.api_assignment.service;

import com.example.api_assignment.dto.ProyekLokasiDTO;
import com.example.api_assignment.model.Lokasi;
import com.example.api_assignment.model.Proyek;
import com.example.api_assignment.model.ProyekLokasi;
import com.example.api_assignment.repository.ProyekLokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.api_assignment.repository.ProyekRepository; 
import com.example.api_assignment.repository.LokasiRepository; 

import java.util.List;

@Service
public class ProyekLokasiService {

    @Autowired
    private ProyekLokasiRepository proyekLokasiRepository;

    @Autowired
    private ProyekRepository proyekRepository; 

    @Autowired
    private LokasiRepository lokasiRepository;

    public List<ProyekLokasi> getAllProyekLokasi() {
        return proyekLokasiRepository.findAll();
    }

    public ProyekLokasi createProyekLokasi(ProyekLokasiDTO dto) {
        Proyek proyek = proyekRepository.findById(dto.getProyekId())
                                    .orElseThrow(() -> new RuntimeException("Proyek not found"));
        Lokasi lokasi = lokasiRepository.findById(dto.getLokasiId())
                                        .orElseThrow(() -> new RuntimeException("Lokasi not found"));

        ProyekLokasi proyekLokasi = new ProyekLokasi();
        proyekLokasi.setProyek(proyek);
        proyekLokasi.setLokasi(lokasi);

        return proyekLokasiRepository.save(proyekLokasi);
    }
}
