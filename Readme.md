# Homework 6 — My First Compose App

## Task 3: Colour and Spacing
- **Colour used:** `Color.LightGray`
- **Padding kept:** `24.dp`
- **What changed / what stayed the same:**
  Ketika mengubah dari `8.dp` ke `48.dp`, ruang di sekitar konten di dalam `Column` melebar secara signifikan, sehingga mendorong teks dan gambar lebih ke dalam dari tepi layar. Ukuran komponen teks dan gambar itu sendiri tidak berubah, begitu pula warna latar belakang `Surface` yang tetap memenuhi seluruh ukuran layar (`fillMaxSize`).

## Task 4: Build Error
- **First error message:**
  `Error: 'M' is not a valid file-based resource name character: File-based resource names must contain only lowercase a-z, 0-9, or underscores.`
- **Cause:**
  Aturan penamaan sumber daya Android mewajibkan seluruh file di dalam `res/drawable/` hanya menggunakan huruf kecil, angka, dan garis bawah. Nama file `My-Picture.png` menggunakan huruf kapital (`M`, `P`) serta tanda hubung (`-`), sehingga melanggar aturan penamaan Android Asset Packaging Tool (AAPT2).
- **Why other errors appear:**
  Karena nama sumber daya diproses terlebih dahulu untuk menghasilkan kelas `R.java`, kegagalan kompilasi sumber daya ini menyebabkan simbol seperti `R.drawable.my_picture` tidak terbentuk. Akibatnya, muncul error sekunder (seperti "unresolved reference: my_picture") pada file Kotlin yang mencoba mengacu pada ID sumber daya yang tidak ditemukan tersebut.
- **Fix:**
  Mengubah kembali nama file `My-Picture.png` menjadi `my_picture.png` di direktori `app/src/main/res/drawable/` dan memastikan kode mengacu pada `R.drawable.my_picture`.

## Task 5: Explore the Project
- **(a) MainActivity:** jalur `app/src/main/java/com/example/myfirstcomposeapp/MainActivity.kt` — Menentukan aktivitas utama tempat fungsi `setContent` menginisialisasi tata letak antarmuka pengguna Jetpack Compose.
- **(b) Gradle file:** jalur `app/build.gradle.kts` — Mengatur konfigurasi build tingkat modul, dependensi, versi target Android SDK, serta opsi kompilator Compose.
- **(c) Launcher image line:** `painter = painterResource(id = R.drawable.ic_launcher_foreground)` — Mengacu pada ID aset vektor bawaan yang berada di folder `res/drawable`.

## Task 6: Preview vs Run
Mengubah kode komposable akan memperbarui tampilan pratinjau (*preview*) di dalam kanvas desain Android Studio secara lokal melalui analisis dan penyajian kode statis. Namun, aplikasi yang berjalan di perangkat fisik atau emulator merupakan paket APK terkompilasi yang sudah terpasang dan berjalan pada proses *runtime* Android yang aktif. Untuk melihat perubahan pada perangkat, Android Studio harus mengompilasi ulang kode sumber, membangun kembali paket APK, serta memasang dan menjalankan ulang aplikasi pada lingkungan target (dengan menekan tombol **Run** atau pintasan `Shift + F10`).

## Task 7: Views vs Compose
1. Pada kerangka kerja **Views** imperatif tradisional, elemen antarmuka diinstansiasi sebagai objek berstatus (*stateful*). Mengubah tampilan memerlukan pencarian pohon komponen secara manual menggunakan `findViewById()` dan mengubah status internalnya secara langsung melalui metode *setter* (seperti `textView.setText(...)`). Sebaliknya, **Jetpack Compose** menggunakan pendekatan deklaratif, di mana antarmuka ditulis sebagai fungsi komposable yang mendeskripsikan tampilan berdasarkan status data tertentu. Ketika status data berubah, Compose secara otomatis melakukan rekomposisi pada fungsi yang terdampak untuk memperbarui tata letak tanpa manipulasi pandangan secara manual.

2.

| Composable | Package (from import) | Library layer |
|---|---|---|
| `Column` | `androidx.compose.foundation.layout.Column` | Foundation |
| `Text` | `androidx.compose.material3.Text` | Material 3 |
| `Image` | `androidx.compose.foundation.Image` | Foundation |