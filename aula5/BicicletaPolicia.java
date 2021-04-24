package aula5;

public class BicicletaPolicia extends Bicicleta implements Policia{
	public BicicletaPolicia(Data ano, String matricula, String cor, int rodas, int cilindrada, int velo) {
		super(ano, matricula, cor, rodas, cilindrada,velo);
	}
	
	public ServicoEmergencia getTipo() {
		return ServicoEmergencia.PJ;
	}
	
	@Override
	public String toString() {
		return "Bicicleta de Policia" + super.toString();
	}
}
