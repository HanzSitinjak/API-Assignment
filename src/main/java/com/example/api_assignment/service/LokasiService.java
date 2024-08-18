package com.example.api_assignment.service;

import com.example.api_assignment.model.Lokasi;
import com.example.api_assignment.repository.LokasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LokasiService {

    @Autowired
    private LokasiRepository lokasiRepository;

    public List<Lokasi> getAllLokasi() {
        return lokasiRepository.findAll();
    }

    public Optional<Lokasi> getLokasiById(Long id) {
        return lokasiRepository.findById(id);
    }

    public Lokasi createLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }

    public Optional<Lokasi> updateLokasi(Long id, Lokasi lokasi) {
        return lokasiRepository.findById(id).map(existingLokasi -> {
            existingLokasi.setNamaLokasi(lokasi.getNamaLokasi());
            existingLokasi.setNegara(lokasi.getNegara());
            existingLokasi.setProvinsi(lokasi.getProvinsi());
            existingLokasi.setKota(lokasi.getKota());
            return lokasiRepository.save(existingLokasi);
        });
    }

    public boolean deleteLokasi(Long id) {
        if (lokasiRepository.existsById(id)) {
            lokasiRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
