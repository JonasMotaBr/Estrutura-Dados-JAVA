
package listaencadeada.pkg2;

public class ListaEncadeada2 {

  
    public static void main(String[] args) {
      Lista lista = new Lista();
      
     lista.inserirFundo(1);
     lista.inserirFundo(2);
     lista.inserirFundo(3);
     lista.inserirFundo(4);
    lista.retirarFrente();
  
      //System.out.println(lista.buscar(2));
     lista.listar();
         
        
    }
    
}
