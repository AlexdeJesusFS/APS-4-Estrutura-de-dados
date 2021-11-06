
package Comparacao;

import javax.swing.JOptionPane;

public class ListaEncadeada<TIPO> { //Lista Generica Duplamente Encadeada.
    //atributos
    private Livro<TIPO> cabeca;
    private Livro<TIPO> cauda;
    private int tamanho = 0;
    
    //principal
    public void adicionar(Livro livro) {
        if (cabeca == null && cauda == null) {
            cabeca = livro;
            cauda = livro;          
        } else {
           cauda.setProximo(livro); 
           livro.setAnterior(cauda);
           cauda = livro;                            
        }
        tamanho++;
    }
    
    public void remover(String livro) {
        Livro atual = cabeca;
        Boolean removido = true;
        for (int i = 0; i < tamanho; i++) {
            
            if (atual.getValor().equals(livro)) {
                if (atual == cabeca && atual == cauda) {//caso seja o primeroi & o ultimo
                    cabeca = null;
                    cauda = null;
                }else if (atual == cabeca) {//cajo seja o primeiro:
                    cabeca = atual.getProximo();
                    cabeca.setAnterior(null);
                    atual.setProximo(null);
                    atual.setAnterior(null);                   
                } else if (atual == cauda) {//caso seja o ultimo:
                    cauda = atual.getAnterior();
                    cauda.setProximo(null);
                    atual.setProximo(null);
                    atual.setAnterior(null);
                } else {//caso esteja no meio:
                atual.getAnterior().setProximo(atual.getProximo());           
                atual.getProximo().setAnterior(atual.getAnterior());
                atual.setAnterior(null);
                atual.setProximo(null);
                }
                tamanho--;
                break; 
            }                                                     
        }
        if (removido) {
            JOptionPane.showMessageDialog(null, livro + " foi removido!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado na lista");
        }        
        
    }
    /*
    public void remover(Livro livro) {
        //Livro anterior = null;
        Livro atual = cabeca;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual == cabeca) {
                cabeca = atual.getProximo();
                atual.setProximo(null);
            } else if (atual == cauda) {
                cauda = cauda.getAnterior();
                anterior.setProximo(null);
            } else {
                anterior.setProximo(atual.getProximo());
            atual = null;         
            } 
            tamanho--;
            break;
        }
        anterior = atual;
        atual = atual.getProximo();
    }*/
    
    public Livro buscarLivro(int posicao) {
        Livro atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
                return atual;
            }
        }
        return null;              
    }
    
    public void listar() {
        Livro atual = cabeca;
        String lista = atual.dados() + "\n";
        for (int i = 0; i < tamanho; i++) {
            if (atual.getProximo() != null) {                
                atual = atual.getProximo(); 
                lista =  "\n" + lista + atual.dados() + "\n";                
            }       
        }
        JOptionPane.showMessageDialog(null, lista);
    }
   
    public Livro get(TIPO valor) {
        Livro atual = cabeca;
        for (int i = 0; i < tamanho; i++) {
            if (atual.getValor().equals(valor)) {
                return atual;
            }
        }    
        return null;
    }
    
    //Getters e Setters
    public Livro getCabeca() {
        return cabeca;
    }

    public void setCabeca(Livro cabeca) {
        this.cabeca = cabeca;
    }

    public Livro getCauda() {
        return cauda;
    }

    public void setCauda(Livro cauda) {
        this.cauda = cauda;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }        
    
}
