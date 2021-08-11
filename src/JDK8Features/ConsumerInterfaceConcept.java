package JDK8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class ConsumerInterfaceConcept {
/*
 * @FunctionalInterface
	public interface Consumer<T>
	Represents an operation that accepts a single input argument and returns no result.
 */
	public static void main(String[] args) {

		Consumer<String> func =  x -> System.out.println(x);
		func.accept("Hello Arjun");
		
		List<Integer> numList  = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numList.forEach(ele -> System.out.println(ele));
		
		System.out.println("_________________");
		numList.forEach(System.out::println);
	}

}
