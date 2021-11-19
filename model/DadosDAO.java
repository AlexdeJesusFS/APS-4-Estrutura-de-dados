package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DadosDAO {
	private BufferedReader br;
	private BufferedWriter bw;
	private File arquivo;
	
	//Metodos
	//Caso não exista cria o arquivo que será salvo os dados.
	public void CriarArquivo(String nome_do_Arquivo) throws IOException{  
			arquivo = new File("C:/Aps4Dados/"+nome_do_Arquivo+".txt");
			arquivo.getParentFile().mkdir();
			if(arquivo.createNewFile()) {
				JOptionPane.showMessageDialog(null,"Arquivo "+arquivo.getName()+" criado com sucesso!", "Arquivo Criado", 1);
			}
	}
	
	//Metodos de Manipulação de Dados
	
	//Escreve no final do arquivo os dados adicionados
	public void EscreverArquivo(Dados dado, String nome_do_Arquivo) { 
		try {
			arquivo = new File("C:/Aps4Dados/"+nome_do_Arquivo+".txt");
			if(arquivo.isFile()) {
				boolean verificador = ChecaArquivo(nome_do_Arquivo);
				bw = new BufferedWriter(new FileWriter(arquivo,true));
				if(!verificador) {
					bw.write("--Inicio--\n");	
				}
				bw.write(dado.getAno()+"\n");
				bw.write(dado.getMes()+"\n");
				bw.write(dado.getDataAtualizada()+"\n");
				bw.write(dado.getEstado()+"\n");
				bw.write(dado.StringAreaTotal()+"\n");
				bw.write(dado.StringAreaDesmatada()+"\n");
				bw.write(dado.StringReflorestamento()+"\n");
				bw.write(dado.StringIndustrial()+"\n");
				bw.write("--count--\n");
				bw.close();
			}else {
				semArquivo(nome_do_Arquivo);
			}
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, e, "Erro", 0);
		}
	}
	
	//Sobrescreve o arquivo existente com os dados da Arraylist
	public void EscreverArquivo(ArrayList<Dados> informacao, String nome_do_Arquivo) throws IOException{ 
		arquivo = new File("C:/Aps4Dados/"+nome_do_Arquivo+".txt");
		if(arquivo.isFile()) {
			bw = new BufferedWriter(new FileWriter(arquivo,false));
			bw.write("");
			bw.close();
			informacao.forEach((dado) -> EscreverArquivo(dado,nome_do_Arquivo));
		} else {
			semArquivo(nome_do_Arquivo);
		}
	}
	
	//Lê o arquivo completo e retorna todos os valores para uma Arraylist
	public ArrayList<Dados> LerArquivo(String nome_do_Arquivo) throws IOException{
		arquivo = new File("C:/Aps4Dados/"+nome_do_Arquivo+".txt");
		ArrayList<Dados> lista = new ArrayList<Dados>();
		if(arquivo.isFile()) {
			br = new BufferedReader(new FileReader(arquivo));
			String verificador = "";
			do {
				br.readLine();
				verificador = br.readLine();
				if(verificador!=null) {
					Dados informacao = new Dados();
					informacao.setAno(verificador);
					informacao.setMes(br.readLine());
					informacao.setDataAtualizada(br.readLine());
					informacao.setEstado(br.readLine());
					informacao.setAreaTotal(Double.parseDouble(br.readLine()));
					informacao.setAreaDesmatadaAno(Double.parseDouble(br.readLine()));
					informacao.setIndReflorestamento(Double.parseDouble(br.readLine()));
					informacao.setIndIndustrial(Double.parseDouble(br.readLine()));
					lista.add(informacao);
				}
			}
			while(verificador!=null);
			br.close();
			for (Dados dado : lista) {
				dado.setIndice(Indice(lista, dado));
			}
		}else {
			semArquivo(nome_do_Arquivo);
		}
		return lista;
	}
	//Atualiza o valor do arquivo de dados de acordo com o indice recebido.
	public void Update(int indice, Dados dado, ArrayList<Dados> lista, String nome_do_Arquivo) throws IOException{
		lista.set(indice, dado);
		EscreverArquivo(lista, nome_do_Arquivo);
	}
	//Deleta o primeiro valor do arquivo de dados.
	public void Delete(String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> lista = LerArquivo(nome_do_Arquivo);
		if(!lista.isEmpty()) {
			lista.remove(0);
			EscreverArquivo(lista, nome_do_Arquivo);	
		}
	}
	
	//Metodos de Pesquisa
	
	//Pesquisa valores no arquivo de dados que coincidam com o ano digitado pelo usuário.
	public ArrayList<Dados> PesquisaAno(String Ano, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(dado.getAno().equals(Ano)) {
					resultado.add(dado);
			}
		}
			return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com o mês digitado pelo usuário.	
	public ArrayList<Dados> PesquisaMes(String mes, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(dado.getMes().toLowerCase().equals(mes.toLowerCase())) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com a data atualizada digitada pelo usuário.	
	public ArrayList<Dados> PesquisaDataAtualiz(String data_Atualizada, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(dado.getDataAtualizada().equals(data_Atualizada)) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com o estado digitado pelo usuário.	
	public ArrayList<Dados> PesquisaEstado(String estado, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(dado.getEstado().toLowerCase().equals(estado.toLowerCase())) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com área total digitada pelo usuário.	
	public ArrayList<Dados> PesquisaAreaTotal(double area_Total, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(Double.compare(dado.getAreaTotal(),area_Total) == 0) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com o valor da área desmatada por ano digitado pelo usuário.	
	public ArrayList<Dados> PesquisaAreaDesmatadaAno(double area_desmatada_ano, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(Double.compare(dado.getAreaDesmatadaAno(), area_desmatada_ano) == 0) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com o valor do indice de Reflorestamento digitado pelo usuário.
	public ArrayList<Dados> PesquisaIndReflorestamento(double indice_Reflorestamentoo, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(Double.compare(dado.getIndReflorestamento(),indice_Reflorestamentoo) == 0) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	//Pesquisa valores no arquivo de dados que coincidam com o valor do indice insdustrial digitado pelo usuário.
	public ArrayList<Dados> PesquisaIndIndustrial(double indice_Industrial, String nome_do_Arquivo) throws IOException{
		ArrayList<Dados> resultado = new ArrayList<Dados>();
		ArrayList<Dados> informacoes = LerArquivo(nome_do_Arquivo);
		for(Dados dado: informacoes) {
			if(Double.compare(dado.getIndIndustrial(),indice_Industrial) == 0) {
				resultado.add(dado);
			}
		}
		return resultado;
	}
	
	//Métodos de Utilidade
	
	//verifica se o arquivo possui dados escritos
	public boolean ChecaArquivo(String nome_do_Arquivo) throws IOException {
		br = new BufferedReader(new FileReader("C:/Aps4Dados/"+nome_do_Arquivo+".txt"));
		String verificada = br.readLine();
		br.close();
		if(verificada==null) {
			return false;
		}else {
			return true;
		}
	}
	
	//Retorna o Indice do objeto dentro do vetor dado
	public int Indice(ArrayList<Dados> lista, Dados dado) {
		return lista.indexOf(dado);
	}
	
	//mensagem caso o arquivo de dados ainda não tenha sido criado pelo usuário
	private void semArquivo(String nome_do_arquivo) {
		JOptionPane.showMessageDialog(null, "Arquivo "+nome_do_arquivo+".txt ainda não existe!!\nCrie o arquivo na pagina inicial.");
	}
}


