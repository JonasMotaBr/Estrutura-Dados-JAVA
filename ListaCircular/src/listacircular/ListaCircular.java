
package listacircular;


public class ListaCircular {

   
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        
        lista.inserir("a");
        lista.inserir("b");
        lista.inserir("c");
        lista.inserir("d");
        System.out.println(lista.search("b"));
        lista.Remover("b");
        System.out.println(lista.search("b"));
        lista.exibirNaOrdem();
        
        
    }
    
}
