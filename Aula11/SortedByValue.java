package Aula11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SortedByValue {
	public static void main(String[] args) throws IOException{
		Path fin = Paths.get("C:\\Users\\JoãoFernandes\\Downloads\\Policarpo.txt");
		List<String> f1 = Files.readAllLines(fin);
		CompareValue cbv = ;
		Map<String, Integer> mapa = new TreeMap<String, Integer>(new CompareValue());
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
		public Sotred <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedValues(Map<K,V> map){
			SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
			        new Comparator<Map.Entry<K,V>>() {
			            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
			                int res = e1.getValue().compareTo(e2.getValue());
			                return res != 0 ? res : 1;
			            }
			        }
			    );
			    sortedEntries.addAll(map.entrySet());
			    return sortedEntries;
		}
	}
}

