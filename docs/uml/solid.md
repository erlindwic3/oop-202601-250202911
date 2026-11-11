# Prinsip SOLID di Kode Aset-Pinjam

## 1. Single Responsibility Principle (SRP)

**Kelas:** `KatalogAset`

`KatalogAset` hanya bertanggung jawab menyimpan dan mencari aset di memori. Ia tidak menghitung denda, tidak memvalidasi peminjaman, dan tidak menyimpan ke database. Setiap tanggung jawab lain diserahkan ke kelas lain (`LayananDenda`, `Aset`). Jika cara penyimpanan berubah (misalnya dari memori ke database), hanya `KatalogAset` yang perlu diubah.

## 2. Open/Closed Principle (OCP)

**Kelas:** `Aset`, `Ruang`, `Laptop`, `AlatLab`

`Aset` adalah abstract class yang terbuka untuk diperluas (open for extension) tetapi tertutup untuk dimodifikasi (closed for modification). Ketika jenis aset baru ditambahkan, cukup membuat subclass baru yang meng-override `hitungDenda()` dan `getJenis()` tanpa mengubah kelas `Aset` atau subclass yang sudah ada.

## 3. Dependency Inversion Principle (DIP)

**Kelas:** `LayananDenda`, `DendaFlat`, `DendaProgresif`

`LayananDenda` bergantung pada interface `AturanDenda`, bukan pada implementasi konkret `DendaFlat` atau `DendaProgresif`. Implementasi disuntikkan lewat konstruktor (dependency injection), sehingga aturan denda bisa diganti tanpa mengubah `LayananDenda`. Ini juga meningkatkan testability karena aturan denda bisa di-mock saat pengujian.