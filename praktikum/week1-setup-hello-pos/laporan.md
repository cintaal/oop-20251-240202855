# Laporan Praktikum Minggu 1 
Topik: Perbedaan Paradigma Pemrograman: Prosedural, OOP, dan Fungsional di Java
## Identitas
- Nama  : Cinta Alghumaidatul Affaf
- NIM   : 240202855
- Kelas : 3IKRA

---

## Tujuan
1. Mahasiswa memahami perbedaan paradigma pemrograman prosedural, berorientasi objek, dan fungsional dalam Java.
2. Mahasiswa dapat mengimplementasikan program sederhana menggunakan pendekatan prosedural dengan method.
3. Mahasiswa mampu membuat program berbasis OOP dengan memanfaatkan class, object, atribut, dan method.
4. Mahasiswa mengenal konsep functional programming di Java dengan memanfaatkan functional interface   seperti BiConsumer.
5. Mahasiswa mampu membandingkan hasil keluaran dari ketiga pendekatan untuk memahami kelebihan dan kekurangan masing-masing paradigma.

---

<<<<<<< HEAD
## Dasar Teori
1. Pemrograman Prosedural adalah paradigma yang berfokus pada urutan langkah atau prosedur dalam menyelesaikan suatu masalah. Program disusun berdasarkan fungsi atau prosedur yang dijalankan secara berurutan.
2. Pemrograman Berorientasi Objek (OOP) berfokus pada objek yang memiliki atribut (data) dan method (perilaku). Konsep utama OOP meliputi class, object, encapsulation, inheritance, dan polymorphism.  
3. Class merupakan blueprint atau cetak biru dari objek yang mendefinisikan atribut dan method.
4. Functional Programming di Java memanfaatkan konsep lambda expression dan functional interface seperti Consumer, BiConsumer, atau Function untuk menulis kode yang lebih ringkas dan deklaratif.
5. Paradigma fungsional memungkinkan pemrosesan data dengan cara yang lebih ekspresif dan mengurangi boilerplate code dibandingkan pendekatan prosedural atau OOP.
=======
## Dasar Teori 
1. Pemrograman Prosedural adalah paradigma yang berfokus pada urutan langkah atau prosedur dalam menyelesaikan suatu masalah. Program disusun berdasarkan fungsi atau prosedur yang dijalankan secara berurutan.
2. Pemrograman Berorientasi Objek (OOP) berfokus pada objek yang memiliki atribut (data) dan method (perilaku). Konsep utama OOP meliputi class, object, encapsulation, inheritance, dan polymorphism.
3. Class merupakan blueprint atau cetak biru dari objek yang mendefinisikan atribut dan method.
4. Functional Programming di Java memanfaatkan konsep lambda expression dan functional interface seperti Consumer, BiConsumer, atau Function untuk menulis kode yang lebih ringkas dan deklaratif.
5. Paradigma fungsional memungkinkan pemrosesan data dengan cara yang lebih ekspresif dan mengurangi boilerplate code dibandingkan pendekatan prosedural atau OOP.

>>>>>>> afe9b13449b14a00a14a6ea158fe6becd1f9b54d
---

## Langkah Praktikum
 1. Membuat folder praktikum di dalam proyek Java.

 2. Membuat tiga file Java:
    - HelloProcedural.java (paradigma prosedural)
    - HelloOOP.java (paradigma berorientasi objek)
    - HelloFunctional.java (paradigma fungsional)
   
 3. Menulis kode sesuai paradigma masing-masing.
 
 4. Melakukan kompilasi dan menjalankan program menggunakan Visual Studio        Code.

 5. Mengecek hasil output di terminal untuk memastikan program berjalan          dengan benar.
    
---

## Kode Program

```java
// HelloProcedural.java
public class HelloProcedural {
    public static void main(String[] args) {

        String nim = "240202855";
        String nama = "Cinta Alghumaidatul Affaf";

          // Prosedural dengan method
            PANGGIL("Cinta Alghumaidatul Affaf", "2402022855");
         // Bisa dipanggil secara berulang

 // Method 
    System.out.println("Hello World, I am " + nama + ", " + nim);
    }
}

```

```java
// HelloOOP.java
package praktikum;

class Mahasiswa {
    String nama;
    int nim;

    Mahasiswa(String m, int n) {
        this.nama = m;
        this.nim = n;
    }

    void sapa() {
        System.out.println("Hallo World, I am " + nama + ", " + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Cinta Alghumaidatul Affaf", 240202855);
        mhs.sapa();
    }
}

```
```java
// HelloFunctional.java
package praktikum;
import java.util.function.BiConsumer;

public class HelloFunctional {
    public static void main(String[] args) {
        BiConsumer<String, Integer> sapa = (nama, nim) -> 
            System.out.println("Hallo World, I am " + nama + ", " + nim);

        sapa.accept("Cinta Alghumaidatul Affaf", 240202855);
    }
}

```
---

