import java.util.function.BiConsumer; 
public class HelloFunctional { 
        public static void main(String[] args) { 

          BiConsumer<String, Integer> sapa = (nama, nim) -> System.out.println("Hallo World, I am " + nama + ", " + nim);
        
        sapa.accept("Cinta Alghumaidatul Affaf", 240202855);  

    } 
}
