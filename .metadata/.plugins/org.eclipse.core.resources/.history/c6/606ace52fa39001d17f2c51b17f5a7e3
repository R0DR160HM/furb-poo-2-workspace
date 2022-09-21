import java.util.ArrayList;
import java.util.List;

public class Camara {
	
	private List<Partido> partidos = new ArrayList<Partido>();
	
	public double getMediaDesempenho() {
		double total = 0;
		for (Partido p : this.partidos) {
			total += p.getMediaDesempenho();
		}
		return total / this.partidos.size();
	}
	
	public void addPartido(Partido partido) {
		this.partidos.add(partido);
	}
	
	public int getTotalProjetosApresentados() {
		int total = 0;
		for (Partido p : this.partidos) {
			total += p.getTotalProjApresentados();
		}
		return total;
	}	
	
	public int getTotalProjetosAprovados() {
		int total = 0;
		for (Partido p : this.partidos) {
			total += p.getTotalProjAprovados();
		}
		return total;
	}
	
	public Vereador getVereadorMaisProjAprovados() {
		Vereador vereador = new Vereador();
		for (Partido p : this.partidos) {
			Vereador v = p.getVereadorMaisProjAprovados();
			if (v.getQtdProjAprovados() > vereador.getQtdProjAprovados()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMaisProjApresentados() {
		Vereador vereador = new Vereador();
		for (Partido p : this.partidos) {
			Vereador v = p.getVereadorMaisProjApresentados();
			if (v.getQtdProjApresentados() > vereador.getQtdProjApresentados()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMaiorDesempenho() {
		Vereador vereador = new Vereador();
		for (Partido p : this.partidos) {
			Vereador v = p.getVereadorMaiorDesempenho();
			if (v.getDesempenho() > vereador.getDesempenho()) {
				vereador = v;
			}
		}
		return vereador;
	}
	
	public Vereador getVereadorMenorDesempenho() {
		Vereador vereador = this.getVereadorMaiorDesempenho();
		for (Partido p : this.partidos) {
			Vereador v = p.getVereadorMenorDesempenho();
			if (v.getDesempenho() < vereador.getDesempenho()) {
				vereador = v;
			}
		}
		return vereador;
	}

}
