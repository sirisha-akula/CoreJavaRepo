package JDK8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	/*@FunctionalInterface
	public interface UnaryOperator<T>
	extends Function<T,T>
	
	Represents an operation on a single argument that produces a result of the same type as its argument. 
	This is a specialization of Function for the case where the argument and result are of the same type 
	 * 
	 */
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> func = x -> x * 7; //here x is called arugment
		System.out.println(func.apply(10));
		
		//UnaryOperator Interface extends Function Interface
		
		Function<Integer, Integer> func2 = x -> x*10;
		System.out.println(func2.apply(3));
		
		
		List<String> langList = new ArrayList<String>(Arrays.asList("JAVA", "Ruby", "C++", "Python"));
		langList.replaceAll(ele -> ele + "ProgrammingLanguage");
		System.out.println(langList);
		
		Iterator<String> it = langList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
