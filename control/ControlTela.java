package control;

import java.io.IOException;
import javax.swing.JOptionPane;

import model.Dados;
import model.DadosDAO;
import view.TelaAPS;

public class ControlTela {
	DadosDAO mng = new DadosDAO();
	
	public void Create() {
		try {
			mng.CriarArquivo("entrada");
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e, "Erro", 0);
		}
	}
	
	public void Insert() {
		
	}
	
	public void Read() {
		
	}
	
	public void Update(TelaAPS tela) {
		Dados dado = new Dados();
	}
	
	public void Delete(TelaAPS tela) {
		/*
		try{
		} catch(IOException e){
			mng.Delete("");	
		}
		*/
	}
	
	
}
