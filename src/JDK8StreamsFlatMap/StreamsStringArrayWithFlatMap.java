package JDK8StreamsFlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

	public static void main(String[] args) {
		
		String data[][] = new String[][] {{"a", "b"},{"c", "d"},{"e", "f"}};
		
		//Arrays.Stream(data) it gives sequential Stream of from the array passed as the parameter with its elements.		
	Stream<String[]> dataStream = Arrays.stream(data); 
	/*
	 * Stream<String[]> dataStreamFilter=	datastream.filter(x ->"a".equals(x.toString()));
	 * dataStreamFilter.forEach(System.out::println); Here we cannot apply filter on stream<String[]> so we have to add a FlatMap 
	 */
	
	//apply flatMap on dataStream
	Stream<String> streamFlatMap = dataStream.flatMap(x ->Arrays.stream(x));
	
	Stream<String> datastreamFilter	= streamFlatMap.filter(x ->"a".equals(x.toString()));
	datastreamFilter.forEach(System.out::println);
	
	//compositeFunction
	Stream<String> finalStream = Arrays.stream(data).flatMap(x ->Arrays.stream(x)).filter(x -> "c".equals(x.toString()));
	finalStream.forEach(ele -> System.out.println(ele));
		
	}

}
