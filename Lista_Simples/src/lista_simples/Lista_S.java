
package lista_simples;


public class Lista_S<T> {
    
    /*O atributo primeiro guarda a referência do primeiro nó. Através dele podemos chegar a todos
    os nós, sempre pulando para o próximo. */
    public No<T> primeiro;
    
    public boolean isEmpty(){
       return (this.primeiro == null);
    }
    
    public void inserirInicio(T valor){
        //Cria um novo nó com o valor passado
     No<T> novo_no = new No<T>(valor);
       
            novo_no.setProximo(primeiro);
            this.primeiro=novo_no;
        
    }//------------------------------------------------------------------------
    
    public No<T> removerInicio(){
     No<T> aux = primeiro;
        if (! this.isEmpty()) {
            primeiro = primeiro.getProximo();
        }
        return aux;
    }//------------------------------------------------------------------------
    
    
    public void inserirFinal(T valor){
      No<T> novo_no = new No<T>(valor);
      No<T> aux = primeiro;
        if ( this.isEmpty()) {
            this.primeiro= novo_no;
        } else{
            while( aux.getProximo() != null){
             aux = aux.getProximo();
            }
            aux.setProximo(novo_no);
        }
    }//------------------------------------------------------------------------
    
    public No<T> removerFinal(){
      No<T> aux = primeiro;
        if (this.isEmpty()) {
            System.out.println("Esta vazia");
            return null;
        }else{
           while(aux.getProximo().getProximo() != null){
                 aux = aux.getProximo();
           } 
           No<T> aux2 = aux.getProximo();
           aux.setProximo(null);
          return aux2;
        }
    }//-------------------------------------------------------------------------
    
    
  public void inserir(T  valor) {
		No<T> novo_no = new No<T>(valor);
		
		
		No<T> auxiliar = primeiro;
		No<T> auxiliar2 = null;
		
		while((auxiliar != null)  )
		{
			auxiliar2 = auxiliar;
			auxiliar = auxiliar.getProximo();
		}
		
		if(this.primeiro == null) { 
			this.primeiro = novo_no;
			
		}else if(auxiliar == this.primeiro) {
			
			novo_no.setProximo(this.primeiro);
			this.primeiro = novo_no;
			
		}else {
			novo_no.setProximo(auxiliar);
			auxiliar2.setProximo(novo_no);	
		}
	
	}//---------------------------------------------------------------------
    public No<T> buscar(T valor){
    No<T> aux = primeiro;
    
    while(aux.getValor()!=valor){
      aux = aux.getProximo();
    }
    return aux;
    
    }
  
  public String toString() {
		String s = "";
		No<T> auxiliar = primeiro;
		
		while(auxiliar != null)
		{
			//incrementa o valor
			s+= auxiliar.getValor().toString() + " - ";
			//pula para o próximo
			auxiliar = auxiliar.getProximo();
		}
		
		return s;
	} 
  
  
  
}// Classe----------------------------------------------------------------------
