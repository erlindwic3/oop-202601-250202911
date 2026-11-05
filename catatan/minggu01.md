# Catatan Minggu 01: Setup dan Implementasi Tiga Paradigma

## Yang saya kerjakan
Saya menyiapkan lingkungan kerja: fork repo template, clone, mengisi
`mahasiswa.properties` dengan NIM dan nama, serta memasang JDK 21 dan Maven.
Setelah itu saya melengkapi bagian `TODO` minggu 1 dengan tiga pendekatan
pemrograman, yaitu prosedural, berorientasi objek, dan fungsional, pada kasus
Aset-Pinjam. Saya menjalankan tes dengan `scripts/uji.ps1` sampai lulus, lalu
push ke GitHub dan CI berstatus hijau.

## Keputusan desain
Pada pendekatan prosedural, logika dipisah menjadi metode statis yang menerima
data sebagai parameter. Pada pendekatan berorientasi objek, data dan perilaku
disatukan dalam kelas dengan atribut private dan metode publik, sehingga
keadaan objek terlindungi. Pada pendekatan fungsional, saya memakai fungsi
tanpa efek samping dan tidak mengubah data yang sudah ada. Saya menjaga
ketiganya tetap sederhana agar perbedaan cara berpikirnya mudah dibandingkan.
Aturan yang tidak dijelaskan dosen saya catat di `docs/asumsi.md`.

## Kendala
Terminal masih memakai Java 25 padahal repo membutuhkan JDK 21. Saya
mengatasinya dengan memeriksa `JAVA_HOME` dan urutan `Path` di Environment
Variables, lalu memastikan `java -version` dan `mvn -v` menunjukkan versi 21.
Saya juga sempat salah mengetik perintah Git (`git add.` tanpa spasi), dan
sempat meng-commit pekerjaan minggu 2 sebelum minggu itu dibuka. Saya
mengembalikannya dengan `git reset --hard` ke commit minggu 1 lalu
`git push --force`, dan CI kembali hijau.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: setup lingkungan (versi Java, PATH, JAVA_HOME),
  perintah Git (add, commit, push, reset, force push), dan penyusunan format
  catatan ini
- Prompt utama:
# Catatan Minggu 01: Setup dan Implementasi Tiga Paradigma

## Yang saya kerjakan
Saya menyiapkan lingkungan kerja: fork repo template, clone, mengisi
`mahasiswa.properties` dengan NIM dan nama, serta memasang JDK 21 dan Maven.
Setelah itu saya melengkapi bagian `TODO` minggu 1 dengan tiga pendekatan
pemrograman, yaitu prosedural, berorientasi objek, dan fungsional, pada kasus
Aset-Pinjam. Saya menjalankan tes dengan `scripts/uji.ps1` sampai lulus, lalu
push ke GitHub dan CI berstatus hijau.

## Keputusan desain
Pada pendekatan prosedural, logika dipisah menjadi metode statis yang menerima
data sebagai parameter. Pada pendekatan berorientasi objek, data dan perilaku
disatukan dalam kelas dengan atribut private dan metode publik, sehingga
keadaan objek terlindungi. Pada pendekatan fungsional, saya memakai fungsi
tanpa efek samping dan tidak mengubah data yang sudah ada. Saya menjaga
ketiganya tetap sederhana agar perbedaan cara berpikirnya mudah dibandingkan.
Aturan yang tidak dijelaskan dosen saya catat di `docs/asumsi.md`.

## Kendala
Terminal masih memakai Java 25 padahal repo membutuhkan JDK 21. Saya
mengatasinya dengan memeriksa `JAVA_HOME` dan urutan `Path` di Environment
Variables, lalu memastikan `java -version` dan `mvn -v` menunjukkan versi 21.
Saya juga sempat salah mengetik perintah Git (`git add.` tanpa spasi), dan
sempat meng-commit pekerjaan minggu 2 sebelum minggu itu dibuka. Saya
mengembalikannya dengan `git reset --hard` ke commit minggu 1 lalu
`git push --force`, dan CI kembali hijau.

## Penggunaan AI
- Alat yang dipakai: Claude
- Bagian yang dibantu AI: setup lingkungan (versi Java, PATH, JAVA_HOME),
  perintah Git (add, commit, push, reset, force push), dan penyusunan format
  catatan ini
- Prompt utama:
  1. "Java sudah versi 21 tapi saat cek java version jadi versi 25, cara
     mengubahnya bagaimana"
  2. "Bagaimana menghapus commit minggu 2 agar kembali ke minggu 1 saja"
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI menyarankan
  `git revert` sebagai cara yang lebih aman, tetapi saya memilih
  `reset --hard` dan force push agar commit minggu 2 hilang dari `main`.
  Saya memastikan dulu `git status` bersih sehingga tidak ada pekerjaan
  yang hilang.
- Satu hal yang saya pahami lebih baik sekarang: perbedaan `git revert`
  dengan `git reset --hard`, serta bahwa `JAVA_HOME` dan urutan `Path`
  menentukan versi Java yang dipakai terminal.
- Yang saya ubah atau tolak dari saran AI, dan alasannya: AI menyarankan
  `git revert` sebagai cara yang lebih aman, tetapi saya memilih
  `reset --hard` dan force push agar commit minggu 2 hilang dari `main`.
  Saya memastikan dulu `git status` bersih sehingga tidak ada pekerjaan
  yang hilang.
- Satu hal yang saya pahami lebih baik sekarang: perbedaan `git revert`
  dengan `git reset --hard`, serta bahwa `JAVA_HOME` dan urutan `Path`
  menentukan versi Java yang dipakai terminal.