# Catatan Minggu 05: Abstraction

## Yang saya kerjakan
Saya mengubah `Aset` menjadi abstract class dan mengisi method `bisaDipinjam()` yang sebelumnya masih TODO. Method `getJenis()` dan `hitungDenda()` dijadikan abstract sehingga tiap subclass wajib mengimplementasikannya. Selain itu saya mengimplementasikan `DendaFlat` yang memanggil langsung `aset.hitungDenda(hari)`, dan `DendaProgresif` dengan rumus bertingkat: 5 hari pertama tarif normal, hari berikutnya tarif x1.5.

## Keputusan desain
`DendaProgresif` menggunakan loop per hari dengan multiplier 1.5x setelah hari ke-5. Rumus ini memenuhi semua syarat tes: 0 hari = 0, tidak lebih murah dari flat, tidak turun saat hari bertambah, dan hari ke-30 lebih mahal dari flat. Rumus dicatat di docs/asumsi.md.

## Kendala
Tidak ada kendala berarti di minggu ini. Perubahan `Aset` menjadi abstract langsung berjalan karena ketiga subclass sudah mengoverride `hitungDenda` dan `getJenis` dari minggu sebelumnya.

## Penggunaan AI
- Alat yang dipakai: Claude (Anthropic)
- Bagian yang dibantu AI: perubahan `Aset` menjadi abstract, implementasi `DendaFlat` dan `DendaProgresif`
- Prompt utama:
 1. Bagaimana cara mengubah class Aset menjadi abstract class pada Java?
 2. Bagaimana cara mengimplementasikan class DendaFlat dan DendaProgresif menggunakan konsep abstraction?
 3. Bagaimana cara menerapkan abstract method agar dapat diimplementasikan oleh subclass?
 4. Bagaimana cara membedakan penggunaan abstract class dan interface dalam pemrograman berorientasi objek?
- Satu hal yang saya pahami lebih baik sekarang: Abstract class bisa punya field dan method konkret, sedangkan method abstract memaksa subclass untuk mengimplementasikannya sendiri. Ini berbeda dengan interface yang semua method-nya harus diimplementasikan.