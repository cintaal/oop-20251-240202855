# Laporan Praktikum Minggu 1 (sesuaikan minggu ke berapa?)
Topik: [Tuliskan judul topik, misalnya "Class dan Object"]

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

## Dasar Teori 
1. Pemrograman Prosedural adalah paradigma yang berfokus pada urutan langkah atau prosedur dalam menyelesaikan suatu masalah. Program disusun berdasarkan fungsi atau prosedur yang dijalankan secara berurutan.
2. Pemrograman Berorientasi Objek (OOP) berfokus pada objek yang memiliki atribut (data) dan method (perilaku). Konsep utama OOP meliputi class, object, encapsulation, inheritance, dan polymorphism.
3. Class merupakan blueprint atau cetak biru dari objek yang mendefinisikan atribut dan method.
4. Functional Programming di Java memanfaatkan konsep lambda expression dan functional interface seperti Consumer, BiConsumer, atau Function untuk menulis kode yang lebih ringkas dan deklaratif.
5. Paradigma fungsional memungkinkan pemrosesan data dengan cara yang lebih ekspresif dan mengurangi boilerplate code dibandingkan pendekatan prosedural atau OOP.

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
---java
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
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
(1. [Tuliskan kembali pertanyaan 1 dari panduan]  
   **Jawaban:** …  

2. [Tuliskan kembali pertanyaan 2 dari panduan]  
   **Jawaban:** …  

3. [Tuliskan kembali pertanyaan 3 dari panduan]  
   **Jawaban:** …  )
