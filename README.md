\# CampusTasks



\## Deskripsi

CampusTasks merupakan project aplikasi pengelolaan tugas perkuliahan yang dibuat menggunakan Kotlin. Project ini berfokus pada penerapan domain model untuk mengatur data dan status tugas.



\## Domain Model



Project ini memiliki beberapa komponen utama:



\- \*\*Task\*\*: Menyimpan informasi tugas seperti ID, judul, deskripsi, prioritas, status, estimasi waktu, dan tags.

\- \*\*Identifiable\*\*: Interface yang digunakan untuk memberikan identitas berupa ID.

\- \*\*TaskPriority\*\*: Enum untuk menentukan prioritas tugas (LOW, MEDIUM, HIGH).

\- \*\*TaskStatus\*\*: Enum untuk menentukan status tugas (TODO, IN\_PROGRESS, DONE).

\- \*\*TaskFactory\*\*: Membuat objek Task dengan memeriksa validitas data.

\- \*\*TaskValidator\*\*: Memvalidasi judul dan estimasi waktu tugas.

\- \*\*TaskQueries\*\*: Menyediakan fungsi pencarian dan penyaringan tugas.

\- \*\*CreateTaskResult\*\*: Menyimpan hasil proses pembuatan tugas.



\## Aturan Validasi



1\. Judul tugas harus memiliki panjang 3 sampai 80 karakter.

2\. Estimasi waktu pengerjaan harus berada antara 5 sampai 480 menit.

3\. Judul dan deskripsi akan dibersihkan dari spasi berlebih.

4\. Tags akan diubah menjadi huruf kecil dan spasi berlebih dihapus.



\## Menjalankan Unit Test



Gunakan perintah berikut melalui terminal:



```bash

./gradlew test

```



Untuk Windows PowerShell:



```powershell

.\\gradlew test

```



\## Hasil Pengujian



Project telah menjalankan unit test dengan hasil BUILD SUCCESSFUL. Pengujian mencakup validasi tugas, pembuatan tugas, pencarian tugas, dan perubahan status tugas.



\## Refleksi



Melalui pengerjaan project CampusTasks, saya belajar memahami penerapan domain model menggunakan Kotlin. Saya juga mempelajari penggunaan data class, enum, interface, dan sealed interface dalam mengelola data tugas. Selain itu, saya memahami pentingnya validasi agar data yang dibuat sesuai dengan aturan yang telah ditentukan. Pembuatan TaskFactory membantu saya memisahkan proses pembuatan objek dari bagian lainnya, sedangkan TaskQueries memudahkan proses pencarian dan penyaringan data. Saya juga belajar membuat unit test untuk memastikan setiap fungsi berjalan sesuai harapan. Selama pengerjaan, saya menemukan beberapa kendala, terutama pada pengaturan Java dan Gradle. Dari kendala tersebut, saya belajar memeriksa konfigurasi lingkungan pengembangan dan memperbaiki kesalahan secara bertahap. Project ini membantu saya memahami bahwa kode program tidak hanya harus berjalan, tetapi juga perlu disusun dengan rapi, mudah dipahami, dan dapat diuji.


