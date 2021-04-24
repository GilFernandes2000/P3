package aula5;

public class MotoPolicia extends Moto implements Policia{
	public MotoPolicia(Data ano, String matricula, String cor, int rodas, int cilindrada, int velo) {
		super(ano, matricula, cor, rodas, cilindrada,velo);
	}
	
	public ServicoEmergencia getTipo() {
		return ServicoEmergencia.PSP;
	}
	
	@Override
	public String toString() {
		return "Moto de Policia" + super.toString();
	}
}
