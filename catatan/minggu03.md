# Minggu 3: Inheritance

## Yang saya kerjakan

Di minggu 3 saya melengkapi tiga subclass dari `Aset`, yaitu `Ruang`, `Laptop`,
dan `AlatLab`. Setiap kelas memakai `extends Aset`, memanggil `super(kode, nama)`
di konstruktor, punya field dan getter sendiri, dan meng-override `getJenis()`.
- `Ruang`: field `kapasitas` (harus > 0), `getJenis()` mengembalikan `RUANG`.
- `Laptop`: field `spesifikasi` dan `nomorInventaris` (tidak boleh null atau
  kosong), `getJenis()` mengembalikan `LAPTOP`.
- `AlatLab`: field `laboratorium` (tidak boleh kosong) dan `tingkatRisiko`
  (tidak boleh null), `getJenis()` mengembalikan `ALAT_LAB`.

Tes: `Minggu03HierarkiTest`, hasil [ISI: LOLOS / ada yang gagal, sebutkan yang gagal].
CI di GitHub: [ISI: hijau / merah].

## Keputusan dan asumsi

Field `kode`, `nama`, `status`, dan `kondisi` tetap di `Aset` karena dimiliki
semua jenis aset, sehingga tidak ditulis ulang di subclass. Field `kapasitas`,
`spesifikasi`, `nomorInventaris`, `laboratorium`, dan `tingkatRisiko` ada di
subclass karena hanya relevan untuk satu jenis aset.

Validasi kode dan nama tidak saya tulis ulang. Cukup memanggil `super(kode, nama)`
sebagai baris pertama konstruktor, maka validasi `Aset` ikut berjalan.

Field subclass saya buat `final` tanpa setter karena tes dan tugas tidak
membutuhkan perubahan nilai setelah objek dibuat.

Untuk teks di `Laptop` dan `AlatLab` saya memakai `isBlank()` dan `trim()`,
konsisten dengan `validasiTeks` di `Aset`.

## Keterbatasan inheritance (contoh di sistem ini)

[ISI: tulis ulang dengan kata-kata Anda sendiri. Arah contohnya:]
Denda keterlambatan (minggu 4) di-override di tiap subclass. Artinya aturan
denda terikat pada jenis kelasnya. Kalau `Laptop` dan `AlatLab` suatu hari
punya aturan denda yang sama, atau aturan dendanya harus berubah tanpa mengubah
kelasnya, kita terpaksa menyalin kode atau menambah lapisan hierarki baru.
Dengan komposisi, `Aset` cukup memegang objek kebijakan denda yang bisa dipakai
ulang dan diganti, tanpa menambah subclass.

## Kendala

[ISI: tulis kendala yang benar-benar Anda alami, misalnya error saat menjalankan
tes, konflik saat `git merge upstream/main`, atau kesalahan urutan parameter.
Kalau tidak ada kendala, tulis "Tidak ada kendala berarti".]

## Penggunaan AI

- Penjelasan konsep inheritance, `super(...)`, dan `@Override`.
- Penjelasan pembagian field antara induk dan subclass.
- Draf kode `Ruang`, `Laptop`, dan `AlatLab`.
- Penjelasan langkah menjalankan tes sampai commit.
- Draf awal catatan ini.

## Prompt utama
1. Saya mengirim tautan repositori dosen dan meminta panduan mengerjakan
   tugas minggu 3 dari awal sampai commit.
2. Saya menempelkan isi `docs/minggu-03.md` (AI tidak bisa membuka folder
   `docs/` di GitHub).
3. Saya menempelkan isi `Aset.java`.
4. Saya menempelkan isi `Minggu03HierarkiTest.java`.
5. Saya meminta bantuan mengisi catatan ini.
[ISI: tambahkan prompt lain yang Anda ketik di luar percakapan ini, kalau ada.]

## Yang saya ubah atau tolak, dan alasannya
- Urutan parameter konstruktor awalnya hanya tebakan AI. Saya cocokkan dengan
  `Minggu03HierarkiTest` sebelum dipakai.
- Method `hitungDenda` dan `bisaDipinjam` di `Aset` saya biarkan karena itu
  tugas minggu 4 dan 5.
- [ISI: bagian lain yang Anda ubah sendiri dari draf AI, misalnya pesan error,
  nama field, atau keputusan memakai/tidak memakai `trim()`. Kalau Anda
  menyalin apa adanya, tulis jujur.]

## Yang sudah saya pahami
Saya bisa menjelaskan tanpa melihat AI: [ISI: hanya centang yang benar-benar
Anda pahami, misalnya alasan `super(...)` harus baris pertama, apa yang terjadi
kalau lupa memanggilnya, kenapa validasi `Aset` ikut berlaku di subclass,
dan bagaimana `getJenis()` bekerja pada `List<Aset>`.]
[Kalau ada bagian yang belum jelas, tulis jujur di sini.]
