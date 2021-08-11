package JDK8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {
/*
 * @FunctionalInterface
public interface Predicate<T>
Represents a predicate (boolean-valued function) of one argument.
 */
	public static void main(String[] args) {
		
		Predicate<Integer> func  = x -> x>5;
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> numList = list.stream().filter(func).collect(Collectors.toList());
		
		System.out.println(numList);
		
		//Predicate with && 
		List<Integer> numList1 =  list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
		System.out.println(numList1);
		
		//Predicate with negate(): neglect
		List<String> namesList = Arrays.asList("Harika","Harik","Hari","Ha","JAVA","JAV", "JA", "J");
		Predicate<String> nameExp = x -> x.startsWith("Hari");
		
	 List<String> newList = namesList.stream().filter(nameExp.negate()).collect(Collectors.toList());
		System.out.println(newList);
	}

}
