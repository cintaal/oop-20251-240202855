# Laporan Praktikum Minggu 3 
Topik: Inheritance

## Identitas
- Nama  : Cinta Alghumaidatul Affaf
- NIM   : 240202855
- Kelas : 3IKRA

---

## Tujuan
Mahasiswa mampu menjelaskan konsep inheritance (pewarisan class) dalam OOP.
Mahasiswa mampu membuat superclass dan subclass untuk produk pertanian.
Mahasiswa mampu mendemonstrasikan hierarki class melalui contoh kode.
Mahasiswa mampu menggunakan super untuk memanggil konstruktor dan method parent class.
Mahasiswa mampu membuat laporan praktikum yang menjelaskan perbedaan penggunaan inheritance dibanding class tunggal.

---

## Dasar Teori
 
Inheritance adalah mekanisme dalam OOP yang memungkinkan suatu class mewarisi atribut dan method dari class lain.

1. Superclass: class induk yang mendefinisikan atribut umum.
2. Subclass: class turunan yang mewarisi atribut/method superclass, dan dapat menambahkan atribut/method baru.
3. super digunakan untuk memanggil konstruktor atau method superclass.

Dalam konteks Agri-POS, kita dapat membuat class Produk sebagai superclass, kemudian Benih, Pupuk, dan AlatPertanian sebagai subclass. Hal ini membuat kode lebih reusable dan terstruktur.


---

## Langkah Praktikum

1. Membuat Superclass Produk
    - Gunakan class Produk dari Bab 2 sebagai superclass.

2. Membuat Subclass
    - Benih.java → atribut tambahan: varietas.
    - Pupuk.java → atribut tambahan: jenis pupuk (Urea, NPK, dll).
    - AlatPertanian.java → atribut tambahan: material (baja, kayu, plastik).

3. Membuat Main Class
    - Instansiasi minimal satu objek dari tiap subclass.
    - Tampilkan data produk dengan memanfaatkan inheritance.

4. Menambahkan CreditBy
    - Panggil class CreditBy untuk menampilkan identitas mahasiswa.

5. Commit dan Push
    - Commit dengan pesan: week3-inheritance.

---

## Kode Program 

```java
package com.upb.agripos.model;
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

    /**
     * 
     */
    public void tampilInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Stok: " + stok);

}

}
```
```java
package com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }

    public void deskripsi() {
        System.out.println("=== Benih ===");
        tampilInfo();
        System.out.println("Varietas: " + varietas);
        System.out.println("Keterangan: Benih ini cocok untuk berbagai jenis lahan dan tahan terhadap hama.");
    }
}
```
```java
package com.upb.agripos.model;

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
package com.upb.agripos.model;

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

        public void deskripsi() {
        System.out.println("=== Alat Pertanian ===");
        tampilInfo();
        System.out.println("Material: " + material);
        System.out.println("Keterangan: Alat pertanian ini terbuat dari material kuat dan tahan lama.");
    }

}
```
```java
package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\n=== Credit By ===");
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
    }
}

```
```java
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainInheritance {
    public static void main(String[] args) {
        Benih b = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk p = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian a = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        b.deskripsi();
        System.out.println();
        p.deskripsi();
        System.out.println();
        a.deskripsi();
        System.out.println();

        CreditBy.print("240202855", "Cinta Alghumaidatul Affaf");
    }
}
```


---

## Hasil Eksekusi
1. produk java
<img width="1732" height="1042" alt="Produkjava" src="https://github.com/user-attachments/assets/9dac0180-9fd8-45a6-9822-be5617a7394e" />
2. Pupuk
   <img width="1435" height="756" alt="Pupukjava" src="https://github.com/user-attachments/assets/45bd6122-a7e2-473d-8bf5-5e8c105890bc" />
3. Benih
   <img width="1506" height="664" alt="Benihjava" src="https://github.com/user-attachments/assets/4f57d76c-4b55-454f-bc07-a9181270f3a2" />
4. Alat Pertanian
   <img width="1433" height="773" alt="AlatPertanian" src="https://github.com/user-attachments/assets/49e0e954-1327-45ac-b7d7-85b0e124e7cf" />
