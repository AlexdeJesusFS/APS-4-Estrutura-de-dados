
package APS;

public class MergeSort {
    private final int[] vetor;
    
    public MergeSort(int n) {
        vetor = new int[n];
    }
    
    private void merge(int[] v, int[] w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio+fim)/2;
            merge(v, w, inicio, meio);
            merge(v, w, meio+1, fim);
            intercalar(v, w, inicio, meio, fim);     
        }  
    }
    
    private void intercalar(int[] v, int[] w, int inicio, int meio, int fim){
        
        
        
    }
    
}
