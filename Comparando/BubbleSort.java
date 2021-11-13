
package Comparando;

public class BubbleSort {
    private static long trocas = 0;
    
    public static int[] ordenar(int[] vetor){
        //int trocas = 0;
        //BUBBLE SORT O(N^2)
        int aux;
        for(int i = 0; i < vetor.length; i++){ // O(N)
            for(int j = i + 1; j < vetor.length; j++){ //O(N)
                if (vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        return vetor;
    }

    public long getTrocas() {
        return trocas;
    }

    public void setTrocas(long trocas) {
        this.trocas = trocas;
    }
        
}
