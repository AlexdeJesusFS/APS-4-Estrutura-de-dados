
package Comparando;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000000];//100x, 1.000x, 10.000x, 100.000x, 1.000.000
        
        for(int i=0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }
        
        long inicio, fim;
        //System.out.print((fim-inicio)/1000)); 
        
        System.out.println("Comparando Algoritmos de Orndernação");               
        System.out.println("Tempo em MilliSsegundos");
        /*
        System.out.println("\nBubble Sort");        
        BubbleSort bublle = new BubbleSort();
        inicio = System.currentTimeMillis();
        bublle.ordenar(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));             
        System.out.println("Trocas: " + bublle.getTrocas()); 
        */
        /*
        System.out.println("\nInsertion Sort");
        InsertionSort insertion = new InsertionSort();
        inicio = System.currentTimeMillis();
        insertion.ordenar(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));             
        System.out.println("Trocas: " + insertion.getTrocas()); 
        
        System.out.println("\nSelection Sort");
        SelectionSort selection = new SelectionSort();
        inicio = System.currentTimeMillis();
        selection.ordenar(vetor.clone());
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));             
        System.out.println("Trocas: " + selection.getTrocas());              
        */
        System.out.println("\nMerge Sort");
        MergeSort merge = new MergeSort();
        inicio = System.currentTimeMillis();
        merge.ordenar(vetor.clone(), 0, vetor.length-1);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));             
        System.out.println("Trocas: " + merge.getTrocas());
        
        System.out.println("\nQuick Sort");
        QuickSort quick = new QuickSort();
        inicio = System.currentTimeMillis();
        quick.ordenar(vetor.clone(), 0, vetor.length);
        fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim-inicio));             
        System.out.println("Trocas: " + quick.getTrocas());   
        
    }
}
