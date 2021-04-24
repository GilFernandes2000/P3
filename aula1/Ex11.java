package aula1;
import java.util.*;

public class Ex11 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String frase;
		System.out.print("Frase-> ");
		frase = sc.nextLine();
		String[] palavras = frase.split(" ");
		System.out.printf("esta frase tem %d numeros\n", charNum(frase));
		if(serMin(frase)) {
			System.out.println("So ha caracteres minusculos");
		}
		if(serMais(frase)){
			System.out.println("So ha caracteres maiusculos");
		}
		else {
			System.out.println("A frase tem caracteres minusculos e maiusculos");
		}
		System.out.printf("Esta frase tem %d palavras\n", palavras.length);
		for(int j=0; j < palavras.length;j++) {
			System.out.printf("%s\n", palavras[j]);
		}
		System.out.printf("%s -> %s\n",frase, troca(frase));
	}
	public static int charNum (String pal) {
		int countNum=0;
		for(int i = 0; i< pal.length(); i++) {
			char car = pal.charAt(i);
			if(Character.isDigit(car)) {
				countNum++;
			}
		}
		return countNum;
	}
	public static boolean serMin (String pal) {
		for(int i = 0; i< pal.length(); i++) {
			char car = pal.charAt(i);
			if(Character.isUpperCase(car)) {
				return false;
			}
		}
		return true;
	}
	public static boolean serMais (String pal) {
		for(int i = 0; i< pal.length(); i++) {
			char car = pal.charAt(i);
			if(Character.isLowerCase(car)) {
				return false;
			}
		}
		return true;
	}
	public static String troca (String frase) {
		String [] palavras = frase.split(" ");
		String troc = "";
		for(int i = 0; i<palavras.length; i++) {
			String pal = "";
			if(palavras[i].length()%2!=0) {
				for(int j = 0; j<palavras[i].length()-1; j+=2) {
					pal = pal + palavras[i].charAt(j+1) + palavras[i].charAt(j);
				}
				pal = pal + palavras[i].charAt(palavras[i].length()-1);
				troc = troc + " " + pal;
			}
			else {
				for(int j = 0; j<palavras[i].length(); j+=2) {
					pal = pal + palavras[i].charAt(j+1) + palavras[i].charAt(j);
				}
				troc = troc + " " + pal;
			}
		}
		return troc;
	}
}
