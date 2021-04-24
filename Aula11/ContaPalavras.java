package Aula11;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ContaPalavras {
	public static void main(String[] args) throws IOException{
		Path fin = Paths.get("C:\\Users\\JoãoFernandes\\Downloads\\Policarpo.txt");
		List<String> f1 = Files.readAllLines(fin);
		Set<String> s = new HashSet<String>();
		int countPal = 0;
		for(int i = 0; i < f1.size();i++) {
			String[] arr = f1.get(i).split(" ");
			countPal += arr.length;
			for(int j = 0; j < arr.length;j++) {
				s.add(arr[j]);
			}
		}
		System.out.println("Numero total de palavras: "+countPal);
		System.out.println("Numero de palavras diferentes: "+s.size());
	}
}
