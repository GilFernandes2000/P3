package aula3;

public class Carta {
	private String carta;
	
	public Carta(String carta) {
		assert carta != "A" && carta !="b" && carta !="C" && carta !="D" :"tipo de carta invalido";
		this.carta = carta;
	}
	public String carta() {
		return carta;
	}
	public boolean equals(Carta c) {
		return carta.equals(c.carta);
	}
	
	@Override
	public String toString() {
		return "Carta: " + carta;
	}
}
