
package estruturapilha;

import java.util.Scanner;

public class Livros {
    
    
    
    public String nome;
    public String isbn;
    public String anoLancamento;
    public String autor;
    
     public Livros(String nome,String isbn,String anoLancamento,String autor){
     this.nome=nome;
     this.isbn=isbn;
     this.anoLancamento=anoLancamento;
     this.autor=autor;
     }
     /*
    public Livros(int capacidade){
     super(capacidade);}

   
  
    public void adciona(String elemento) {
        
        super.adciona(elemento); 
    
        
    }
    
    */
    
   

    
    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livros{" + "nome=" + nome + ", isbn=" + isbn + ", anoLancamento=" + anoLancamento + ", autor=" + autor + '}';
    }

    

   
    
    
    
    
    
    
}
