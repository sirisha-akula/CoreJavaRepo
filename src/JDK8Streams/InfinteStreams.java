package JDK8Streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfinteStreams {
	//Infinte stream used to generate infinte stream of data.

	public static void main(String[] args) {
	
		//1.iterate()
		//static(T seed, UnaryOperator<T> f)
		//return a stream ->Stream<T>
		
List<Integer> collect =	IntStream.iterate(0, n ->n+2)
				.mapToObj(Integer::valueOf)
				.limit(10)
				.collect(Collectors.toList());

System.out.println(collect);

//2. generate()
//static generate(supplier<T> s)
//random number 1- 100

List<Integer> collect2 = Stream.generate(()->(new Random()).nextInt(200))
							.limit(10)
							.collect(Collectors.toList());
	
System.out.println(collect2);
	}

}