## Hasil Eksekusi 
![HelloFunctional]<img width="1747" height="775" alt="HelloFunctional" src="https://github.com/user-attachments/assets/4c3981ca-2d59-4938-9969-513072c3af4e" />

![HelloOOP]<img width="1653" height="795" alt="HelloOOP" src="https://github.com/user-attachments/assets/8d639347-b0bc-46fe-a477-94533d8949ce" />

![HelloProcedural]<img width="1776" height="784" alt="HelloProcedurall" src="https://github.com/user-attachments/assets/f1bfe48d-be34-4a60-bfce-360abbc8423e" />

---

## Analisis
- Jelaskan bagaimana kode berjalan.
  1. Pada pendekatan prosedural, program dijalankan dari atas ke bawah  dengan urutan logika yang sederhana, cocok untuk program kecil.

  2. Pada pendekatan OOP, program dibangun berdasarkan class dan object yang membuat struktur lebih rapi dan mudah dikembangkan untuk program besar.

   3. Pada pendekatan fungsional, Java memanfaatkan lambda expression yang membuat kode lebih singkat, efisien, dan mudah dibaca.
      
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.
 Ini adalah tugas minggu pertama jadi belum bisa membandingkan.
  
- Kendala yang dihadapi dan cara mengatasinya.
  sempat terjadi error pada deklarasi package dan nama file yang tidak sesuai.
  Solusi: memastikan nama file sama dengan nama class utama dan folder sesuai dengan struktur package praktikum.
---

## Kesimpulan

Dengan mempelajari ketiga paradigma — prosedural, OOP, dan fungsional — mahasiswa dapat memahami berbagai cara menyusun program di Java.
Pendekatan OOP lebih terstruktur dan mudah dikembangkan, sedangkan paradigma fungsional lebih efisien untuk kode sederhana.
Pemahaman terhadap ketiga paradigma ini penting agar dapat memilih pendekatan yang paling sesuai dengan kebutuhan proyek.

---

## Quiz
1. Apakah OOP selalu lebih baik dari prosedural?
   Tidak selalu. Paradigma OOP memang lebih unggul dalam hal pengelolaan program yang kompleks karena memiliki struktur yang jelas melalui penggunaan class dan object. Namun, untuk program yang berskala kecil dan sederhana, paradigma prosedural sering kali lebih efisien karena tidak membutuhkan banyak struktur tambahan. Pemilihan paradigma sebaiknya disesuaikan dengan kebutuhan dan kompleksitas aplikasi yang akan dibuat. 

2.  Kapan functional programming lebih cocok digunakan dibanding OOP atau prosedural?
Functional programming lebih cocok digunakan ketika program berfokus pada pemrosesan data, perhitungan matematis, atau tugas-tugas yang tidak memerlukan banyak perubahan state. Paradigma ini juga sangat efektif pada proses yang dapat diparalelkan, sehingga menghasilkan kode yang lebih ringkas, mudah diuji, dan efisien.

 3. Bagaimana paradigma (prosedural, OOP, fungsional) memengaruhi maintainability dan scalability aplikasi?
- Prosedural: Cocok untuk program kecil, tetapi seiring pertumbuhan aplikasi, kode dapat menjadi sulit dikelola karena tidak memiliki struktur yang kuat.
- OOP: Lebih mudah dalam hal maintainability dan scalability karena kode terorganisir dalam class dan object yang saling terpisah. Perubahan atau penambahan fitur dapat dilakukan tanpa mengganggu komponen lain.
- Fungsional: Membantu menciptakan kode yang ringkas dan bebas efek samping, sehingga mudah diuji dan dipelihara. Paradigma ini juga mendukung skalabilitas yang baik pada aplikasi dengan beban komputasi tinggi.

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dibanding prosedural?
 Aplikasi POS (Point of Sale) memiliki banyak komponen seperti produk, transaksi, laporan, dan kasir. Dengan paradigma OOP, setiap komponen dapat direpresentasikan dalam bentuk class sehingga struktur program menjadi modular dan mudah dikelola. Hal ini memungkinkan pengembang untuk melakukan perubahan atau penambahan fitur dengan lebih fleksibel. Sedangkan pada pendekatan prosedural, pengelolaan kode menjadi lebih sulit karena semua logika bercampur dalam satu alur program.

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (boilerplate code)?
 Paradigma fungsional menggunakan konsep lambda expression dan functional interface sehingga memungkinkan penulisan kode yang lebih ringkas dan deklaratif. Dengan cara ini, banyak fungsi sederhana dapat dituliskan dalam satu baris kode tanpa perlu membuat method terpisah. Hal ini secara langsung mengurangi boilerplate code, meningkatkan keterbacaan, serta mempercepat proses pengembangan.
