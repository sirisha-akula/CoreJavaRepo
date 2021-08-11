package JDK8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism()); //7 it gives no.of cores on laptop
		
		//1. parallel() method on stream
	Stream stream = Stream.of("Red", "Yellow", "blue", "green", "white");
	//BaseStream paralledStream = stream.parallel();
	Stream.of("Red", "Yellow", "blue", "green", "white").forEach(System.out::println);
	System.out.println("-----");
	Stream.of("Red", "Yellow", "blue", "green", "white").parallel().forEach(System.out::println);
	//parallel() method should be applied on Stream. here it will be divided and executed parallely  on Threads concept
	System.out.println("-----");

	//2. use parallelStream() method on Collections like arrays, set, arraylist
	Arrays.asList("Red", "Yellow", "blue", "green", "white").parallelStream().forEach(System.out::println);
	System.out.println("-----");

	// print 1 to 10
	System.out.println("Sequential Stream"); // it will be sequential order
	IntStream.rangeClosed(1, 10).forEach(System.out::println);
	
	System.out.println("Parallel Stream"); // parallel stream are used to increase performance and also when order does not requried
	IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
	
	//check stream is running in parallel mode or not:
	IntStream range =IntStream.rangeClosed(1, 10);
	System.out.println(range.isParallel());  //false
	
	IntStream range1 =IntStream.rangeClosed(1, 10);
	range1.parallel();
	System.out.println(range1.isParallel());  //true
	
	//print a --z -->97 to 122
	System.out.println("Sequential Stream");
	getAlhpabets().stream().forEach(System.out::println);
	
	System.out.println("Parallel Stream");
	getAlhpabets().parallelStream().forEach(System.out::println);
	}
	
	public static List<String> getAlhpabets() {
		
		List<String> alpha = new ArrayList<String>();
		int n = 97;
		while(n <= 122) {
			char c = (char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
