package APS4;

import java.util.ArrayList;

import model.Dados;

public class Sort {
	public void quickSort(ArrayList<Dados> lista, int inicio, int fim){
		if(inicio<fim) {
			int posicaoPivo = separar(lista, inicio, fim);
			quickSort(lista, inicio, posicaoPivo-1);
			quickSort(lista, posicaoPivo+1, fim);
		}
	}
	
	public int separar(ArrayList<Dados>lista, int inicio, int fim) {
		Dados pivo = lista.get(inicio);
		int i = inicio +1, f = fim;
		while(i<=f) {
			if(Compara(lista.get(i).getAno(), pivo.getAno())) {
				i++;
			}
			else if(Compara(pivo.getAno(), lista.get(f).getAno())) {
				f--;
			}
			else {
				Dados troca = lista.get(i);
				lista.set(i, lista.get(f));
				lista.set(f, troca);
				i++;
				f--;
			}
		}
		lista.set(inicio, lista.get(f));
		lista.set(f, pivo);
		return f;
	}
    
	public void mergeSort(ArrayList<Dados> lista, int tamanho) {
		if(tamanho<2) {
			return;
		}
		ArrayList<Dados> esquerda = new ArrayList<Dados>();
		ArrayList<Dados> direita = new ArrayList<Dados>();
		int meio = tamanho/2;
		for(int i = 0; i<meio; i++) {
			esquerda.add(lista.get(i));
		}
		for(int i = meio; i < tamanho; i++) {
			direita.add(lista.get(i));
		}
		mergeSort(esquerda, meio);
		mergeSort(direita, tamanho - meio);
		
		merge(lista, esquerda, direita, meio, tamanho - meio);
	}
	
	private void merge(ArrayList<Dados> lista_Inicial, ArrayList<Dados> lista_Esquerda, ArrayList<Dados> lista_Direita, int esquerda, int direita) {
		int i = 0, j = 0, k = 0;
		
		while(i < esquerda && j < direita) {
			if(Compara(lista_Esquerda.get(i).getAno(), lista_Direita.get(j).getAno())) {
				lista_Inicial.set(k++, lista_Esquerda.get(i++));
			} else {
				lista_Inicial.set(k++, lista_Direita.get(j++));
			}
		}
		while(i<esquerda) {
			lista_Inicial.set(k++, lista_Esquerda.get(i++));
		}
		while(j<direita) {
			lista_Inicial.set(k++, lista_Direita.get(j++));
		}
	}
	
    private boolean Compara(String primeira, String segunda) {
    	if(primeira.compareToIgnoreCase(segunda)<=0) {
    		return true;
    	}else
    		return false;
    }
	
	
}
