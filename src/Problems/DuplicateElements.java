package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
String names[] = {"java", "javascript", "ruby", "c", "java","ruby"};

//1.Compare each element --o(nxn)--worst solution
for(int i=0; i<names.length;i++) {
	for(int j = i+1; j<names.length; j++) {
		if(names[i].equals(names[j])) {
			System.out.println("duplicate element is " +names[i]);
		}
	}
}
System.out.println("**********************");

//2.Using HashSet-->Java Collections--it store only unique valueso(n)
Set<String> stores=new HashSet<String>();
for(String name1: names) {
	if(stores.add(name1)==false) {
		System.out.println("duplicate element is " +name1);
	}
}
System.out.println("**********************");

//3.Using HashMap--o(2n)
Map<String,Integer> storeMap= new HashMap<String,Integer>();

for(String name2 : names) {
	Integer count= storeMap.get(name2);
	if(count == null) {
		storeMap.put(name2, 1);
	}else {
		storeMap.put(name2, count++);	
	}
	
}
//get the values for the HashMap
Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
for(Entry<String, Integer> entry : entrySet) {
	if(entry.getValue()>1) {
		System.out.println("duplicate element is " +entry.getKey());
	}
	
}

	}

}
