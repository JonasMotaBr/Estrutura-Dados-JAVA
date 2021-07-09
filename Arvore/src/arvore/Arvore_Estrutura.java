
package arvore;


public class Arvore_Estrutura {
    
    private Elemento ele;
   private Arvore_Estrutura dir;
   private Arvore_Estrutura esq;

    public Arvore_Estrutura() {
     this.dir=null;
     this.esq=null;
     this.ele=null;
    }
    
    public Arvore_Estrutura(Elemento elem) {
     this.dir=null;
     this.esq=null;
     this.ele=elem;
     // System.out.println("Arvore criada com valor " + elem.getValor() );
    }

    public boolean isEmpty(){
    return (this.ele==null);
    }
    
    public void inserir(Elemento novo){
        if (this.isEmpty()) {
            this.ele=novo;
           
        }else{
             Arvore_Estrutura novaArvore = new Arvore_Estrutura(novo);
             if (novo.getValor() < this.getEle().getValor()) { //vou inserir na esquerda
                 if (this.esq == null) {// sou um nó folha?
                     this.esq=novaArvore;//esquerda recebe novaArvore
                    // System.out.println("Elemento " + novo.getValor() + " inserido a esquerda do "+ this.ele.getValor());
                 }else{
                     this.esq.inserir(novo);
                     
                       }
                 
                 
            } else if (novo.getValor() > this.getEle().getValor()) {
                 if (this.dir == null) {// sou um nó folha?
                     this.dir=novaArvore;
                     //System.out.println("Elemento " + novo.getValor() + " inserido a direita do "+ this.ele.getValor());
                 }else{
                     this.dir.inserir(novo);
                     
                    }
                 
                }  
             
             }
        
    }//----------------------------------------------------------------------
    
    public boolean busca(int valor){
        if (this.isEmpty()) {
            return false;
        }else{
            if (valor == this.ele.getValor()) {
               return true;
            }else{
                if (valor < this.ele.getValor()) {
                    if (this.esq == null) {
                        return false;
                    }else{
                    return this.esq.busca(valor);
                    }
                }else if(valor > this.ele.getValor()){
                 if (this.dir == null) {
                        return false;
                    }else{
                    return this.dir.busca(valor);
                    }
                }
            }
            return false;
            }

    }//------------------------------------------------------------------------
    
    public void imprimirPreOrdem(){
        if (!this.isEmpty()) {
            System.out.println(this.ele.getValor());
            if (this.getEsq() != null) {
               this.esq.imprimirPreOrdem();
            }
            if(this.getDir() != null){
            this.dir.imprimirPreOrdem();
            }
        }
    }
    public void imprimirInOrdem(){
        if (!this.isEmpty()) {
            if (this.esq != null) {
                this.esq.imprimirInOrdem();
            }
            System.out.println(this.ele.getValor());
            if (this.dir != null) {
                this.dir.imprimirInOrdem();
            }
        }
    }
    
   
   public void imprimirPosOrdem(){
       if ( ! this.isEmpty()) {
           if (this.dir != null) {
               this.dir.imprimirPosOrdem();
           }
           if (this.esq != null) {
               this.esq.imprimirPosOrdem();
           }
           System.out.println(this.ele.getValor());
       }
   }
    
   public void imprimirInOrdemIvertida(){
   if (!this.isEmpty()) {
            if (this.dir != null) {
                this.dir.imprimirInOrdem();
            }
            System.out.println(this.ele.getValor());
            if (this.esq != null) {
                this.esq.imprimirInOrdem();
            }
        }
   
   }
    
    //gets e sets
    public Elemento getEle() {
        return ele;
    }

    public void setEle(Elemento ele) {
        this.ele = ele;
    }

    public Arvore_Estrutura getDir() {
        return dir;
    }

    public void setDir(Arvore_Estrutura dir) {
        this.dir = dir;
    }

    public Arvore_Estrutura getEsq() {
        return esq;
    }

    public void setEsq(Arvore_Estrutura esq) {
        this.esq = esq;
    }
    
   
    
    
}
