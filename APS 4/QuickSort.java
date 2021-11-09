package APS;

import java.util.ArrayList;

import model.Dados;

public class QuickSort {   
	
	public ArrayList<Dados> quickSort(ArrayList<Dados> lista, int inicio, int fim){
		ArrayList<Dados> resultado = lista;
		if(inicio<fim) {
			int posicaoPivo = separar(resultado, inicio, fim);
			quickSort(resultado, inicio, posicaoPivo-1);
			quickSort(resultado, posicaoPivo+1, fim);
		}
		return resultado;
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
    
    public boolean Compara(String primeira, String segunda) {
    	if(primeira.compareToIgnoreCase(segunda)<=0) {
    		return true;
    	}else
    		return false;
    }
}
