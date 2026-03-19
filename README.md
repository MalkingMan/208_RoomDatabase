# 📚 Room Database — Manajemen Data Siswa

Aplikasi Android sederhana untuk mengelola data siswa menggunakan **Jetpack Compose** dan **Room Database**. Aplikasi ini menerapkan arsitektur **MVVM (Model-View-ViewModel)** dengan pola **Repository** untuk pengelolaan data lokal secara persisten.

---

## 📸 Tampilan Aplikasi

<p align="center">
  <img width="227" height="467" alt="Tampilan Aplikasi" src="https://github.com/user-attachments/assets/84439285-f4ce-4b3b-8c69-bcd3d0c5daf1" />
</p>

---

## ✨ Fitur

- ➕ **Tambah Siswa** — Menambahkan data siswa baru (nama, alamat, nomor telepon)
- �� **Daftar Siswa** — Menampilkan seluruh data siswa yang tersimpan
- 🔍 **Detail Siswa** — Melihat detail lengkap data seorang siswa
- ✏️ **Edit Siswa** — Memperbarui data siswa yang sudah ada
- 🗑️ **Hapus Siswa** — Menghapus data siswa dari database

---

## 🛠️ Teknologi yang Digunakan

| Teknologi | Keterangan |
|---|---|
| **Kotlin** | Bahasa pemrograman utama |
| **Jetpack Compose** | UI toolkit modern untuk Android |
| **Room Database** | Abstraksi SQLite untuk penyimpanan data lokal |
| **ViewModel** | Mengelola state UI dan logika bisnis |
| **Kotlin Flow** | Reactive stream untuk observasi data dari Room |
| **Navigation Compose** | Navigasi antar layar |
| **KSP** | Kotlin Symbol Processing untuk Room compiler |
| **Material Design 3** | Komponen dan tema UI |

---

## 🏗️ Arsitektur Aplikasi

Aplikasi ini menggunakan arsitektur **MVVM** dengan pola **Repository**:

```
UI Layer (View)
    │
    ▼
ViewModel Layer
    │
    ▼
Repository Layer
    │
    ▼
Room Database (DAO + Entity)
```

### Struktur Package

```
com.example.roomdatabase/
├── room/
│   ├── Siswa.kt                   # Entity (tabel tblSiswa)
│   ├── SiswaDao.kt                # Data Access Object
│   └── DatabaseSiswa.kt           # Room Database instance
│
├── repositori/
│   ├── RepositoriSiswa.kt         # Interface repository
│   ├── OfflineRepositoriSiswa.kt  # Implementasi repository (lokal)
│   └── ContainerApp.kt            # Dependency Injection container
│
├── viewmodel/
│   ├── HomeViewModel.kt           # ViewModel halaman daftar siswa
│   ├── EntryViewModel.kt          # ViewModel halaman tambah siswa
│   ├── DetailViewModel.kt         # ViewModel halaman detail siswa
│   └── provider/
│       └── PenyediaViewModel.kt   # ViewModelProvider.Factory
│
├── view/
│   ├── HalamanHome.kt             # Layar daftar siswa
│   ├── HalamanEntry.kt            # Layar tambah siswa
│   ├── HalamanDetailSiswa.kt      # Layar detail & hapus siswa
│   ├── AppBar.kt                  # Komponen top app bar
│   ├── route/                     # Destinasi navigasi
│   └── uicontroller/
│       └── PetaNavigasi.kt        # NavHost & navigasi graph
│
└── MainActivity.kt                # Entry point aplikasi
```

---

## 🗄️ Skema Database

### Tabel `tblSiswa`

| Kolom | Tipe | Keterangan |
|---|---|---|
| `id` | `INTEGER` | Primary Key (auto-increment) |
| `nama` | `TEXT` | Nama lengkap siswa |
| `alamat` | `TEXT` | Alamat siswa |
| `telepon` | `TEXT` | Nomor telepon siswa |

---

## 🚀 Cara Menjalankan Proyek

### Prasyarat
- **Android Studio** Hedgehog (2023.1.1) atau lebih baru
- **JDK 11** atau lebih baru
- **Android SDK** API Level 33+
- Perangkat/emulator Android dengan API Level 33 ke atas

### Langkah-langkah

1. **Clone repository ini:**
   ```bash
   git clone https://github.com/MalkingMan/208_RoomDatabase.git
   ```

2. **Buka proyek di Android Studio:**
   - Pilih `File` → `Open` → pilih folder proyek

3. **Sinkronisasi Gradle:**
   - Klik `Sync Now` ketika muncul notifikasi, atau
   - Pilih `File` → `Sync Project with Gradle Files`

4. **Jalankan aplikasi:**
   - Pilih emulator atau hubungkan perangkat Android
   - Klik tombol **Run** ▶️ atau tekan `Shift + F10`

---

## 📦 Dependensi Utama

```kotlin
// Jetpack Compose BOM
implementation(platform(libs.androidx.compose.bom))

// Room Database
implementation(libs.room.runtime)
implementation(libs.room.ktx)
ksp(libs.room.compiler)

// ViewModel & Lifecycle
implementation(libs.lifecycle.viewmodel.compose)
implementation(libs.lifecycle.runtime.compose)

// Navigation
implementation(libs.navigation.compose)

// Material Icons
implementation(libs.compose.icons)
```

---

## 👤 Informasi Pengembang

| | |
|---|---|
| **Nama** | MalkingMan |
| **Repository** | [208_RoomDatabase](https://github.com/MalkingMan/208_RoomDatabase) |

---

<p align="center">Dibuat dengan ❤️ menggunakan Kotlin & Jetpack Compose</p>
