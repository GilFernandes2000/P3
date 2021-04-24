package Aula11;

import java.util.Comparator;
import java.util.Map;

public class CompareValue implements Comparator<Map.Entry<String,Integer>>{
	public int compare(Map.Entry<String, Integer> s1, Map.Entry <String,Integer> s2) {
		if(s1.getValue() < s2.getValue()) {
			return 1;
		}
		else if(s1.getValue() == s2.getValue()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
