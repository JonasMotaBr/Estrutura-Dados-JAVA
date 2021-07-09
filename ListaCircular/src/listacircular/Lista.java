
package listacircular;


public class Lista<T extends Comparable <T>> {
    
    
    
    public No prim;
    public No no_atual;
    public int indiceNo;
    public int qtdNo = 0;
    
    
    public Lista() {
        this.prim = null;
        this.no_atual = null;
    }
    
    
    public void inserir(T elemento){
        qtdNo ++;
        No novo_no = new No(elemento);  
        No aux = this.prim;
        // Lista vizia
        if (prim == null) {
            prim = novo_no;
            no_atual = prim;
            this.prim.setProx(novo_no);
            this.prim.setAnt(novo_no);
         //apenas 1 nó
        }else if (aux.getProx() == prim) {
                aux.setProx(novo_no);
                aux.setAnt(novo_no);
                novo_no.setAnt(aux);
                novo_no.setProx(prim);
            }
        /*o no inserido é menor que o primeiro nó*/
        else if(novo_no.getElemento().compareTo(prim.getElemento())== -1 ) {
            novo_no.setProx(prim);
            novo_no.setAnt(prim.getAnt());
            prim.getAnt().setProx(novo_no);
            prim.setAnt(novo_no);
            prim = novo_no;
            no_atual = prim.getAnt();
        }else{
	 //enquanto o novo nó for maior que o temp (até encontrar alguém maior
	//que ele
        No aux2 = this.prim;	
	 while( (novo_no.getElemento().compareTo(aux2.getElemento() ) == 1)) { 
		aux2 = aux2.getProx();
			
		//fechou um ciclo
		if(aux2 == this.prim)
		break;
		}
	    	novo_no.setProx(aux2);
	        aux2.getAnt().setProx(novo_no);
                novo_no.setAnt(aux2.getAnt());
                aux2.setAnt(novo_no);
	    	}			
    }//----------------------------------------------------------------------------------
    
    
    public No<T> search(Comparable elemento){
      No aux = this.prim;
		while( aux.getElemento() != prim && aux.getElemento() != elemento) { 
		aux = aux.getProx();
                if((aux == this.prim) || (elemento.compareTo( aux.getElemento() ) == -1))
	        return null;
	    }
	return aux;
    }//----------------------------------------------------------------------------------
    
    
    public void Remover(T valor) {
		
		No aux= search(valor);
		
		if(aux != null) {
			qtdNo--;
			if(aux == this.prim) {
			prim.getAnt().setProx(prim.getProx());
                        prim.getProx().setAnt(prim.getAnt());
                        prim = prim.getProx();
                        
			}else {
                            aux.getAnt().setProx(aux.getProx());
                            aux.getProx().setAnt(aux.getAnt());
				
			}
			
		}
		
		
	}
    /* Funcionando!!!
    public No<T> obterNoProximo() {
	indiceNo++;
	no_atual = no_atual.getProx();
	return no_atual;
    }//----------------------------------------------------------------------------------

   
    public No<T>  obterNoAnterior() {
	indiceNo--;
	no_atual = no_atual.getAnt();
	return no_atual;
    }//----------------------------------------------------------------------------------

    public void resetCurrentNode() {
	this.no_atual = this.prim.getAnt();
    }//----------------------------------------------------------------------------------
	
 
        
    public String toString() {
		String s = "";
		resetCurrentNode();
		No stop = no_atual;
		do {
			obterNoProximo();
			s+= no_atual .getElemento().toString() + " - ";
		}while(no_atual !=  stop);
		
		return s;
	} 
        
          */
        
    public void exibirNaOrdem(){
        
        No tmp;
        tmp = prim;
        do{
            System.out.print(tmp.getElemento()+" - ");
            tmp = tmp.getProx();
        } while(tmp != prim);
        System.out.println("");
    }

        
    
}
