package com.example.api_assignment.repository;

import com.example.api_assignment.model.ProyekLokasi;
import com.example.api_assignment.model.ProyekLokasiId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyekLokasiRepository extends JpaRepository<ProyekLokasi, ProyekLokasiId> {
}
