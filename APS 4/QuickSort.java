package APS;

public class QuickSort {   

    /*
    public void particiona(int[] vetor) {
        pivo = (int) (vetor[0] + vetor[vetor.length -1]) / 2;
        
        for (int i = 0; i < vetor.length; i++) {
            for (int j = vetor.length-1; j > vetor.length; j++) {
                if (vetor[i] >= pivo && vetor[j] <= pivo) {
                    //troca de posição i com j
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = vetor[j];
                }
            }
            
        }
    }*/ 

    public int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);
            if (i >= j) {
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
    
    public void ordenar(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            ordenar(vetor, esquerda, p);
            ordenar(vetor, p + 1, direita);
        }
    }
}
