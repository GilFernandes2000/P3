package Aula11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapTree {
	public static void main(String[] args) throws IOException{
		Path fin = Paths.get("C:\\Users\\JoãoFernandes\\Downloads\\Policarpo.txt");
		List<String> f1 = Files.readAllLines(fin);
		Map<String, Integer> mapa = new TreeMap<>();
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
		Map<String, Integer> sortedMap = new TreeMap<>();
		mapa.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		Set<Entry<String, Integer>> set = sortedMap.entrySet();
		Iterator<Entry<String,Integer>> i = set.iterator();
		while(i.hasNext()) {
			Entry<String, Integer> aux = i.next();
			System.out.printf("%15s %10d\n",aux.getKey(),aux.getValue());
		}
	}
}
