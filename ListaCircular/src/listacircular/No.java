
package listacircular;


public class No<T extends Comparable<T>>{
    
    public T elemento;
    public No prox;
    public No ant;
    
    
    public No(T elemento){
        this.elemento = elemento;
        this.prox = null;
        this.ant = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

    @Override
    public String toString() {
        return "" + "elemento= " + elemento ;
    }
    
    
    
    
    
   
    
    
}
