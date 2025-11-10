# Laporan Praktikum Minggu 4 
Topik: Polymorphism
## Identitas
- Nama  : Cinta Alghumaidatul Affaf
- NIM   : 240202855
- Kelas : 3IKRA

---

## Tujuan

1. Mahasiswa mampu menjelaskan konsep polymorphism dalam OOP.
2. Mahasiswa mampu membedakan method overloading dan overriding.
3. Mahasiswa mampu mengimplementasikan polymorphism (overriding, overloading, dynamic binding) dalam program.
4. Mahasiswa mampu menganalisis contoh kasus polymorphism pada sistem nyata (Agri-POS).

---

## Dasar Teori
Polymorphism berarti “banyak bentuk” dan memungkinkan objek yang berbeda merespons panggilan method yang sama dengan cara yang berbeda.

- Overloading → mendefinisikan method dengan nama sama tetapi parameter berbeda.
- Overriding → subclass mengganti implementasi method dari superclass.
- Dynamic Binding → pemanggilan method ditentukan saat runtime, bukan compile time.

Dalam konteks Agri-POS, misalnya:

- Method getInfo() pada Produk dioverride oleh Benih, Pupuk, AlatPertanian untuk menampilkan detail spesifik.
- Method tambahStok() bisa dibuat overload dengan parameter berbeda (int, double).

---

## Langkah Praktikum

1. Overloading

  - Tambahkan method tambahStok(int jumlah) dan tambahStok(double jumlah) pada class Produk.

2. Overriding

  - Tambahkan method getInfo() pada superclass Produk.
  - Override method getInfo() pada subclass Benih, Pupuk, dan AlatPertanian.

3. Dynamic Binding

  - Buat array Produk[] daftarProduk yang berisi objek Benih, Pupuk, dan AlatPertanian.
  - Loop array tersebut dan panggil getInfo(). Perhatikan bagaimana Java memanggil method sesuai jenis objek aktual.

4. Main Class

  - Buat MainPolymorphism.java untuk mendemonstrasikan overloading, overriding, dan dynamic binding.

5. CreditBy

   - Tetap panggil CreditBy.print("<NIM>", "<Nama>").

6. Commit dan Push

   - Commit dengan pesan: week4-polymorphism.

---

## Kode Program

```java
package main.java.com.upb.agripos.model;

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
 
    @Override
    public void getInfo() {
        System.out.println("Produk: " + getNama() + " (Kode: " + getKode() + " Stok: " + getStok() + ") terbuat dari: " + material + " dengan harga: " + getHarga());
    }

}

```
```java
package main.java.com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }

    @Override
    public void getInfo() {
        System.out.println("Produk: " + getNama() + " (Kode: " + getKode() + " Stok: " + getStok() + ") varietas: " + varietas + " dengan harga: " + getHarga());
    }
}

```
```java
package main.java.com.upb.agripos.model;
// menambahkan  sub class obat hama
public class ObatHama extends Produk {
    private String targetHama;

    public ObatHama(String kode, String nama, double harga, int stok, String targetHama) {
        super(kode, nama, harga, stok);
        this.targetHama = targetHama;
    }

    public String getTargetHama() { return targetHama; }
    public void setTargetHama(String targetHama) { this.targetHama = targetHama; }

    
    @Override
    public void getInfo() {
        System.out.println("Produk: " + getNama() + " (Kode: " + getKode() + " Stok: " + getStok() + ") untuk hama: " + targetHama + " dengan harga: " + getHarga());
    }
}

```
```java
package main.java.com.upb.agripos.model;
// Produk.java

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }


    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    public void setKode(String kode) { this.kode = kode; }
    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(double harga) { this.harga = harga; }
    public void setStok(int stok) { this.stok = stok; }

    
    public void getInfo() {
        System.out.println("Produk: " + nama + " (Kode: " + kode + " Stok: " + stok + ") dengan harga: " + harga);
    }
    public void tampilInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);

}

}

```
```java
package main.java.com.upb.agripos.model;

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }

    public void deskripsi() {
        System.out.println("=== Pupuk ===");
        tampilInfo();
        System.out.println("Jenis: " + jenis);
        System.out.println("Keterangan: Pupuk ini membantu meningkatkan kesuburan tanah dan hasil panen.");
    }
}

```
```java
package main.java.com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\n=== Credit By ===");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
    }
}

```
```java
package main.java.com.upb.agripos;

import main.java.com.upb.agripos.model.AlatPertanian;
import main.java.com.upb.agripos.model.Benih;
import main.java.com.upb.agripos.model.ObatHama;
import main.java.com.upb.agripos.model.Pupuk;
import main.java.com.upb.agripos.model.Produk;
import main.java.com.upb.agripos.util.CreditBy;

public class MainPolymorphism {
    public static void main(String[] args) {
        Produk[] daftarProduk = {
            new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64"),
            new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea"),
            new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja"),
            new ObatHama("OBT-301", "Obat Hama Serangga", 50000, 20, "Serangga")
        };
// dynamic binding untuk menampilkan info produk
        for (Produk p : daftarProduk) {
            p.getInfo();
        }

        CreditBy.print("240202855", "Cinta Alghumaidatul Affaf");
    }
}

```

---

## Hasil Eksekusi
Sertakan screenshot hasil eksekusi program.  
![alt text](<Screenshot 2025-11-03 224228.png>)

---

## Analisis

- Jelaskan bagaimana kode berjalan.

