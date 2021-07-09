
package estruturapilha;


public class Filas<T> {
    
    public T elements[];
    public int tamanho;
    
    public Filas(int capacidade) {
    this.elements=(T[]) new Object[capacidade];
    this.tamanho=0;}
    
    

    public Object remover() {
       System.out.println("O primeiro elemento: "+this.elements[0]+", foi removido!");
       for (int i =0; i <this.tamanho; i++) {
        this.elements[i] = this.elements[i+1];
        }
       this.tamanho--;
       
        return null; 
    }//-----------------------------------------------------Remover

    
    public Object espiar() {//espiar primeiro da fila
        System.out.println("O primeiro da fila é: "+this.elements[0]);
        return this.elements[0];
    }//-----------------------------------------------------Espiar

    
    public void adciona(T elemento) {
        this.elements[tamanho]=elemento;
        this.tamanho++;
    }//-----------------------------------------------------Adcionar

    
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
    
  protected boolean estaVazia(){
          if (tamanho<=0) {
              System.out.println("Vetor Vazio");
        }else{System.out.println("Vetor não esta vazio");}
          return false;
     }//-----------------------------------------------------ToString
    
}
