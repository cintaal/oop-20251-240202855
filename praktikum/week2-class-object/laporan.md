# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: Class dan Object
## Identitas
- Nama  : Cinta Alghumaidatul Affaf
- NIM   : 240202855
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa memahami konsep class dan object di Java serta mampu mengimplementasikan enkapsulasi sederhana pada class Produk. Selain itu, mahasiswa dapat membuat program yang memanipulasi atribut objek (mis. menambah/ mengurangi stok) dan menampilkan informasi terkait.


---

## Dasar Teori
1. Class adalah cetak biru (blueprint) yang mendefinisikan properti (atribut) dan perilaku (method) suatu objek.

2. Object adalah instansiasi dari class; setiap object memiliki nilai atribut sendiri.

3. Enkapsulasi: akses ke atribut ditutup (private) dan diakses melalui getter/setter atau method publik untuk menjaga konsistensi.

4. Method dapat digunakan untuk memanipulasi state object (mis. tambahStok, kurangiStok).

Modularisasi: memecah kode ke beberapa file/class (mis. Produk, MainProduk, CreditBy) membuat program lebih rapi dan mudah dipelihara.

---

## Langkah Praktikum

1. Setup
   - Membuat proyek Java (Maven/Gradle atau simple folder dengan src/main/java).
   - Struktur paket: com.upb.agripos (sesuaikan IDE).

2. Coding
  - Buat class Produk untuk merepresentasikan produk (kode, nama, harga, stok) dengan enkapsulasi.
  - Buat class CreditBy untuk menampilkan identitas pembuat.
  - Buat MainProduk (dengan method main) yang menginstansiasi beberapa Produk, memanggil method untuk menambah/kurangi stok, dan menampilkan hasil.

3. Run
  - Kompilasi dan jalankan program di IDE (contoh: Run MainProduk).
  - Periksa output pada terminal.

4. File / kode yang dibuat
    - Produk.java
    - CreditBy.java
    - MainProduk.java

5. Contoh commit message yang digunakan
   - feat: add Produk class with stok methods
   - feat: add MainProduk demo and CreditBy

---

## Kode Program

```java
// Produk.java
package main.java.com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    // Constructor
    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter dan Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    // Method tambahan untuk stok
    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}


```
```java
//CreaditBy.java
package main.java.com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + nim + " - " + nama);
    }
}
```

```java
//MainProduk.java
package main.java.com.upb.agripos;

import main.java.com.upb.agripos.model.Produk;
import main.java.com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        // Instansiasi 3 produk pertanian
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        // Tampilkan informasi produk
        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tambahkan sedikit simulasi stok
        System.out.println("\nMenambah stok Benih Padi IR64 sebanyak 20...");
        p1.tambahStok(20);
        System.out.println("Stok baru: " + p1.getStok());

        System.out.println("Mengurangi stok Pupuk Urea sebanyak 5...");
        p2.kurangiStok(5);
        System.out.println("Stok baru: " + p2.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("240202855", "Cinta Alghumaidatul Affaf");
    }
}
```

## Hasil Eksekusi
class objek
<img width="1511" height="888" alt="classobjek" src="https://github.com/user-attachments/assets/4c30c444-197b-4555-b5a5-74a9d3ae8468" />

---

## Analisis
1.  Jelaskan bagaimana kode berjalan.

     Program membuat tiga objek Produk. Untuk p1 (Benih Padi) dipanggil tambahStok(20) sehingga stok awal 100 menjadi 120. Untuk p2 (Pupuk Urea) dipanggil kurangiStok(5) sehingga stok 40 menjadi 35. Method getStok() digunakan untuk menampilkan stok terbaru. CreditBy.print hanya menampilkan identitas pembuat.

2. Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.
   
   Minggu ini fokus pada pembuatan class yang memiliki state dan behavior, serta manipulasi state melalui method. Jika minggu sebelumnya masih memakai program prosedural (semua di main tanpa class terpisah), sekarang struktur menjadi lebih modular dan mengikuti prinsip OOP sederhana.
   
3. Kendala yang dihadapi dan cara mengatasinya.

  - kendala: Penulisan paket/struktur folder kadang membuat IDE menampilkan error “package mismatch” bila file tidak diletakkan di folder yang sesuai.
   Solusi: Pastikan struktur folder sesuai dengan deklarasi package (mis. src/main/java/com/upb/agripos/Produk.java).

  - Kendala: Validasi pada pengurangan stok (agar tidak negatif).
     Solusi: Tambahkan pengecekan di kurangiStok untuk menolak pengurangan yang membuat stok < 0.

---

## Kesimpulan
Dengan implementasi class Produk dan penggunaan object di MainProduk, program menjadi lebih terstruktur, mudah dibaca, dan gampang dikembangkan (mis. menambah method baru seperti restock atau cekKetersediaan). Enkapsulasi memastikan atribut hanya diakses/diubah melalui method yang sudah tervalidasi, sehingga mengurangi bug seperti stok negatif.

---

## Quiz
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
