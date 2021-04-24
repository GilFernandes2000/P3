package aula3;
import java.util.*;

public class Veiculo {
	private Condutor condutor;
	private Carta carta;
	private ArrayList<Pessoa> pesso;
	private int lotacao;
	private double cilindrada;
	private double potencia;
	private double pesoB;
	
	public Veiculo(Condutor condutor, Carta carta, int lotacao, double cilindrada, double potencia, double pesoB) {
		this.condutor = condutor;
		this.carta = carta;
		this.lotacao = lotacao;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.pesoB = pesoB;
		pesso = new ArrayList<>();
	}
	
	public Condutor condutor() {
		return condutor;
	}
	public Carta carta() {
		return carta;
	}
	public int lotacao() {
		return lotacao;
	}
	public double cilindrada() {
		return cilindrada;
	}
	public double potencias() {
		return potencia;
	}
	public double pesoBruto() {
		return pesoB;
	}
	
	public void addPessoa(Pessoa p) {
		if(pesso.size() < lotacao - 1) {
			pesso.add(p);
		}
		else {
			System.out.print("Carro cheio");
		}
	}
	
	public void removePessoa(Pessoa p) {
		assert pesso.isEmpty():"Carro esta vazio";
		pesso.remove(p);
	}
	
	public boolean temCarta() {
		return carta.equals(condutor.carta());
	}
	@Override
	public String toString() {
		return "Condutor: "+condutor+", Lotacao: "+lotacao+", Cilindrada: "+cilindrada+", Potencia: "+potencia+", PesoBruto: "+pesoB;
	}
}
