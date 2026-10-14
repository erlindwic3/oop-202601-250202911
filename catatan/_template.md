# Catatan Minggu 01: Paradigma Pemrograman dan Setup

## Yang saya kerjakan

Saya mengimplementasikan tiga gaya pemrograman (prosedural, OOP, dan fungsional) dalam tiga kelas Java terpisah untuk sistem Aset-Pinjam. Ketiganya menghasilkan sapaan yang memuat "Aset-Pinjam", nama, dan NIM dengan format yang sama. Saya juga menyiapkan lingkungan pengembangan dengan JDK 21, Maven, dan Git, serta mengisi mahasiswa.properties dengan data diri.

## Keputusan desain

Saya memilih format sapaan "Aset-Pinjam | nama | nim" agar konsisten di ketiga gaya sesuai yang diuji oleh Minggu01Test. Untuk gaya fungsional, saya menggunakan Function<String, String> dengan closure yang menangkap nim dari parameter luar sehingga tidak ada state yang berubah.

## Kendala

File pom.xml di root memiliki karakter ekstra ("erlin") setelah tag </project> yang menyebabkan Maven gagal membaca proyek. Saya mengatasinya dengan membuka pom.xml di VS Code dan menghapus karakter tersebut. Selain itu, execution policy PowerShell perlu diatur agar scripts\uji.ps1 bisa dijalankan.

## Penggunaan AI

- Alat yang dipakai: Claude
- Bagian yang dibantu AI: HelloProsedural.sapa, HelloOOP (field dan konstruktor), HelloFungsional.pembuatSapaan
- Prompt utama:
  1. "implementasi HelloFungsional.pembuatSapaan menggunakan lambda"
  2. "format sapaan tidak konsisten, tes mengharapkan Aset-Pinjam | nama | nim"
- Yang saya ubah atau tolak dari saran AI: format sapaan awal HelloProsedural berbeda ("Hello Aset-Pinjam, saya nama (nim)"), saya ubah setelah melihat hasil tes
- Satu hal yang saya pahami lebih baik sekarang: perbedaan nyata antara gaya fungsional dan OOP — fungsional menghindari state dengan closure, OOP membungkus state dalam field private
