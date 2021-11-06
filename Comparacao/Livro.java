
package Comparacao;

public class Livro<TIPO> {
    //atributos
    private TIPO valor;
    
    private Livro<TIPO> proximo;
    private Livro<TIPO> anterior;
    
    //construtor
    public Livro(TIPO valor) {
        this.valor = valor;      
    }
    
    //principal
    public TIPO dados() {
        return this.valor;
    }
    
    
    //Getters e Setters
    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public Livro getProximo() {
        return proximo;
    }

    public void setProximo(Livro anterior) {
        this.proximo = anterior;
    }

    public Livro getAnterior() {
        return anterior;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }
    
    
    
    
}
