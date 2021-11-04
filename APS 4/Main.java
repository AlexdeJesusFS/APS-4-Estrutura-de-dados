
package APS;

import java.io.IOException;
import java.util.ArrayList;
import manipulaArquivo.Dados;
import manipulaArquivo.ManagerDados;

public class Main {

    public static void main(String[] args) {
    	//-- Testes que o Guilherme estava fazendo --
    	String nome = "dados";
    	ManagerDados dados = new ManagerDados();
    	ArrayList<Dados> lista = new ArrayList<Dados>();
    	
    	Dados info = new Dados(1,"a","b","c",20.0,30.0,40.0,50.0);
    	
    	
    	//dados.CriarArquivo(nome);
    	//for(int i =0; i < 100000; i++) {
    	//	dados.EscreverArquivo(info,nome);
    	//}
        try {
        	System.out.println("inicio");
        	lista = dados.LerArquivo(nome);
        	System.out.println("fim");
        	System.out.println("inicio Update");
        	dados.Update(0, info, lista, nome);
        	System.out.println("fim Update");
        	//lista = dados.PesquisaCodigo(1, nome);
        }catch(IOException e) {
        	System.out.println(e);
        }
        
        
        System.out.println(lista.size());
        
        
        //lista.get(0).setCodigo(3);
        //lista.get(1).setCodigo(2);
        
        //System.out.println(lista.get(0).getCodigo());
        //System.out.println(lista.get(1).getCodigo());
        
    	
    	/*
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
        */
    }
    
}
