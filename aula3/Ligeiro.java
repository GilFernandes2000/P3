package aula3;

public class Ligeiro extends Veiculo{
	public Ligeiro (Condutor c) {
		super(c, new Carta("B"), 5, 20, 100, 1000 );
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
