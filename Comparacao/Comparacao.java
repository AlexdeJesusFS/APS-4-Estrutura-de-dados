package Comparacao;

import java.util.ArrayList;

public class Comparacao {
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();
        
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        
        //Adicionar elementos
        int limite = 10000000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for(int i=0; i < limite; i++){
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println(limite + " valores | tempo em MileSegundos"); 
        
        System.out.println("Adicionando valores");
        System.out.println("vetor: " + (tempoFinal - tempoInicial));
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < limite; i++){
            Livro livro = new Livro(i);
            lista.adicionar(livro);
        }
        tempoFinal = System.currentTimeMillis();       
        System.out.println("lista: " + (tempoFinal - tempoInicial));
        
        //ler valores
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < vetor.size(); i++){
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("\nLendo Valores");
        System.out.println("vetor:" + (tempoFinal - tempoInicial));    
        
        tempoInicial = System.currentTimeMillis();
        for(int i=0; i < lista.getTamanho(); i++){
            lista.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("lista:" + (tempoFinal - tempoInicial));       
        
    }
}
