package JDK8Features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {
/*	@FunctionalInterface
	public interface BinaryOperator<T>
	extends BiFunction<T,T,T>
 * 
 * Represents an operation upon two operands/arguments of the same type, producing a result of the same type as the operands(arguments). 
 * This is a specialization of BiFunction for the case where the operands and the result are all of the same type.
 * 
 */
	public static void main(String[] args) {
		
		BinaryOperator<Integer> func = (x1, x2) -> x1+x2;
		
		Integer t = func.apply(20, 30);
		System.out.println(t);
		
		
		//BinaryOperator Interface extends BiFunction Interface
		
		//BiFunction Interface
		
		BiFunction<Integer,Integer, Integer> func2 = (x1,x2) -> x1+x2;
		
		Integer result = func2.apply(10, 3);
		System.out.println(result);
		
		BinaryOperator<String> func3 = (x1 , x2) -> x1.concat(x2);
		String text = func3.apply("Hello", "World");
		System.out.println(text);
	}

}
