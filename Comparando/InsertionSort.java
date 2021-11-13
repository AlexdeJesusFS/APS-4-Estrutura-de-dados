
package Comparando;

public class InsertionSort {
    private static long trocas = 0;
    
    public static int[] ordenar(int[] vetor){
         
        int aux, j;
        for(int i=1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1; 
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
                trocas++;
            }
            vetor[j+1] = aux;
            trocas++;
        }
        return vetor;
    }

    public static long getTrocas() {
        return trocas;
    }

    public static void setTrocas(long trocas) {
        InsertionSort.trocas = trocas;
    }
    
    
    
}
