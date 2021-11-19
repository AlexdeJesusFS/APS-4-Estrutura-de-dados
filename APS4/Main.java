package APS4;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;
import model.Dados;
import model.DadosDAO;
import view.TelaAPS;

public class Main {

    public static void main(String[] args) {

        TelaAPS tela = new TelaAPS();
        //-- Testes que o Guilherme estava fazendo --\\

        Random rnd = new Random();
        DadosDAO dados = new DadosDAO();
        ArrayList<Dados> lista = new ArrayList<Dados>();
        Sort sort = new Sort();
        
        String ano = Integer.toString(rnd.nextInt(10000));
        
        for (int i = 0; i < 1000; i++) {
            
            Dados info = new Dados();
            
            info.setAno(ano);
            info.setMes("11");
            info.setDataAtualizada("16/11/2020");
            info.setEstado("SP");
            info.setAreaTotal(10000);
            info.setAreaDesmatadaAno(1000);
            info.setIndReflorestamento(10);
            info.setIndIndustrial(10);
            
            lista.add(info);
        }

        try {
            dados.CriarArquivo("entrada");
            dados.EscreverArquivo(lista, "entrada");
            
            lista = dados.LerArquivo("entrada");
            
            sort.mergeSort(lista, lista.size());
            dados.EscreverArquivo(lista, "MergeSort");
            
            sort.quickSort(lista, 0, lista.size() - 1);
            dados.CriarArquivo("QuickSort");
            dados.EscreverArquivo(lista, "QuickSort");
        } catch (IOException e) {
            System.out.println(e);
        }
          
        
        //System.out.println(lista.size());
                /*Outro teste
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
