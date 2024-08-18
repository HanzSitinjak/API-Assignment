Pada Fitur yang akan berkenaan langsung dengan "Location" akan ada beberapa endpoint yang akan dibuat untuk aspek tersebut.

## Menampilkan semua data lokasi
- Endpoint: GET /lokasi

# Body
{
   "id_lokasi" : "1",
   "nama_lokasi" : "xxxx",
   "negara" : "xxxxx",
   "provinsi" : "xxxxxxxxx",
   "kota" : "xxxxxx",
   "created_at": 12-03-94,
}

-Respon Task (failed) : "Data Tidak Ditemukan"

## Menambahkan data lokasi
- Endpoint: POST /lokasi

# Body
{
   "nama_lokasi" : "xxxx",
   "negara" : "xxxxx",
   "provinsi" : "xxxxxxxxx",
   "kota" : "xxxxxx",
}

-Respon Task (failed) : "Gagal Menambahkan Data"

## Edit/Update data Lokasi
- Endpoint: UPDATE /lokasi/id_lokasi

# Body
{
   "nama_lokasi" : "xxxx",
   "negara" : "xxxxx",
   "provinsi" : "xxxxxxxxx",
   "kota" : "xxxxxx",
}

-Respon Task (failed) : "Gagal Mengupdate Data"

## Menghapus data lokasi
- Endpoint: DELETE /lokasi/id_lokasi

# Body
{
   "Data berhasil dihapus"
}

-Respon Task (failed) : "Gagal Menghapus Data"