Pada praktikum minggu ke-4 ini, program mengimplementasikan konsep polymorphism dalam pemrograman berorientasi objek. Polymorphism memungkinkan suatu metode memiliki banyak bentuk, sehingga objek-objek dari kelas turunan dapat memanggil metode dengan nama yang sama, tetapi memiliki perilaku yang berbeda.

Program diawali dengan membuat kelas induk Produk yang memiliki atribut umum seperti nama dan harga, serta metode tampilkanInfo().
Kemudian dibuat kelas turunan seperti Makanan, Minuman, atau Pakaian yang meng‐override metode tampilkanInfo() untuk menampilkan informasi spesifik sesuai jenis produk masing-masing.

Ketika program dijalankan, objek-objek dari kelas turunan disimpan dalam array atau list bertipe Produk. Saat dilakukan pemanggilan tampilkanInfo(), sistem secara otomatis menentukan metode mana yang dijalankan berdasarkan tipe objek sebenarnya. Inilah yang menunjukkan mekanisme dynamic binding atau polymorphism.  

- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya. 

Pada minggu sebelumnya (week 3), fokus praktikum adalah inheritance, yaitu pewarisan sifat dan atribut dari kelas induk ke kelas turunan. Setiap kelas turunan masih memanfaatkan metode dari kelas induk tanpa perubahan berarti.

Sedangkan pada minggu ini, fokusnya bergeser ke polymorphism, yaitu bagaimana kelas turunan dapat memodifikasi perilaku metode induk dengan cara overriding. Jadi kalau pada inheritance objek hanya “mewarisi” perilaku, pada polymorphism objek juga bisa mengubah cara kerja metode tersebut sesuai kebutuhan.
Selain itu, pada week 4 kita juga menggunakan referensi kelas induk untuk memanggil objek turunan, yang tidak dilakukan pada week 3.

- Kendala yang dihadapi dan cara mengatasinya.  

Beberapa kendala yang muncul selama praktikum antara lain:

1. Kesalahan dalam penulisan metode overriding, seperti lupa menambahkan anotasi @Override atau salah menulis parameter.
→ Diatasi dengan memeriksa kembali struktur metode dan memastikan nama serta tipe parameter sama persis dengan yang ada di kelas induk.

2. Pemahaman awal tentang konsep polymorphism yang masih membingungkan, terutama terkait perbedaan antara overloading dan overriding.
→ Diatasi dengan mencoba membuat contoh sederhana dari kedua konsep tersebut dan menjalankan program untuk melihat hasilnya secara langsung.

3. Kesalahan saat mengakses atribut khusus kelas turunan melalui referensi kelas induk.
→ Diatasi dengan melakukan type casting ke tipe objek sebenarnya saat diperlukan.

---

## Kesimpulan
Dari praktikum minggu ke-4 ini dapat disimpulkan bahwa konsep polymorphism memungkinkan satu nama metode memiliki berbagai perilaku yang berbeda tergantung pada objek yang memanggilnya. Melalui penerapan method overriding, setiap kelas turunan dapat menyesuaikan cara kerja metode yang diwarisi dari kelas induk tanpa mengubah struktur dasarnya.

Dengan polymorphism, program menjadi lebih fleksibel, mudah dikembangkan, serta mendukung prinsip reusability dan maintainability dalam pemrograman berorientasi objek. Praktikum ini juga membantu memahami perbedaan mendasar antara inheritance dan polymorphism, di mana inheritance berfokus pada pewarisan sifat, sedangkan polymorphism berfokus pada perbedaan perilaku dari metode yang sama.

---

## Quiz
1. Apa perbedaan overloading dan overriding?

  **Jawaban:**

  - Overloading terjadi ketika dua atau lebih metode memiliki nama yang sama tetapi parameter yang berbeda (jumlah atau tipe datanya berbeda) dalam satu kelas. Overloading dilakukan dalam kelas yang sama dan ditentukan saat compile time.

  - Overriding terjadi ketika kelas turunan membuat ulang metode dengan nama dan parameter yang sama seperti di kelas induk, tetapi dengan isi atau perilaku yang berbeda. Overriding ditentukan saat runtime sebagai bagian dari konsep polymorphism.

2. Bagaimana Java menentukan method mana yang dipanggil dalam dynamic binding?

   **Jawaban:**

   Java menentukan method yang dijalankan berdasarkan tipe objek sebenarnya saat program berjalan (runtime), bukan berdasarkan tipe referensinya.
   Artinya, meskipun referensi bertipe kelas induk (Produk) menunjuk ke objek kelas turunan (Makanan), method yang dipanggil tetaplah milik kelas turunan (Makanan).

3. Berikan contoh kasus polymorphism dalam sistem POS selain produk pertanian.
   **Jawaban:**

   Contoh penerapan polymorphism pada sistem POS (Point of Sale) bisa ditemukan pada kategori produk restoran:

    - Kelas induk: MenuItem
    - Kelas turunan: Makanan, Minuman, Dessert


   Masing-masing kelas turunan meng‐override metode tampilkanInfo() untuk menampilkan rincian berbeda, misalnya:


    - Makanan menampilkan kalori dan porsi,
    - Minuman menampilkan ukuran gelas dan tingkat gula,
    - Dessert menampilkan topping dan suhu penyajian.

   Dengan polymorphism, kasir cukup memanggil item.tampilkanInfo() tanpa harus tahu jenis produk yang sebenarnya — sistem akan otomatis menampilkan informasi sesuai tipe objeknya.
