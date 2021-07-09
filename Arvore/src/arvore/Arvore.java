
package arvore;

public class Arvore {

   
     public static void main(String[] args) {
        
        Arvore_Estrutura estru = new Arvore_Estrutura(new Elemento(10));
        
        
        estru.inserir(new Elemento(5));
        estru.inserir(new Elemento(1));
        estru.inserir(new Elemento(8));
        estru.inserir(new Elemento(15));
        estru.inserir(new Elemento(12));
        estru.inserir(new Elemento(18));
        /*
        System.out.println("O elemento 8 "+ (estru.busca(8)? "Existe" :"Não existe"));
        System.out.println("O elemento 5 "+ (estru.busca(5)? "Existe" :"Não existe"));
        System.out.println("O elemento 2 "+ (estru.busca(2)? "Existe" :"Não existe"));
        System.out.println("O elemento 15 "+ (estru.busca(15)? "Existe" :"Não existe"));
        System.out.println("O elemento 18 "+ (estru.busca(18)? "Existe" :"Não existe"));
        System.out.println("O elemento 12 "+ (estru.busca(12)? "Existe" :"Não existe"));
        System.out.println("O elemento 17 "+ (estru.busca(17)? "Existe" :"Não existe"));
        */
        //estru.imprimirPreOrdem();
       // estru.imprimirInOrdem();
       //stru.imprimirPosOrdem();
       estru.imprimirInOrdemIvertida();
       
        
        
      
    }
    
    
}
