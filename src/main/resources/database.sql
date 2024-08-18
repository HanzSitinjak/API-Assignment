CREATE DATABASE wms_project_api;

USE wms_project_api;

CREATE TABLE proyek (
    proyek_id INT AUTO_INCREMENT PRIMARY KEY,
    nama_proyek VARCHAR(100) NOT NULL,
    client VARCHAR(100) NOT NULL,
    tgl_mulai DATE,
    tgl_selesai DATE,
    pimpinan_proyek VARCHAR(100) NOT NULL,
    keterangan VARCHAR(250),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE lokasi (
    lokasi_id INT AUTO_INCREMENT PRIMARY KEY,
    nama_lokasi VARCHAR(100) NOT NULL,
    negara VARCHAR(100),
    provinsi VARCHAR(100),
    kota VARCHAR(100),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE proyek_lokasi (
    proyek_id INT NOT NULL,
    lokasi_id INT NOT NULL,
    PRIMARY KEY (proyek_id, lokasi_id),
    FOREIGN KEY (proyek_id) REFERENCES proyek(proyek_id) ON DELETE CASCADE,
    FOREIGN KEY (lokasi_id) REFERENCES lokasi(lokasi_id) ON DELETE CASCADE
);
