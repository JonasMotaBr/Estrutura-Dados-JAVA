
package lista_simples;

public class Lista_Simples {

  
   
    public static void main(String[] args) {
       Lista_S lista = new Lista_S();
      
       lista.inserirFinal(1);
      lista.inserirFinal(2);
      lista.inserirFinal(3);
     
     
      System.out.println(lista.buscar(3));
      System.out.println( lista.toString());
               
    }
    
}
