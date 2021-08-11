package JDK8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>
		(Arrays.asList("milk white","Rani pink","Dark blue", "light green", "lemon yellow"));
		
	//1. using java 8 with for each and lambda exp:
		System.out.println("print using java 8 with for each and lambda exp----");
		colors.forEach(combo -> {System.out.println(combo);});
		
		//2. using Iterator
		System.out.println("print using Iterator----");
	Iterator<String> it = 	colors.iterator();
	while(it.hasNext()) {
		String combo= it.next();
		System.out.println(combo);
	}
		
		//3. using Iterator and java 8 forEachRemaining method:
	System.out.println("print using Iterator and java 8 lambda and forEachRemaining method:----");
	it =  colors.iterator();
	it.forEachRemaining(combo -> {System.out.println(combo);});
		
		
	//4. using simple foreach loop:---
	System.out.println("print using simple foreach loop:-----");
	for(String combo : colors) {
		System.out.println(combo);
	}
		
	//5. using for loop-----
	System.out.println("print using for loop with order/index-----");
	for(int i =0 ;i<colors.size(); i++) {
		System.out.println(colors.get(i));
	}
		
	//6. using listIterator() to traverse in both directions. starting from last and checking previous
	System.out.println("print using listIterator() to traverse in both directions----"); //print backward direction
     ListIterator<String> listIteratorColors = colors.listIterator(colors.size());
     while(listIteratorColors.hasPrevious()){
    	String combo =  listIteratorColors.previous();
    	System.out.println(combo);
     }
		
		
		
	}

}
