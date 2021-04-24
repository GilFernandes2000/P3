package aula10;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Data {
	private int dia; 
	private int mes;
	private int ano;
	private static Data today = new Data();
	
	public Data (int d, int m, int a) {
		assert d>0 && m>0 && a>0: "Invalid data";
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	public Data() {
		String[] data = currentDate().split("-");
		this.dia = Integer.parseInt(data[0]);
		this.mes = Integer.parseInt(data[1]);
		this.ano = Integer.parseInt(data[2]);
	}
	private static String currentDate() {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
	}
	public int dia() {
		return dia;
	}
	public int mes() {
		return mes;
	}
	public int ano() {
		return ano;
	}
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	public static Data today() {
		return today;
	}
}
