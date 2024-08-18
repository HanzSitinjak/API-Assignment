package com.example.api_assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class Proyek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyekId;

    @Column(name = "nama_proyek", nullable = false, length = 100)
    private String namaProyek;

    @Column(nullable = false, length = 100)
    private String client;

    @Column(name = "lokasiId", nullable = false) 
    private Long lokasiId;

    @Column(name = "tgl_mulai")
    private LocalDateTime tglMulai;

    @Column(name = "tgl_selesai")
    private LocalDateTime tglSelesai;

    @Column(name = "pimpinan_proyek", nullable = false, length = 100)
    private String pimpinanProyek;

    @Column(nullable = false, length = 250)
    private String keterangan;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Getters and Setters
    public Long getProyekId() {
        return proyekId;
    }

    public void setProyekId(Long proyekId) {
        this.proyekId = proyekId;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Long getLokasiId() {
        return lokasiId;
    }

    public void setLokasiId(Long lokasiId) {
        this.lokasiId = lokasiId;
    }

    public LocalDateTime getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(LocalDateTime tglMulai) {
        this.tglMulai = tglMulai;
    }

    public LocalDateTime getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(LocalDateTime tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinanProyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinanProyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
