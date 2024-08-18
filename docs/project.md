Pada Fitur yang akan berkenaan langsung dengan "Location" akan ada beberapa endpoint yang akan dibuat untuk aspek tersebut.

## Menampilkan semua data lokasi
- Endpoint: GET /proyek

# Body
{
   "id_proyek" : "1",
   "nama_proyek" : "xxxx",
   "client" : "xxxxx",
   "tgl_mulai" : 12-03-94,
   "tgl_selesai" : 12-03-94,
   "pimpinan_proyek" : "xxxxx",
   "keterangan" : "xxxxx",
   "created_at": 12-03-94,
}

-Respon Task (failed) : "Data Tidak Ditemukan"

## Menambahkan data lokasi
- Endpoint: POST /proyek

# Body
{
   "nama_proyek" : "xxxx",
   "client" : "xxxxx",
   "tgl_mulai" : 12-03-94,
   "tgl_selesai" : 12-03-94,
   "pimpinan_proyek" : "xxxxx",
   "keterangan" : "xxxxx",
}

-Respon Task (failed) : "Gagal Menambahkan Data"

## Edit/Update data Lokasi
- Endpoint: UPDATE /proyek/id_lokasi

# Body
{
   "nama_proyek" : "xxxx",
   "client" : "xxxxx",
   "tgl_mulai" : 12-03-94,
   "tgl_selesai" : 12-03-94,
   "pimpinan_proyek" : "xxxxx",
   "keterangan" : "xxxxx",
}

-Respon Task (failed) : "Gagal Mengupdate Data"

## Menghapus data lokasi
- Endpoint: DELETE /proyek/id_lokasi

# Body
{
   "Data berhasil dihapus"
}

-Respon Task (failed) : "Gagal Menghapus Data"