package aula3;

public class Condutor extends Pessoa{
	private Carta carta;
	
	public Condutor(String nome, int Bi, Data dataNasc, Carta carta) {
		super(nome, Bi, dataNasc);
		this.carta = carta;
	}
	public Carta carta() {
		return carta;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Carta: " + carta;
	}
}
