package manipulaArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManagerDados {
	private BufferedReader br;
	private BufferedWriter bw;
	private File arquivo;
	public void CriarArquivo(String nomeDoArquivo) {
		try {
			arquivo = new File(nomeDoArquivo+".txt");
			if(arquivo.createNewFile()) {
				System.out.println("Arquivo "+arquivo.getName()+" Criado com sucesso!");
			}
			else {
				System.out.println("Arquivo já existe!");
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public void EscreverArquivo(Dados dado, String nomeDoArquivo) {
		try {
			boolean verificador = ChecaArquivo(nomeDoArquivo);
			bw = new BufferedWriter(new FileWriter(nomeDoArquivo+".txt",true));
			if(!verificador) {
				bw.write("--Inicio--\n");	
			}
			bw.write(dado.getCodigo()+"\n");
			bw.write(dado.getDataAtualiz()+"\n");
			bw.write(dado.getDataPost()+"\n");
			bw.write(dado.getSiglaEstado()+"\n");
			bw.write(dado.StringAreaTotal()+"\n");
			bw.write(dado.StringAreaDesmatada()+"\n");
			bw.write(dado.StringReflorestamento()+"\n");
			bw.write(dado.StringIndustrial()+"\n");
			bw.write("--count--\n");
			bw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public Dados[] LerArquivo(String nomeDoArquivo) {
		int quantidadeDeDados = 0;
		try {
			boolean verificador = ChecaArquivo(nomeDoArquivo);
			br = new BufferedReader(new FileReader(nomeDoArquivo+".txt"));
			if(verificador) {
				while(br.readLine()!=null) {
					if(br.readLine().equals("--count--\n")) {
						quantidadeDeDados++;
					}
					
					br.readLine();
					br.close();	
				}	
			}else {
				quantidadeDeDados = 0;
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		Dados[] resultado = new Dados[quantidadeDeDados];
		return resultado;
	}
	
	public boolean ChecaArquivo(String nomeDoArquivo) throws IOException {
		br = new BufferedReader(new FileReader(nomeDoArquivo+".txt"));
		String verificada = br.readLine();
		br.close();
		if(verificada==null) {
			return false;
		}else {
			return true;
		}
	}
	
	public int ContarQuantidade(String nomeDoArquivo) throws IOException{
		int contador = 0;
		br = new BufferedReader(new FileReader(nomeDoArquivo+".txt"));
		String linha = "";
		while(linha!=null) {
			linha = br.readLine();
			if(linha != null) {
				if(linha.equals("--count--\n")) {
					contador++;
				}
			}
		}
		return contador;
	}
}


