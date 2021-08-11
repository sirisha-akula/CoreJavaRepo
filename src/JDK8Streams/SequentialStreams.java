package JDK8Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {

	public static void main(String[] args) {
		
		//1.
	Stream stream =	Stream.of("Arjun", "kittu" ,"Vishnu"); //Stream.of() method will create sequential stream with elements
	//stream.forEach(System.out::println);
	stream.findFirst().ifPresent((System.out::println));
	
	
	//2. 
	Arrays.asList("a1", "a2", "a3")
			.stream()
			.findFirst()
			.ifPresent((System.out::println));
	

	//3.range 1 to 5
	IntStream.range(1, 11).forEach((System.out::println)); //it prints between 1 to 10 excludes 11
	
	//4.
	Arrays.stream(new int[] {1,2,3,4})
	      .map(n -> 2 *n +1)
	      .average()
	      .ifPresent((System.out::println));
	
	//5.String of data objects
	Stream.of("a1", "a2", "a21")
	       .map(s -> s.substring(1))
	       .mapToInt(Integer::parseInt)
	       .max()
	       .ifPresent((System.out::println));
	
	//6.doubles to String objects
	Stream.of(1.0,2.0,3.0)
			.mapToInt(Double::intValue)
			.mapToObj(i ->"a" +i)
			.forEach((System.out::println));
	
	//7.limit
	Stream.iterate(0, n ->n+1)
	.limit(10)
	.forEach((System.out::println));
	
	//8. print 10 odd numbers
	
	Stream.iterate(0, n -> n+1)
	      .filter(x -> x%2 !=0)
	      .limit(10)
	      .forEach((System.out::println));
	
	}

}
