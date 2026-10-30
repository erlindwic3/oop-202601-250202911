# Minggu 2: Struktur OOP: Class, Object, Encapsulation

## Yang saya kerjakan

Di minggu 2 saya mengerjakan dan melengkapi file 'Aset.java', yaitu class yang mewakili aset yang bisa dipinjam (ruang, laptop, alat lab) yang mencangkyp 4 filed private yaitu kode, status, dan kondisi. konstruktor dengan validasi, getter, dan setter untuk nama, status, dan kondisi.
Tes: 'Minggu02AsetTest' , hasil [LOLOS / ada yang gagal]

## Keputusan dan asumsi

Huruf besar dan kecil tidak saya ubah karena saya tidak ingin class mengubah
data yang dimasukkan tanpa sepengetahuan pemanggil. Kalau kode "lab-01"
dimasukkan, `getKode()` tetap mengembalikan "lab-01". Selain itu, aturan dari
dosen hanya meminta kode tidak null atau kosong, bukan diseragamkan hurufnya.

## Kendala

Kendala yang saya alami saat mengerjakan tugas minggu 2 adalah tadi sempat muncul pesan error `WSL ... execvpe(/bin/bash) failed: No such file or
   directory`. Penyebabnya, WSL di laptop saya belum punya distro Linux,
   jadi perintah `bash` tidak bisa jalan. Solusinya, saya memakai skrip
   untuk Windows, yaitu `.\scripts\uji.ps1`, dan skrip itu berhasil jalan.
## Penggunaan AI

- Kerangka isi `Aset.java`: 4 field private, konstruktor dengan validasi,
  getter, setter, dan method `validasiTeks`.
- Penjelasan langkah mengerjakan minggu 2 dan cara menjalankan tes di
  Windows (`.\scripts\uji.ps1`).
- Penjelasan penyebab error WSL dan hasil tes yang masih menjalankan minggu 1.
- Kerangka dan isi awal catatan ini.

## Prompt utama
1. "Minggu 2: Struktur OOP: Class, Object, Encapsulation ... SEKARANG FOKUS
   KE MINGGU 2" (saya menempelkan isi tugas dari `docs/minggu-02.md`).
2. "Mana saja yang harus saya salin dan saya harus nyalin dimana, tuntun saya
   untuk mengerjakan minggu 2".
3. Saya menempelkan isi `Aset.java` asli supaya kodenya disesuaikan.
4. Saya menempelkan error WSL dan hasil `uji.ps1`, lalu bertanya penyebabnya.
5. Saya meminta bantuan mengisi bagian laporan: keputusan, kendala, dan
   penggunaan AI.
[Tambahkan prompt lain yang Anda ketik di luar percakapan ini.]

## Yang saya ubah atau tolak, dan alasannya
- AI awalnya menebak nama enum `KondisiAset`. Setelah saya tempelkan
  `Aset.java` asli, namanya ternyata `Kondisi`, jadi saya sesuaikan.
- AI menyarankan `bash scripts/uji.sh`, tetapi di laptop saya gagal karena
  WSL belum punya distro Linux. Saya memakai `.\scripts\uji.ps1`.
- Saya memilih `trim()` tanpa mengubah huruf besar/kecil. Alasannya ada di
  bagian Keputusan dan asumsi.
- Method untuk minggu 3, 4, dan 5 (`getJenis`, `hitungDenda`,
  `bisaDipinjam`) saya biarkan karena belum waktunya.
- [Tulis bagian lain yang Anda ubah sendiri dari saran AI, kalau ada.]

## Yang sudah saya pahami
Saya bisa menjelaskan tanpa melihat AI: alur konstruktor dan validasinya,
kenapa `kode` dibuat `final` tanpa setter, dan kenapa validasi dipusatkan di
satu method. [Kalau ada bagian yang belum jelas, tulis jujur di sini.]
