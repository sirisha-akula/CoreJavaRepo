package JDK8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {
		
		List<String> products = Arrays.asList("Macbook", "iphone", "Shoes", "HairDryer", "Jacket");
//		System.out.println(products);
//		
//		//Lambda exp:
//		products.forEach(ele -> System.out.println(ele));
//		
//		//Method reference
//		products.forEach(System.out::println);
		
	List<String> result = products.stream().filter(ele -> !ele.equals("iphone")).collect(Collectors.toList());
	result.forEach(System.out::println);
	result.forEach(ele ->System.out.println(ele));
		
	}

}
