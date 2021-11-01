
package APS;

import java.io.IOException;

import manipulaArquivo.Dados;
import manipulaArquivo.ManagerDados;

public class Main {

    public static void main(String[] args) {
      /*
    	String nome = "dados";
    	ManagerDados dados = new ManagerDados();
    	Dados info = new Dados(1,"a","b","c",20.0,30.0,40.0,50.0);
    	
    	dados.CriarArquivo(nome);
        dados.EscreverArquivo(info,nome);
        dados.EscreverArquivo(info,nome);
        
        try {
        	int contador =	dados.ContarQuantidade(nome);
        	System.out.println(contador);
        }catch(IOException e) {
        	System.out.println(e);
        }
        */
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * i);
        }
        
        System.out.print("Desordenado:            ");
        for (int i = 0; i < vetor.length; i++) {           
            System.out.print(vetor[i] + " ");
        }
        
        QuickSort quick = new QuickSort();
        quick.ordenar(vetor, 0, vetor.length-1);
        System.out.println("");
        
        System.out.print("Ordenado por QuickSort: ");
        for (int i = 0; i < vetor.length; i++) {          
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
    
}
