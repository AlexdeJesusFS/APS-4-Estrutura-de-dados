package control;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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
	DadosDAO manager = new DadosDAO();
	Sort sort = new Sort();
	
	public void Create(TelaAPS tela) {
		try {
			File arquivo = new File("C:/Aps4Dados/entrada.txt");
			if(arquivo.isFile()) {
				JOptionPane.showMessageDialog(tela, "Arquivo entrada.txt já foi criado.");
			}else {
				manager.CriarArquivo("entrada");
				IniciaDados();
			}
		}catch(IOException e){
			show(e);
		}
	}
	
	public void Insert(CreateMenu tela) {
		Dados insert = new Dados();
		insert.setAno(tela.getYearPosted());
		insert.setMes(tela.getMonthChoice());
		insert.setEstado(tela.getStateChoice());
		insert.setAreaTotal(Double.parseDouble(tela.getArea()));
		insert.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		insert.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		insert.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		insert.setDataAtualizada(tela.getDataPostada());
		manager.EscreverArquivo(insert, "entrada");
		JOptionPane.showMessageDialog(tela, "Dado Adicionado com Sucesso!");
	}
	
	public void Read(TableMenu tela) {
		try {
			ArrayList<Dados> lista = manager.LerArquivo(tela.getArchiveName());
			DefaultTableModel modelo = (DefaultTableModel) tela.getTable().getModel();
			modelo.setRowCount(0);
			for(int i = 0; i < lista.size(); i++) {
				Object[] linha = new Object[9];
				linha[0] = Integer.toString(lista.get(i).getIndice());
				linha[1] = lista.get(i).getAno();
				linha[2] = lista.get(i).getMes();
				linha[3] = lista.get(i).getDataAtualizada();
				linha[4] = lista.get(i).getEstado();
				linha[5] = lista.get(i).StringAreaTotal();
				linha[6] = lista.get(i).StringAreaDesmatada();
				linha[7] = lista.get(i).StringReflorestamento();
				linha[8] = lista.get(i).StringIndustrial();
				modelo.addRow(linha);
			}
			tela.getTable().setModel(modelo);
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void Update(UpdateMenu tela) {
		Dados dado = new Dados();
		dado.setAno(tela.getYearPosted());
		dado.setAno(tela.getMonthChoice());
		dado.setEstado(tela.getStateChoice());
		dado.setAreaTotal(Double.parseDouble(tela.getArea()));
		dado.setAreaDesmatadaAno(Double.parseDouble(tela.getAreaDesm()));
		dado.setIndReflorestamento(Double.parseDouble(tela.getPorReflo()));
		dado.setIndIndustrial(Double.parseDouble(tela.getPorIndus()));
		dado.setDataAtualizada(tela.getDataPostada());
		try {
			ArrayList<Dados> lista = manager.LerArquivo("entrada");
			manager.Update(tela.getID(), dado, lista, "entrada");
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
				Object[] linha = new Object[9];
				linha[0] = Integer.toString(lista.get(i).getIndice());
				linha[1] = lista.get(i).getAno();
				linha[2] = lista.get(i).getMes();
				linha[3] = lista.get(i).getDataAtualizada();
				linha[4] = lista.get(i).getEstado();
				linha[5] = lista.get(i).StringAreaTotal();
				linha[6] = lista.get(i).StringAreaDesmatada();
				linha[7] = lista.get(i).StringReflorestamento();
				linha[8] = lista.get(i).StringIndustrial();
				modelo.addRow(linha);
			}
			tela.getTable().setModel(modelo);
		} catch(IOException e) {
			show(e);
		}
	}
	
	private ArrayList<Dados> SelectSearch(String posicao, SearchMenu tela) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		String valor_Pesquisa = tela.getSearchChosen();
		switch(posicao) {
		//valor de Posição é igual ao nome das opções do combobox no SearchMenu
		case "Ano":
			resultado = manager.PesquisaAno(valor_Pesquisa, "entrada");
			break;
		case "Mês":
			resultado = manager.PesquisaMes(valor_Pesquisa, "entrada");
			break;
		case "Data Atualizada":
			resultado = manager.PesquisaDataAtualiz(valor_Pesquisa, "entrada");
			break;
		case "Estado":
			resultado = manager.PesquisaEstado(valor_Pesquisa, "entrada");
			break;
		case "Area total":
			resultado = manager.PesquisaAreaTotal(Double.parseDouble(valor_Pesquisa), "entrada");
			break;
		case "Area desmatada":
			resultado = manager.PesquisaAreaDesmatadaAno(Double.parseDouble(valor_Pesquisa), "entrada");
			break;
		case "Porcentagem reflorestada":
			resultado = manager.PesquisaIndReflorestamento(Double.parseDouble(valor_Pesquisa), "entrada");
			break;
		case "Porcentagem usada industrialmente":
			resultado = manager.PesquisaIndIndustrial(Double.parseDouble(valor_Pesquisa), "entrada");
			break;
		}
		return resultado;
	}
	
	public void Delete(TelaAPS tela) {
		try{
			manager.Delete("entrada");
			JOptionPane.showMessageDialog(tela, "Primeiro dado deletado da fila com Sucesso!", "Deletado", 0);
		} catch(IOException e){
				show(e);
		}
	}
	
	public void QuickSort(TelaAPS tela) {
		try {
			ArrayList<Dados> lista = manager.LerArquivo("entrada");
			if(lista.isEmpty()) {
				JOptionPane.showMessageDialog(tela, "O Arquivo de Dados entrada.txt ainda não existe.\nCrie ele no botão ");
			}else {
				log.info("Inicio do QuickSort com "+ lista.size() + " objetos.");
				sort.quickSort(lista, 0, lista.size()-1);
				log.info("Termino do QuickSort com "+ lista.size() + " objetos.");
				manager.CriarArquivo("QuickSort");
				manager.EscreverArquivo(lista, "QuickSort");
			}
		}catch(IOException e) {
			show(e);
		}
	}
	
	public void MergeSort(TelaAPS tela) {
		try {
			ArrayList<Dados> lista = manager.LerArquivo("entrada");
			if(lista.isEmpty()) {
				JOptionPane.showMessageDialog(tela, "O Arquivo de Dados entrada.txt ainda não existe.\nCrie ele no botão ");
			}else {
				log.info("Inicio do MergeSort com "+ lista.size() + " objetos.");
				sort.mergeSort(lista, lista.size()-1);
				log.info("Termino do MergeSort com "+ lista.size() + " objetos.");
				manager.CriarArquivo("MergeSort");
				manager.EscreverArquivo(lista, "MergeSort");
			}
		}catch(IOException e) {
			show(e);
		}
	}
	
	private void show(IOException e) {
		JOptionPane.showMessageDialog(null, e, "Erro", 0);
	}
	
	private void IniciaDados() throws IOException{
		Random rnd = new Random();
		ArrayList<Dados> lista = new ArrayList<Dados>();
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	    int year = localDate.getYear();;
	    int month = localDate.getMonthValue();
	    int day = localDate.getDayOfMonth();
	    String data_atualizada = year+"/"+month+"/"+day;
		for(int i = 0; i<1000; i++) {
			Dados informação = new Dados(
					Integer.toString(1950+rnd.nextInt(71)), 
					data_atualizada, 
					selectMes(rnd.nextInt(12)),
					selectEstado(rnd.nextInt(27)),
					new BigDecimal(2200.0d+rnd.nextDouble()).setScale(4, RoundingMode.HALF_UP).doubleValue(),
					new BigDecimal(270.0d+rnd.nextDouble()).setScale(4, RoundingMode.HALF_UP).doubleValue(),
					new BigDecimal(0.4d+rnd.nextDouble()).setScale(2, RoundingMode.HALF_UP).doubleValue(),
					new BigDecimal(1.5+rnd.nextDouble()).setScale(2, RoundingMode.HALF_UP).doubleValue()
					);
			lista.add(informação);
		}
		manager.EscreverArquivo(lista, "entrada");
	}
	
	private String selectMes(int numero) {
		String mes = "";
		switch(numero) {
		case 0:
			mes = "Janeiro";
			break;
		case 1:
			mes = "Fevereiro";
			break;
		case 2:
			mes = "Março";
			break;
		case 3:
			mes = "Abriu";
			break;
		case 4:
			mes = "Maio";
			break;
		case 5:
			mes = "Junho";
			break;
		case 6:
			mes = "Julho";
			break;
		case 7:
			mes = "Agosto";
			break;
		case 8:
			mes = "Setembro";
			break;
		case 9:
			mes = "Outubro";
			break;
		case 10:
			mes = "Novembro";
			break;
		case 11:
			mes = "Dezembro";
			break;
		}
		return mes;
	}
	
	private String selectEstado(int numero) {
		String estado = "";
		switch(numero) {
		case 0:
			estado = "Acre";
			break;
		case 1:
			estado = "Alagoas";
			break;
		case 2:
			estado = "Amapá";
			break;
		case 3:
			estado = "Amazonas";
			break;
		case 4:
			estado = "Bahia";
			break;
		case 5:
			estado = "Ceará";
			break;
		case 6:
			estado = "Espírito Santo";
			break;
		case 7:
			estado = "Goiás";
			break;
		case 8:
			estado = "Maranhão";
			break;
		case 9:
			estado = "Mato Grosso";
			break;
		case 10:
			estado = "Mato Grosso do sul";
			break;
		case 11:
			estado = "Minas Gerais";
			break;
		case 12:
			estado = "Pará";
			break;
		case 13:
			estado = "Paraíba";
			break;
		case 14:
			estado = "Paraná";
			break;
		case 15:
			estado = "Pernambuco";
			break;
		case 16:
			estado = "Piauí";
			break;
		case 17:
			estado = "Rio de Janeiro";
			break;
		case 18:
			estado = "Rio Grande do norte";
			break;
		case 19:
			estado = "Rio Grande do sul";
			break;
		case 20:
			estado = "Rondônia";
			break;
		case 21:
			estado = "Roraima";
			break;
		case 22:
			estado = "Santa Catarina";
			break;
		case 23:
			estado = "São Paulo";
			break;
		case 24:
			estado = "Sergipe";
			break;
		case 25:
			estado = "Tocantins";
			break;
		case 26:
			estado = "Distrito Federal";
			break;
		}
		return estado;
	}
	
}
