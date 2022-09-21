import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	private List<Vereador> vereadores = new ArrayList<Vereador>();
	private String nome;
	private int numero;
	
	Partido() {}
	
	Partido(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}
	
	public void addVereador(Vereador vereador) {
		if (vereador.getPartido() == null) {
			vereador.setPartido(this);
			if (!this.vereadores.contains(vereador)) {
				this.vereadores.add(vereador);			
			}			
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 9 && numero < 100) {
			this.numero = numero;			
		}
	}
	
	public int getTotalProjAprovados() {
		int total = 0;
		for (Vereador v : this.vereadores) {
			total += v.getQtdProjAprovados();
		}
		return total;
	}
	
	public int getTotalProjApresentados() {
		int total = 0;
		for (Vereador v : this.vereadores) {
			total += v.getQtdProjApresentados();
		}
		return total;
	}
	
	public double getMediaDesempenho() {
		double total = 0;
		for (Vereador v : this.vereadores) {
			total += v.getDesempenho();
		}
		return total / this.vereadores.size();
	}
	
	public Vereador getVereadorMaisProjAprovados() {
		if (this.vereadores.isEmpty()) {
			return null;
		}
		Vereador vereador = this.vereadores.get(0);
		for (Vereador v : this.vereadores) {
			if (v.getQtdProjAprovados() > vereador.getQtdProjAprovados()) {
				vereador = v;
			}
		}
		return vereador;
	}	
	
	public Vereador getVereadorMaisProjApresentados() {
		if (this.vereadores.isEmpty()) {
			return null;
		}
		Vereador vereador = this.vereadores.get(0);
		for (Vereador v : this.vereadores) {
			if (v.getQtdProjApresentados() > vereador.getQtdProjApresentados()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMaiorDesempenho() {
		if (this.vereadores.isEmpty()) {
			return null;
		}
		Vereador vereador = this.vereadores.get(0);
		for (Vereador v : this.vereadores) {
			if (v.getDesempenho() > vereador.getDesempenho()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		if (this.vereadores.isEmpty()) {
			return null;
		}
		Vereador vereador = this.vereadores.get(0);
		for (Vereador v : this.vereadores) {
			if (v.getDesempenho() < vereador.getDesempenho()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador[] getVereadores() {
		Vereador[] vereadores = new Vereador[this.vereadores.size()];
		for (int i = 0; i < this.vereadores.size(); i++) {
			vereadores[i] = this.vereadores.get(i);
		}
		return vereadores;
	}
	

}
