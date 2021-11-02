package manipulaArquivo;

public class Dados {
	private int codigo;
	private String dataPost;
	private String dataAtualiz;
	private String SiglaEstado;
	private double areaTotal;
	private double areaDesmatadaAno;
	private double indReflorestamento;
	private double indIndustrial;
	
	public Dados() {
		
	}
	
	public Dados(int codigo, String dataPost, String dataAtualiz, String siglaEstado, double areaTotal, double areaDesmatadaAno, double indReflorestamento, double indIndustrial){
		setCodigo(codigo);
		setDataPost(dataPost);
		setDataAtualiz(dataAtualiz);
		setSiglaEstado(siglaEstado);
		setAreaTotal(areaTotal);
		setAreaDesmatadaAno(areaDesmatadaAno);
		setIndReflorestamento(indReflorestamento);
		setIndIndustrial(indIndustrial);
	}
	
	
	//Getter and Setters
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getDataPost() {
		return dataPost;
	}
	
	public void setDataPost(String dataPost) {
		this.dataPost = dataPost;
	}
	
	public String getDataAtualiz() {
		return dataAtualiz;
	}
	
	public void setDataAtualiz(String dataAtualiz) {
		this.dataAtualiz = dataAtualiz;
	}
	
	public String getSiglaEstado() {
		return SiglaEstado;
	}
	
	public void setSiglaEstado(String siglaEstado) {
		SiglaEstado = siglaEstado;
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
