
package listaencadeada.pkg2;


public class No<T> {
    public T elemento;
    public No proximo;
    public No anterior;
    
    
    public No(T elemento){
    this.elemento=elemento;
    proximo= null;
    anterior=null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

   
    
    
    
    
}
