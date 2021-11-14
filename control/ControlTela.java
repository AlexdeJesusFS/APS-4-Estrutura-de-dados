package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import APS4.Sort;
import model.Dados;
import model.DadosDAO;
import view.CreateMenu;
import view.SearchMenu;
import view.TableMenu;
import view.TelaAPS;
import view.UpdateMenu;

public class ControlTela {
	static Logger log = LogManager.getLogger(ControlTela.class);
	DadosDAO mng = new DadosDAO();
	Sort sort = new Sort();
	
	public void Create(TelaAPS tela) {
		try { 	
			mng.CriarArquivo("entrada");
		}catch(IOException e){
			show(e);
		}
	}
	
	public void Insert(CreateMenu tela) {
		Dados insert = new Dados();
		insert.setAno(tela.getYearPosted());
		insert.setEstado(tela.getStateChoice());
		insert.setAreaTotal(Double.parseDouble(tela.getArea()));
		insert.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		insert.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		insert.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		insert.setDataAtualiz(tela.getDataPostada());
		mng.EscreverArquivo(insert, "entrada");
		JOptionPane.showMessageDialog(tela, "Dado Adicionado com Sucesso!");
	}
	
	public void Read(TableMenu tela) {
		try {
			ArrayList<Dados> lista = mng.LerArquivo(tela.getArchiveName());
			DefaultTableModel modelo = (DefaultTableModel) tela.getTable().getModel();
			modelo.setRowCount(0);
			for(int i = 0; i < lista.size(); i++) {
				Object[] linha = new Object[8];
				linha[0] = Integer.toString(lista.get(i).getIndice());
				linha[1] = lista.get(i).getAno();
				linha[2] = lista.get(i).getDataAtualiz();
				linha[3] = lista.get(i).getEstado();
				linha[4] = lista.get(i).StringAreaTotal();
				linha[5] = lista.get(i).StringAreaDesmatada();
				linha[6] = lista.get(i).StringReflorestamento();
				linha[7] = lista.get(i).StringIndustrial();
				modelo.addRow(linha);
			}
			tela.getTable().setModel(modelo);
			//Ações que vão levar o valor dessa lista para a tela
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void Update(UpdateMenu tela) {
		Dados dado = new Dados();
		dado.setAno(tela.getYearPosted());
		dado.setEstado(tela.getStateChoice());
		dado.setAreaTotal(Double.parseDouble(tela.getArea()));
		dado.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		dado.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		dado.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		dado.setDataAtualiz(tela.getDataPostada());
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
			DefaultTableModel modelo = (DefaultTableModel) tela.getTable().getModel();
			modelo.setRowCount(0);
			for(int i = 0; i < lista.size(); i++) {
				Object[] linha = new Object[8];
				linha[0] = Integer.toString(lista.get(i).getIndice());
				linha[1] = lista.get(i).getAno();
				linha[2] = lista.get(i).getDataAtualiz();
				linha[3] = lista.get(i).getEstado();
				linha[4] = lista.get(i).StringAreaTotal();
				linha[5] = lista.get(i).StringAreaDesmatada();
				linha[6] = lista.get(i).StringReflorestamento();
				linha[7] = lista.get(i).StringIndustrial();
				modelo.addRow(linha);
			}
			tela.getTable().setModel(modelo);
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
			JOptionPane.showMessageDialog(tela, "Primeiro dado deletado da fila com Sucesso!", "Deletado", 0);
		} catch(IOException e){
				show(e);
		}
	}
	
	public void QuickSort(TelaAPS tela) {
		try {
			ArrayList<Dados> lista = mng.LerArquivo("entrada");
			if(lista.isEmpty()) {
				JOptionPane.showMessageDialog(tela, "O Arquivo de Dados entrada.txt ainda não existe.\nCrie ele no botão ");
			}else {
				log.info("Inicio do QuickSort com "+ lista.size() + " objetos.");
				sort.quickSort(lista, 0, lista.size()-1);
				log.info("Termino do QuickSort com "+ lista.size() + " objetos.");
				mng.CriarArquivo("QuickSort");
				mng.EscreverArquivo(lista, "QuickSort");
			}
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void MergeSort(TelaAPS tela) {
		try {
			ArrayList<Dados> lista = mng.LerArquivo("entrada");
			if(lista.isEmpty()) {
				JOptionPane.showMessageDialog(tela, "O Arquivo de Dados entrada.txt ainda não existe.\nCrie ele no botão ");
			}else {
				log.info("Inicio do MergeSort com "+ lista.size() + " objetos.");
				sort.mergeSort(lista, lista.size()-1);
				log.info("Termino do MergeSort com "+ lista.size() + " objetos.");
				mng.CriarArquivo("MergeSort");
				mng.EscreverArquivo(lista, "MergeSort");
			}
		}catch(IOException e) {
			show(e);
		}
	}
	
	private void show(IOException e) {
		JOptionPane.showMessageDialog(null, e, "Erro", 0);
	}
}
