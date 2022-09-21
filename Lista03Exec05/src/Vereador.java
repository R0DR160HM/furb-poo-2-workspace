
public class Vereador {
	
	private String nome;
	private Partido partido;
	private int qtdProjApresentados;
	private int qtdProjAprovados;
	
	Vereador() {}
	
	Vereador(String nome, int qtdProjetosApresentados, int qtdProjAprovados, Partido partido) {
		this.setNome(nome);
		this.setQtdProjApresentados(qtdProjetosApresentados);
		this.setQtdProjAprovados(qtdProjAprovados);
		this.setPartido(partido);
	}
 	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQtdProjApresentados() {
		return qtdProjApresentados;
	}
	
	public void setQtdProjApresentados(int qtdProjApresentados) {
		if (qtdProjApresentados >= 0) {
			this.qtdProjApresentados = qtdProjApresentados;			
		}
	}
	
	public int getQtdProjAprovados() {
		return qtdProjAprovados;
	}
	
	public void setQtdProjAprovados(int qtdProjAprovados) {
		if (qtdProjAprovados >= 0 && this.qtdProjApresentados >= qtdProjAprovados) {
			this.qtdProjAprovados = qtdProjAprovados;			
		}
	}
	
	public double getIndiceTrabalho() {
		if (this.qtdProjApresentados == 0) {
			return 0;
		} else if (this.qtdProjApresentados <= 5) {
			return 0.8;
		} else if (this.qtdProjApresentados <= 10) {
			return 1;
		} else if (this.qtdProjApresentados <= 17) {
			return 1.08;
		}
		return 1.22;
	}
	
	public double getDesempenho() {
		return (this.qtdProjAprovados / this.qtdProjApresentados) * this.getIndiceTrabalho();
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
		partido.addVereador(this);
	}

}
