package JDK8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {
	//List of customer objects
		
		List<Customer> customerList = Arrays.asList(
				new Customer("Arjun" , 1),
				new Customer("Vihaan" , 3),
				new Customer("Harika" , 23),
				new Customer("vishnu" , 20),
				new Customer("pranitha" , 18)	
				);
		
		
		String name = customerList.stream()
		            .filter(x -> "Harika".equals(x.getName()))
		            .map(Customer::getName)
		            .findAny()
		            .orElse(null);
		System.out.println(name);
		System.out.println("------");
		
		//print all names from list
	List<String> custList =	customerList.stream() //convert list to stream
					.map(Customer::getName) //map customer with getName()
					.collect(Collectors.toList());
	custList.forEach(ele ->System.out.println(ele)); //lambda exp
	custList.forEach(System.out::println); //method reference
		
	}

}
