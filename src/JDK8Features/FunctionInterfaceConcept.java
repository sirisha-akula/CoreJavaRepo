package JDK8Features;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	/*	
	 * Interface Function<T,R>
	Type Parameters:
	T - the type of the input to the function
	R - the type of the result of the function
	 * 
	 */
	public static void main(String[] args) {
		
		
		Function<String , Integer> func = x -> x.length();
		
		int i = func.apply("This is JDK Feature");
		System.out.println(i);
		
		
		
		//Chaining function
		
		Function<Integer, Integer> func2 = x -> x *2;
		int j = func.andThen(func2).apply("this is Function Interface"); //first it will give length of string and multiply by 2
		
		System.out.println(j);
		
	}

}
