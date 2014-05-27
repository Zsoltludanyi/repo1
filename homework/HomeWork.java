package homework;

import java.util.*;

public class HomeWork {


	public static void main(String[] args) {

		//String input = "word3 word1 word1 word2 word2 word1 word1";
		String input = "word3 word1 word2 word3 word3 word1";
		System.out.println("Input="+input);
		String[] keys = input.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>(); 
		/*for(String key:keys) {
			if(map.containsKey(key)) {
				Integer count = map.get(key);
				count++;
				map.remove(key);
				map.put(key,count);	
			}
			else	
				map.put(key,1);
		}*/

		for(String key:keys) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key) + 1);	
			}
			else	
				map.put(key,1);
		}

		System.out.println("Map ordered by appereance, contains( used LinkedHashMap):");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
    			System.out.println(entry.getKey()+ ", "+entry.getValue());;
		}

		TreeMap<String, Integer> treeMap = new TreeMap<String,Integer>(map);
		System.out.println("Map ordered by key, contains( used TreeMap):");
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
    			System.out.println(entry.getKey()+ ", "+entry.getValue());
		}

		HashMap<String, Integer> hashMap = new HashMap<String,Integer>(map);
		System.out.println("Map contain( used HashMap):");
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey()+ ", "+entry.getValue());
		}
	}
}