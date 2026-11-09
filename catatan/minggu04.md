# Catatan Minggu 04: Polymorphism

## Yang saya kerjakan
Saya mengimplementasikan polymorphism dengan meng-override method `hitungDenda(int)` di tiga subclass: `Ruang` (multiplier 1x), `Laptop` (2x), dan `AlatLab` (4x). Tarif dasar diambil dari `Varian.aktif().dendaPerHari`. Selain itu saya menambahkan dua overload method `cari` di `KatalogAset`: satu yang mencari berdasarkan kata kunci saja, dan satu lagi yang juga memfilter berdasarkan jenis aset.

## Keputusan desain
Validasi hari negatif (`IllegalArgumentException`) diletakkan di tiap subclass agar setiap class bertanggung jawab atas inputnya sendiri. Method `cari(String kata)` menggunakan `toLowerCase()` di kedua sisi agar pencarian tidak membedakan huruf besar dan kecil. Method `cari(String kata, JenisAset jenis)` memanggil `cari(kata)` terlebih dahulu lalu memfilter hasilnya berdasarkan jenis, sehingga logika pencarian tidak duplikat.

## Kendala
File tes dari dosen memanggil konstruktor `Ruang` dengan 3 parameter, sementara saya sempat menambahkan parameter `lokasi` yang tidak ada di versi asli dosen. Setelah mengambil file asli dari repo upstream dan menyesuaikan kembali, semua tes berhasil lulus.

## Penggunaan AI
- Alat yang dipakai: Claude (Anthropic)
- Bagian yang dibantu AI: kerangka method `hitungDenda` di tiap subclass, kerangka dua overload `cari` di `KatalogAset`
- Prompt utama:
  1. "Analisis apa saja yang harus saya kerjakan di minggu 4"
  2. "run pake mvn week4" (untuk membaca error dan memperbaiki kode)
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI sempat menambahkan field `lokasi` di `Ruang` yang tidak ada di file asli dosen. Saya menolak perubahan itu dan kembali ke konstruktor 3 parameter sesuai file asli.
- Satu hal yang saya pahami lebih baik sekarang: Overriding membuat method yang sama dipanggil dengan hasil berbeda tergantung tipe objek saat runtime (dynamic binding), sedangkan overloading membuat method dengan nama sama tetapi parameter berbeda di class yang sama.
