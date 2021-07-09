
package estruturapilha;

import java.util.Scanner;


public class Pilha<T> extends EstruturaEstatica<T> {
    
    
    //Construtores
    public Pilha(int capacidade) {
        super(capacidade);}
    
    public Pilha(){}

    
    /*
    public void empilhaPar(T elemento){
       Scanner teclado = new Scanner(System.in);
       for (int i = 0; i <10; i++) {
           System.out.println("Digite um numero: ");
            int num = teclado.nextInt();
             if (num==2) {
                 this.elements[i]=elemento;
                 this.tamanho++;
             }
       }
        }
        */

    @Override
    public T remover() {
       if (tamanho>0) {
    T elemento = this.elements[tamanho-1];
    this.tamanho--;
    System.out.println("O Ultimo elemento: "+elemento+", foi removido");
    return elemento;
    }
         
         else{System.out.println("Não possui elemento no topo para desempilhar");}
    return null;
    // Ou return this.elements[--tamanho];
    }  
    
    @Override
    public T espiar() {
        if (tamanho>0) {
            System.out.println("O topo da pilha é: "+this.elements[tamanho-1]);
        }else{System.out.println("Pilha vazia");}
         return null;
    }

    @Override
    public void adciona(T elemento) {
         this.aumentaCapacidade();
        this.elements[tamanho]=elemento;
        this.tamanho++;
        
        
        
        
        
    }
        
    
    
    
    
      
}