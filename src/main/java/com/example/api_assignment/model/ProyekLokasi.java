package com.example.api_assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyek_lokasi")
@IdClass(ProyekLokasiId.class)
public class ProyekLokasi {

    @Id
    @ManyToOne
    @JoinColumn(name = "proyek_id")
    private Proyek proyek;

    @Id
    @ManyToOne
    @JoinColumn(name = "lokasi_id")
    private Lokasi lokasi;

    // Getters and Setters
    public Proyek getProyek() {
        return proyek;
    }

    public void setProyek(Proyek proyek) {
        this.proyek = proyek;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }
}
