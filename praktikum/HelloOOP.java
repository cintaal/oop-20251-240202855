package praktikum;
class Mahasiswa {
   String nama;  
   int nim;   
   Mahasiswa(String m, int n) {  
      
      this.nama = m;  
      this.nim = n;   
   }

   void sapa() { System.out.println("Hallo World, I am " + nama + ", " + nim);
     
   }
}

public class HelloOOP {

   public static void main(String[] args) {

      Mahasiswa m = new Mahasiswa("Cinta Alghumaidatul Affaf", 240202855);  
      m.sapa();  
   }
}
