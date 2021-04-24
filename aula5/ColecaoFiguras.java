package aula5;
import java.util.*;

public class ColecaoFiguras{
	private double maxArea;
	ArrayList<Figura> figuras;
	
	public ColecaoFiguras(double maxArea) {
		this.maxArea = maxArea;
		figuras = new ArrayList<>();
	}
	
	public double maxArea() {
		return maxArea;
	}
	
	public boolean addFigura(Figura f) {
		if(figuras.contains(f)) {
			return false;
		}
		if(f.area() > maxArea) {
			return false;
		}
		return figuras.add(f);
	}
	
	public boolean delFigura(Figura f) {
		if(!figuras.contains(f)) {
			return false;
		}
		return figuras.remove(f);
	}
	
	public double areaTotal() {
		double tot = 0;
		for(int i=0; i<figuras.size(); i++) {
			tot += figuras.get(i).area();
		}
		return tot;
	}
	
	public boolean exists(Figura f) {
		if(figuras.contains(f)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Colecao de figuras: " + figuras.toString();
	}
	
	public Figura[] getFiguras() {
		return figuras.toArray(new Figura[0]);
	}
	
	public Ponto[] getCentros() {
		ArrayList<Ponto> pontos = new ArrayList<>();
		for(int i = 0; i < figuras.size(); i++) {
			Ponto p = figuras.get(i).centro();
			pontos.add(p);
		}
		return pontos.toArray(new Ponto[0]);
	}
}
