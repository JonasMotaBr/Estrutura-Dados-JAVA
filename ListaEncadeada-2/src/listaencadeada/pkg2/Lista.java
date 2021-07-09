//Classe Lista
package listaencadeada.pkg2;


public class Lista< T >{        

    public No<T> inicio;
    No<T> atual = inicio;
    
    
    public void inserirFundo(T elemento){
       
        No nova = new No(elemento);
        //nova.setElemento(elemento); 
        nova.setProximo(null);      
        if (inicio == null){ 
            inicio = nova;
        }
        else{              
            No aux;
            aux = inicio;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    
    
     public void inserirFrente(T elemento){
      
         No<T> novo_no = new No<T>(elemento);
         
         if (inicio == null) {
             this.inicio= novo_no;
         }else{
              novo_no.proximo = inicio;
              this.inicio.anterior = novo_no;
	      this.inicio = novo_no;
         }
   }//-------------------------------------------------------------------------
 

     public T retirarFrente(){
        // este método considera que a lista sempre tem elementos
        // alguém na aplicação precisa (antes de remover), testar se a lista não está vazia, ok?
        if (inicio != null){
          No<T> aux = inicio;
          T elemento = aux.getElemento();
          inicio = aux.getProximo();
          return elemento;
        } 
        else{
            throw new RuntimeException("Lista vazia!");
        }
    }//-------------------------------------------------------------------------


      public No removerFinal(){
	No aux = inicio;
		if(this.inicio == null) { 
			return null;
		}else{
		
	        while( aux.proximo != null){
		aux = aux.getProximo();
                   }
		aux.proximo = null;
		aux.anterior = null;
		
		}
	return aux;
	}//-----------------------------------------------------------------------
       
     
      
   
    public boolean isEmpyt(){
    return (this.inicio==null);
    }//-------------------------------------------------------------------------
    
     public void listar(){
        if (inicio == null){
            System.out.println("Lista ta vazia!");
        }
        else{
           No aux = inicio;
            while (aux != null){
                System.out.println("Elemento:  "+aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }//-------------------------------------------------------------------------
    
    public T buscar(T elemento){
     No<T> aux= inicio;
     T retorno= null;
        if (inicio == null) {
            return null;
        }else{
            while((aux.getProximo() != null) && (aux.getElemento() != elemento)){
                aux = aux.getProximo();
            }if (aux.getElemento()!= elemento) {
                return null;
            }else{
                    retorno = aux.getElemento();}
        } 
    return retorno;
    }//-------------------------------------------------------------------------
    
    
    
    
    public String toString() {
		String s = "";
		No<T> auxiliar = inicio;
		
		while(auxiliar != null)
		{
			
			s+= auxiliar.getElemento().toString() + " - ";

			auxiliar = auxiliar.getProximo();
		}
		
		return s;
} //-------------------------------------------------------------------------
    
    
    
    
    
}//------------------------------------------------------------------------------
