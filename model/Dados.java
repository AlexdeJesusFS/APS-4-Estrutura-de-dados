package model;

public class Dados {
	private int indice;
	private String ano;
	private String dataAtualiz;
	private String estado;
	private double areaTotal;
	private double areaDesmatadaAno;
	private double indReflorestamento;
	private double indIndustrial;
	public Dados() {
		
	}
	
	public Dados(String ano ,String estado, double areaTotal, double areaDesmatadaAno, double indReflorestamento, double indIndustrial){
		setAno(ano);
		setEstado(estado);
		setAreaTotal(areaTotal);
		setAreaDesmatadaAno(areaDesmatadaAno);
		setIndReflorestamento(indReflorestamento);
		setIndIndustrial(indIndustrial);
		setDataAtualiz("");
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
	
	public String getDataAtualiz() {
		return dataAtualiz;
	}
	
	public void setDataAtualiz(String dataAtualiz) {
		this.dataAtualiz = dataAtualiz;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public double getAreaTotal() {
		return areaTotal;
	}
	
	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}
	
	public double getAreaDesmatadaAno() {
		return areaDesmatadaAno;
	}
	
	public void setAreaDesmatadaAno(double areaDestamatadaAno) {
		this.areaDesmatadaAno = areaDestamatadaAno;
	}
	
	public double getIndReflorestamento() {
		return indReflorestamento;
	}
	
	public void setIndReflorestamento(double indReflorestamento) {
		this.indReflorestamento = indReflorestamento;
	}
	
	public double getIndIndustrial() {
		return indIndustrial;
	}
	
	public void setIndIndustrial(double indIndustrial) {
		this.indIndustrial = indIndustrial;
	}
	
	//Metodos para String
	public String StringAreaTotal() {
		return Double.toString(areaTotal);
	}
	
	public String StringAreaDesmatada() {
		return Double.toString(areaDesmatadaAno);
	}
	
	public String StringReflorestamento() {
		return Double.toString(indReflorestamento);
	}
	
	public String StringIndustrial() {
		return Double.toString(indIndustrial);
	}
}
