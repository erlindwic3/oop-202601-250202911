# Catatan Minggu 06: UML dan SOLID

## Yang saya kerjakan
Saya membuat tiga dokumen UML: Class Diagram dalam format Mermaid yang menggambarkan seluruh kelas beserta atribut, method, visibilitas, dan relasi antar kelas; Sequence Diagram untuk skenario pengajuan peminjaman sukses dan bentrok menggunakan fragmen alt; serta dokumen solid.md yang menjelaskan tiga prinsip SOLID yang terlihat di kode.

## Keputusan desain
Saya memilih menunjukkan SRP pada KatalogAset, OCP pada hierarki Aset, dan DIP pada LayananDenda dengan AturanDenda. Diagram dibuat dengan Mermaid agar bisa dibaca langsung sebagai teks tanpa software tambahan.

## Kendala
Tidak ada kendala berarti. File solid.md sempat belum dibuat sehingga satu tes gagal, setelah file dibuat semua tes lulus.

## Penggunaan AI
- **Alat yang digunakan:** Claude (Anthropic).
- **Bagian yang dibantu AI:** Membantu memberikan gambaran alur sistem peminjaman aset, menyusun Class Diagram, Sequence Diagram, dan penjelasan prinsip SOLID.
- **Prompt utama:**
  1. Menjelaskan bagaimana alur proses peminjaman aset dalam sistem.
  2. Meminta bantuan membuat diagram UML dan penjelasan SOLID berdasarkan struktur kode program.
- **Hal yang saya ubah atau periksa dari hasil AI:** Saya memeriksa kembali hasil diagram dan penjelasan yang diberikan AI agar sesuai dengan struktur kelas, atribut, method, serta hubungan antar kelas dalam program. Saya juga memastikan penggunaan fragmen `alt` pada Sequence Diagram untuk menggambarkan kondisi peminjaman berhasil dan peminjaman bentrok.
- **Satu hal yang saya pahami lebih baik sekarang:** Saya lebih memahami cara menggambarkan hubungan antar kelas menggunakan UML, terutama perbedaan aggregation dan composition. Saya juga memahami bahwa penerapan DIP membuat program lebih mudah diuji karena dependensi dapat diganti dengan mock saat pengujian.
