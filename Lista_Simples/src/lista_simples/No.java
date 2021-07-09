
package lista_simples;


public class No<T> {
    
    public T valor;
    public No<T> proximo;
    
    
    public No(T valor){
    this.valor=valor;
    proximo=null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
    
    
}
