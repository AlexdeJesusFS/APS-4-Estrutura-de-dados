
package APS;

public class Main {

    public static void main(String[] args) {
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
    }
    
}
