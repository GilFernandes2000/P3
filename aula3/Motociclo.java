package aula3;

public class Motociclo extends Veiculo{
	
	public Motociclo(Condutor c) {
		super(c, new Carta("A"), 1, 125, 30, 200);
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
