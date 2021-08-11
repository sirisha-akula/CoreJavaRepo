import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HelloMAC {

	public static void main(String[] args) {
		System.out.println("Hello MAC");
		
		//to get duplicate chars in string
		String str = "B";
		
		if(str == null) {
			System.out.println("string is null");
			return;
		}
	  if(str.isEmpty()) {
			System.out.println("string is Empty");
			return;
		}
	  if (str.length() == 1){
			System.out.println("string is a single character");
			return;
		}
	  
	char word[] =  str.toCharArray();
	  Map<Character, Integer> hm = new HashMap<Character, Integer>();
	  for(Character ch: word) {
		  if(hm.containsKey(ch)) {
			  hm.put(ch, hm.get(ch)+1);
		  }else {
			  hm.put(ch, 1);
		  }
	  }
	  
	  //print map
	 Set<Map.Entry<Character, Integer>> entrySet= hm.entrySet();
	for(Entry<Character, Integer> entry :entrySet) {
	  if(entry.getValue()>1) {
		  System.out.println(entry.getKey() + " " +entry.getValue());
	  }
	  
	}
	}
}

