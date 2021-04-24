package Aula11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class PalNum {
	public static void main(String[] args) throws IOException{
		Path fin = Paths.get("C:\\Users\\JoãoFernandes\\Downloads\\Policarpo.txt");
		List<String> f1 = Files.readAllLines(fin);
		Map<String, Integer> mapa = new HashMap<>();
		for(int i = 0; i < f1.size(); i++) {
			String[] arr = f1.get(i).split(" ");
			Set<String> keys = mapa.keySet();
			for(int j = 0; j< arr.length;j++) {
				if(keys.contains(arr[j])) {
					mapa.put(arr[j], mapa.get(arr[j]) + 1);
				}
				else {
					mapa.put(arr[j], 1);
				}
			}
		}
		Set<Entry<String, Integer>> set = mapa.entrySet();
		Iterator<Entry<String,Integer>> i = set.iterator();
		while(i.hasNext()) {
			Entry<String, Integer> aux = i.next();
			System.out.printf("%15s %10d\n",aux.getKey(),aux.getValue());
		}
	}
}
