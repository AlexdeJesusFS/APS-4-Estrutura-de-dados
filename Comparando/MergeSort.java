package Comparando;

public class MergeSort {
    
    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] v = new int[10];        
        
        for(int i=0; i < v.length; i++){
            v[i] = (int) Math.floor(Math.random() * v.length);
            System.out.print(v[i]+" ");
        }
        System.out.println("");
        merge.ordenar(v, 0, v.length-1);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
    
    private static long trocas = 0;
    
    public void ordenar(int[] vetor, int inicio, int fim) {           
        if (inicio >= fim) {// 1
        } else {// o mesmo             
            int middle = (inicio + fim) / 2;// 3
            ordenar(vetor, inicio, middle);// 
            ordenar(vetor, middle + 1, fim);
    
            merge(vetor, inicio, middle, fim);
        }        
    }

    public void merge(int[] vetor, int inicio, int meio, int fim) {                     
        //copia os elementos entre inicio e fim para um vetor auxiliar.
        int[] aux = new int[vetor.length];// 1
        for (int i = inicio; i <= fim; i++) {// 1+ (n+1) + n
            aux[i] = vetor[i];// n
        }
               
        int p1 = inicio;//1
        int p2 = meio + 1;// 2
        int k = inicio;//1
        
        while (p1 <= meio && p2 <= fim) { // n/2           
            if (aux[p1] < aux[p2]) {// n
                vetor[k] = aux[p1];// n
                p1++; // n
                trocas++;
            } else {
                vetor[k] = aux[p2];// n
                p2++; // n
                trocas++;
            }
            k++; // n               
        }       
        //se a ainda há elementos na primeira metade, faz o append.
        while (p1 <= meio) {// n/2
            vetor[k] = aux[p1];// n
            p1++; // n
            k++; // n
            trocas++;
        }        
        //se a ainda há elementos na segunda metade, faz o append.
        while (p2 <= fim) {// n/2
            vetor[k] = aux[p2]; // n
            p2++;// n
            k++;// n
            trocas++;
        }
    }

    public static long getTrocas() {
        return trocas;
    }

    public static void setTrocas(long trocas) {
        MergeSort.trocas = trocas;
    }
        
}