5. Credit By
   <img width="1046" height="494" alt="CreditBy" src="https://github.com/user-attachments/assets/deb999de-90f2-491d-84d0-2776a98ffad2" />
6. Main inheritance
   <img width="1496" height="733" alt="MainInheritance" src="https://github.com/user-attachments/assets/54d58f8c-a106-4f32-9ea2-5c482475039b" />




---

## Analisis
- Jelaskan bagaimana kode berjalan.
  
  Pada program ini, konsep inheritance diterapkan melalui kelas Produk sebagai superclass yang berisi atribut umum seperti kode, nama, harga, dan stok. Kelas Pupuk, Benih, dan AlatPertanian menjadi subclass yang mewarisi atribut dan metode dari Produk.
  Masing-masing subclass menambahkan atribut atau perilaku khusus sesuai jenis produknya. Misalnya, Pupuk memiliki atribut tambahan seperti jenisPupuk, sedangkan Benih mungkin menambahkan jenisTanaman. Pada kelas MainInheritance, objek-objek dari masing-masing subclass dibuat dan dipanggil untuk menampilkan data produk.
  Proses ini menunjukkan bagaimana pewarisan memungkinkan penggunaan ulang kode dan mempermudah pengelolaan data yang memiliki karakteristik serupa. 
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.

   Minggu sebelumnya, setiap jenis produk masih dibuat secara terpisah tanpa hubungan antar kelas. Pendekatan itu membuat kode menjadi panjang dan berulang karena setiap kelas memiliki atribut dan metode yang sama.
Minggu ini, dengan konsep pewarisan, kode menjadi lebih terstruktur dan efisien. Atribut dan metode umum cukup ditulis sekali di kelas induk (Produk), lalu digunakan kembali di semua kelas turunan. Ini menunjukkan penerapan prinsip reusability dan modularity dalam pemrograman berorientasi objek.
- Kendala yang dihadapi dan cara mengatasinya.

  Kendala yang sempat muncul adalah kesalahan dalam pemanggilan konstruktor super() pada subclass, sehingga atribut dari kelas induk tidak terbaca. Selain itu, terkadang terjadi error saat mencoba mengakses atribut private dari kelas induk.
Cara mengatasinya adalah dengan menggunakan access modifier protected agar atribut dapat diakses oleh subclass, serta memastikan setiap konstruktor subclass memanggil konstruktor superclass menggunakan super(...). Setelah diperbaiki, program berjalan dengan baik dan semua objek dapat menampilkan data produknya.

---

## Kesimpulan

Dengan menerapkan konsep inheritance, program menjadi lebih efisien, terstruktur, dan mudah dikembangkan. Kelas induk dapat digunakan kembali oleh beberapa kelas turunan tanpa perlu menulis ulang kode yang sama. Hal ini memperlihatkan manfaat utama pemrograman berorientasi objek, yaitu reusability dan kemudahan dalam pemeliharaan kode.

---

## Quiz
1. Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
   
   **Jawaban:**
Keuntungan menggunakan inheritance adalah kode menjadi lebih efisien, terstruktur, dan mudah dikelola. Atribut dan metode yang sama cukup ditulis sekali di kelas induk, kemudian diwariskan ke kelas turunan. Dengan begitu, program lebih hemat kode (code reusability), lebih mudah dikembangkan, dan meminimalkan duplikasi yang bisa menyebabkan kesalahan saat pemeliharaan.  
  
2. Bagaimana cara subclass memanggil konstruktor superclass?
   
   **Jawaban:**
   Subclass dapat memanggil konstruktor superclass dengan menggunakan kata kunci super(...) di dalam konstruktor subclass. Pemanggilan ini harus dilakukan di baris pertama konstruktor agar atribut dari superclass dapat diinisialisasi dengan benar.

3. Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.  

    **Jawaban:**
   Contoh lain yang bisa dijadikan subclass adalah ObatTanaman.
Kelas ini dapat mewarisi atribut umum dari Produk seperti kode, nama, harga, dan stok, lalu menambahkan atribut khusus seperti jenisHama atau dosisPemakaian.
