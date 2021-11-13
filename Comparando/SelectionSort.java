
package Comparando;

public class SelectionSort {
    private static long trocas = 0;
    
    public static int[] ordenar(int[] vetor){       
        //Selection sort O(N^2)
        int posicao_menor, aux;
        for(int i=0; i < vetor.length; i++){ //O(N)
            posicao_menor = i;
            for(int j = i+1; j < vetor.length; j++){ //O(N)
                if (vetor[j] < vetor[posicao_menor]){
                    posicao_menor = j;                   
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
            trocas++;
        }
        return vetor;
    }

    public static long getTrocas() {
        return trocas;
    }

    public static void setTrocas(long trocas) {
        SelectionSort.trocas = trocas;
    }
    
    
}
