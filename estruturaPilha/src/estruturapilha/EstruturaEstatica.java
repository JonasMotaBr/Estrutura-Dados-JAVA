
package estruturapilha;


public class EstruturaEstatica<T> {
    
    
    public T elements[];
    public int tamanho;
    
    
    
    public EstruturaEstatica(int capacidade){
    this.elements=(T[]) new Object[capacidade];
    this.tamanho=0;}
    
    //construtor sem parametros
    public EstruturaEstatica(){}

    
    public void adciona(T elemento){
    }
    
    public T espiar(){
    return null;
    }
    
    public T remover(){
    return null;
    }
    
    
    
    protected void adciona(int posicao, T elemento){
        this.aumentaCapacidade();
        if (posicao<=tamanho){
            for (int i = tamanho-1; i >=posicao; i--) {
            this.elements[i+1]=this.elements[i];
        }
        this.elements[posicao]=elemento;
        this.tamanho++;
         }else{System.out.println("posicao indisponivel");}
        }
         

    protected boolean estaVazia(){
          if (tamanho<=0) {
              System.out.println("Vetor Vazio");
        }else{System.out.println("Vetor não esta vazio");}
          return false;
     }
    
    public int tamanho(){
    return tamanho;}
    
    public String toString(){
    StringBuilder s = new StringBuilder();
    
    s.append("[");
     for (int i = 0; i <tamanho-1; i++) {
           s.append(this.elements[i]);
            s.append(", ");
        }
     if (this.tamanho>0) {
            s.append(this.elements[tamanho-1]);
        }
        s.append("]");
    
    return s.toString();}
    
    
    protected void aumentaCapacidade(){
        if (tamanho==this.elements.length) {
           T[] novoVetor =(T[]) new Object[this.elements.length*2]; 
                for (int i = 0; i <this.elements.length; i++) {
                novoVetor[i]=this.elements[i];
            }
                this.elements=novoVetor;}
    }
    
    
    
    
        
}

    