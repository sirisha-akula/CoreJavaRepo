package Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatecharsinString {

	public static void main(String[] args) {
		duplicateChars(null);
		duplicateChars("");
		duplicateChars("M");
		duplicateChars("Automation");
		duplicateChars("007");
		duplicateChars("Auto testing pilot 0101");
		
	}
	
	
	public static void duplicateChars(String str) {
		
		if(str == null) {
			System.out.println("NULL string");
			return;
		}
			if(str.isEmpty()) {
				System.out.println("Empty String");
				return;
				
			}
			
			if(str.length() == 1) {
				System.out.println("Single Character");
				return;
			}
			
		char[] words =	str.toCharArray(); //converted string to char array eg: java
		Map<Character, Integer> charMap = new HashMap<Character, Integer>(); //store in hashmap as key,value pair character as key, value(character count)as integer
		for(Character ch: words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}else {
				charMap.put(ch, 1);
			}
		}
		
		//print the map
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":" +entry.getValue());
			}
	
		}
		}
	}


