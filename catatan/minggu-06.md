# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat tiga dokumen UML: Class Diagram dalam format Mermaid yang menggambarkan seluruh kelas beserta atribut, method, visibilitas, dan relasi antar kelas; Sequence Diagram untuk skenario pengajuan peminjaman sukses dan bentrok menggunakan fragmen alt; serta dokumen solid.md yang menjelaskan tiga prinsip SOLID yang terlihat di kode.

## Keputusan desain
Saya memilih menunjukkan SRP pada KatalogAset, OCP pada hierarki Aset, dan DIP pada LayananDenda dengan AturanDenda. Diagram dibuat dengan Mermaid agar bisa dibaca langsung sebagai teks tanpa software tambahan.

## Kendala
Tidak ada kendala berarti. File solid.md sempat belum dibuat sehingga satu tes gagal, setelah file dibuat semua tes lulus.

## Penggunaan AI
- Alat yang dipakai: Claude (Anthropic)
- Bagian yang dibantu AI: seluruh isi class.mmd, sequence.mmd, dan solid.md
- Prompt utama:
  1. "mulai minggu 6 dari awal saya belum"
  2. AI langsung menghasilkan ketiga file sekaligus dalam format Mermaid
- Yang saya ubah atau tolak dari saran AI, dan alasannya: tidak ada penolakan, semua tes langsung lulus setelah file dibuat.
- Satu hal yang saya pahami lebih baik sekarang: Aggregation (o--) berarti objek bisa hidup tanpa pemiliknya, sedangkan composition (*--) berarti objek tidak bisa hidup tanpa pemiliknya. DIP meningkatkan testability karena dependensi bisa diganti dengan mock saat pengujian.
