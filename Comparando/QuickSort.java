
package Comparando;

public class QuickSort {
   
    private static long trocas = 0;
    
    public static int[] ordenar(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){// 1
            int p = particiona(vetor, esquerda, direita);// 1
            ordenar(vetor, esquerda, p); // 
            ordenar(vetor, p + 1, direita);
        }
        return vetor;//1
    }    
    
    private static int particiona(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;// 3
        int pivot = vetor[meio];// 1
        int i = esquerda - 1; // 2
        int j = direita; // 1
        while(true){
            do{
                i++;//n
            }while(vetor[i] < pivot);// n/2
            do{
                j--;// n
            }while(vetor[j] > pivot);// n/2
            if (i >= j){ // 1
                return j;// 1
            }
            int aux = vetor[i];// n
            vetor[i] = vetor[j];// n
            vetor[j] = aux;// n
            trocas++;
        }
    }

    public static long getTrocas() {
        return trocas;
    }

    public static void setTrocas(long trocas) {
        QuickSort.trocas = trocas;
    }
    
    
}
