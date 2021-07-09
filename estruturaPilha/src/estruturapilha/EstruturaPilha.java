
package estruturapilha;

import java.util.Scanner;
//Pilha e fila implementadas com vetor

public class EstruturaPilha {

   
    public static void main(String[] args) {
       
        
        Filas<String> fila = new Filas(20);
        
      
        
       
        System.out.println("Fila:");
        fila.adciona("A");
        fila.adciona("B");
        fila.adciona("C");
        System.out.println(fila.toString());
        fila.remover();
        System.out.println(fila.toString());
        
        
        
        
    }
   
    
}
