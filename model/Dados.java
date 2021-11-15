package model;

public class Dados {
	private int indice;
	private String ano;
	private String mes;
	private String data_Atualizada;
	private String estado;
	private double area_total;
	private double area_desmatada_ano;
	private double indice_Reflorestamento;
	private double indice_Industrial;
	public Dados() {
		
	}
	
	//Getter and Setters
	public int getIndice() {
		return indice;
	}
	
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public String getDataAtualizada() {
		return data_Atualizada;
	}
	
	public void setDataAtualizada(String data_Atualizada) {
		this.data_Atualizada = data_Atualizada;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public double getAreaTotal() {
		return area_total;
	}
	
	public void setAreaTotal(double area_total) {
		this.area_total = area_total;
	}
	
	public double getAreaDesmatadaAno() {
		return area_desmatada_ano;
	}
	
	public void setAreaDesmatadaAno(double areaDestamatadaAno) {
		this.area_desmatada_ano = areaDestamatadaAno;
	}
	
	public double getIndReflorestamento() {
		return indice_Reflorestamento;
	}
	
	public void setIndReflorestamento(double indice_Reflorestamento) {
		this.indice_Reflorestamento = indice_Reflorestamento;
	}
	
	public double getIndIndustrial() {
		return indice_Industrial;
	}
	
	public void setIndIndustrial(double indice_Industrial) {
		this.indice_Industrial = indice_Industrial;
	}
	
	//Metodos para String
	public String StringAreaTotal() {
		return Double.toString(area_total);
	}
	
	public String StringAreaDesmatada() {
		return Double.toString(area_desmatada_ano);
	}
	
	public String StringReflorestamento() {
		return Double.toString(indice_Reflorestamento);
	}
	
	public String StringIndustrial() {
		return Double.toString(indice_Industrial);
	}
}
