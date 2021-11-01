
package APS;

import java.io.IOException;

import manipulaArquivo.Dados;
import manipulaArquivo.ManagerDados;

public class Main {

    public static void main(String[] args) {
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
    }
    
}
