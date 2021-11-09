package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import APS.QuickSort;
import model.Dados;
import model.DadosDAO;
import view.CreateMenu;
import view.SearchMenu;
import view.TableMenu;
import view.TelaAPS;
import view.UpdateMenu;

public class ControlTela {
	DadosDAO mng = new DadosDAO();
	QuickSort qk = new QuickSort();
	public void Create(TelaAPS tela) {
		try { 	
			mng.CriarArquivo("entrada");
		}catch(IOException e){
			show(e);
		}
	}
	
	public void Insert(CreateMenu tela) {
		Dados insert = new Dados();
		insert.setAno(tela.getYear());
		insert.setSiglaEstado(tela.getStateChoice());
		insert.setAreaTotal(Double.parseDouble(tela.getArea()));
		insert.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		insert.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		insert.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		insert.setDataAtualiz("Inserir aqui a data Atualizada");
		mng.EscreverArquivo(insert, "entrada");
	}
	
	public void Read(TableMenu tela) {
		try {
			ArrayList<Dados> lista = mng.LerArquivo("");
			//Ações que vão levar o valor dessa lista para a tela
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void Update(UpdateMenu tela) {
		Dados dado = new Dados();
		dado.setAno("");
		dado.setSiglaEstado(tela.getStateChoice());
		dado.setAreaTotal(Double.parseDouble(tela.getArea()));
		dado.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		dado.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		dado.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		dado.setDataAtualiz("Inserir aqui a data Atualizada");
		try {
			ArrayList<Dados> lista = mng.LerArquivo("entrada");
			mng.Update(tela.getID(), dado, lista, "entrada");
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void Search(SearchMenu tela) {
		try {
			ArrayList<Dados> lista = SelectSearch(tela.getSearchChoice(), tela);
			//Ações que vão levar essa arraylist pro objeto da JList na tela
		} catch(IOException e) {
			show(e);
		}
	}
	
	private ArrayList<Dados> SelectSearch(String posicao, SearchMenu tela) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		String valorPesquisa = tela.getSearchChosen();
		switch(posicao) {
		//valor de Posição é igual ao nome das opções do combobox no SearchMenu
		case "Ano":
			resultado = mng.PesquisaAno(valorPesquisa, "entrada");
			break;
		case "Data Atualizada":
			resultado = mng.PesquisaDataAtualiz(valorPesquisa, "entrada");
			break;
		case "Estado":
			resultado = mng.PesquisaSigla(valorPesquisa, "entrada");
			break;
		case "Area total":
			resultado = mng.PesquisaAreaTotal(Double.parseDouble(valorPesquisa), "entrada");
			break;
		case "Area desmatada":
			resultado = mng.PesquisaAreaDesmatadaAno(Double.parseDouble(valorPesquisa), "entrada");
			break;
		case "Porcentagem reflorestada":
			resultado = mng.PesquisaIndReflorestamento(Double.parseDouble(valorPesquisa), "entrada");
			break;
		case "Porcentagem usada industrialmente":
			resultado = mng.PesquisaIndIndustrial(Double.parseDouble(valorPesquisa), "entrada");
			break;
		}
		return resultado;
	}
	
	public void Delete(TelaAPS tela) {
		try{
			mng.Delete("entrada");
			JOptionPane.showMessageDialog(null, "Dado deletado da Fila com Sucesso!", "Sucesso", 0);
		} catch(IOException e){
				show(e);
		}
	}
	
	public void QuickSort() {
		try {
			ArrayList<Dados> lista = mng.LerArquivo("entrada");
			lista  = qk.quickSort(lista, 0, lista.size()-1);
			mng.EscreverArquivo(lista, "QuickSort");
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void MergeSort() {
		//Mesmo conceito do QuickSort porém com o Merge
		/*
		try {
			
		}catch(IOException e) {
			show(e);
		}
		*/
	}
	
	private void show(IOException e) {
		JOptionPane.showMessageDialog(null, e, "Erro", 0);
	}
}
