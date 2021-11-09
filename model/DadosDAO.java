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
	public void CriarArquivo(String nomeDoArquivo) throws IOException{  
			arquivo = new File("C:/Aps4Dados/"+nomeDoArquivo+".txt");
			arquivo.getParentFile().mkdir();
			if(arquivo.createNewFile()) {
				JOptionPane.showMessageDialog(null,"Arquivo "+arquivo.getName()+" Criado com sucesso!");
			}
			else {
				JOptionPane.showMessageDialog(null,"Arquivo já existe!");
			}
	}
	
	//Metodos de Manipulação de Dados
	
	//Escreve no final do arquivo os dados adicionados
	public void EscreverArquivo(Dados dado, String nomeDoArquivo) { 
		try {
			boolean verificador = ChecaArquivo(nomeDoArquivo);
			bw = new BufferedWriter(new FileWriter("C:/Aps4Dados/"+nomeDoArquivo+".txt",true));
			if(!verificador) {
				bw.write("--Inicio--\n");	
			}
			bw.write(dado.getAno()+"\n");
			bw.write(dado.getDataAtualiz()+"\n");
			bw.write(dado.getSiglaEstado()+"\n");
			bw.write(dado.StringAreaTotal()+"\n");
			bw.write(dado.StringAreaDesmatada()+"\n");
			bw.write(dado.StringReflorestamento()+"\n");
			bw.write(dado.StringIndustrial()+"\n");
			bw.write("--count--\n");
			bw.close();
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, e, "Erro", 0);
		}
	}
	
	//Sobrescreve o arquivo existente com os dados da Arraylist
	public void EscreverArquivo(ArrayList<Dados> informacao, String nomeDoArquivo) throws IOException{ 
			bw = new BufferedWriter(new FileWriter("C:/Aps4Dados/"+nomeDoArquivo+".txt",false));
			bw.write("");
			informacao.forEach((dado) -> EscreverArquivo(dado,nomeDoArquivo));
	}
	
	//Lê o arquivo completo e retorna todos os valores para uma Arraylist
	public ArrayList<Dados> LerArquivo(String nomeDoArquivo) throws IOException{
		br = new BufferedReader(new FileReader("C:/Aps4Dados/"+nomeDoArquivo+".txt"));
		ArrayList<Dados> lista = new ArrayList<Dados>();
		String verificador = "";
		do {
			br.readLine();
			verificador = br.readLine();
			if(verificador!=null) {
				Dados informacao = new Dados();
				informacao.setAno(verificador);
				informacao.setDataAtualiz(br.readLine());
				informacao.setSiglaEstado(br.readLine());
				informacao.setAreaTotal(Double.parseDouble(br.readLine()));
				informacao.setAreaDesmatadaAno(Double.parseDouble(br.readLine()));
				informacao.setIndReflorestamento(Double.parseDouble(br.readLine()));
				informacao.setIndIndustrial(Double.parseDouble(br.readLine()));
				lista.add(informacao);
			}
		}
		while(verificador!=null);
		for (Dados dado : lista) {
			dado.setIndice(Indice(lista, dado));
		}
		return lista;
	}
	
	public void Update(int indice, Dados dado, ArrayList<Dados> lista, String nomeDoArquivo) throws IOException{
		
		lista.set(indice, dado);
		EscreverArquivo(lista, nomeDoArquivo);
	}
	
	public void Delete(String nomeDoArquivo) throws IOException{
		ArrayList<Dados> lista = LerArquivo(nomeDoArquivo);
		lista.remove(0);
		EscreverArquivo(lista, nomeDoArquivo);
	}
	
	//Metodos de Pesquisa
		public ArrayList<Dados> PesquisaAno(String Ano, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getAno()==Ano) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaDataAtualiz(String dataAtualiz, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getDataAtualiz()==dataAtualiz) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaSigla(String siglaEstado, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getSiglaEstado()==siglaEstado) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaAreaTotal(double areaTotal, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getAreaTotal()==areaTotal) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaAreaDesmatadaAno(double areaDesmatadaAno, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getAreaDesmatadaAno()==areaDesmatadaAno) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaIndReflorestamento(double indReflorestamento, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getIndReflorestamento()==indReflorestamento) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
		public ArrayList<Dados> PesquisaIndIndustrial(double indIndustrial, String nomeDoArquivo) throws IOException{
			ArrayList<Dados> resultado = new ArrayList<Dados>();
	 		ArrayList<Dados> informacoes = LerArquivo(nomeDoArquivo);
			for(Dados dado: informacoes) {
				if(dado.getIndIndustrial()==indIndustrial) {
					resultado.add(dado);
				}
			}
			return resultado;
		}
		
	//Métodos de Utilidade
	
	//verifica se o arquivo possui dados escritos
	public boolean ChecaArquivo(String nomeDoArquivo) throws IOException {
		br = new BufferedReader(new FileReader("C:/Aps4Dados/"+nomeDoArquivo+".txt"));
		String verificada = br.readLine();
		br.close();
		if(verificada==null) {
			return false;
		}else {
			return true;
		}
	}
	
	//conta a quantidade de dados presentes no arquivo
	/*
	public int ContarQuantidade(String nomeDoArquivo) throws IOException{
		int contador = 0;
		br = new BufferedReader(new FileReader("C:/Aps4Dados/"+nomeDoArquivo+".txt"));
		String linha = "";
		while((linha=br.readLine())!=null) {
			if(linha.equals("--count--")) {
				contador++;
			}
		}
		br.close();
		return contador;
	}
	*/
	//Retorna o Indice do objeto dentro do vetor dado
	public int Indice(ArrayList<Dados> lista, Dados dado) {
		return lista.indexOf(dado);
	}
}


