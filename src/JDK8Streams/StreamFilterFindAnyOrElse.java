package JDK8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		//List of customer objects
		
		List<Customer> customerList = new ArrayList<Customer>(Arrays.asList(
				new Customer("Arjun" , 1),
				new Customer("Vihaan" , 3),
				new Customer("Harika" , 23),
				new Customer("vishnu" , 20),
				new Customer("pranitha" , 18)	
				));
		//1. filter -- findAny
Customer customer = customerList.stream() //convert list to stream
		.filter(x ->"Harika".equals(x.getName())) //filter for Harika
		.findAny() //if finds return it
		.orElse(null); //else return null

System.out.println(customer.getName() + " " +customer.getAge());

System.out.println("------");

//2. filter -- orElse
Customer customer1 = customerList.stream() //convert list to stream
					.filter(x ->"Naveen".equals(x.getName())) //filter for Harika
					.findAny() //if finds return it
					.orElse(null); //else return null

				System.out.println(customer1);
System.out.println("------");	
//3. filter -multiple conditions
Customer customer2 = customerList.stream()
				.filter(x -> "pranitha".equals(x.getName()) && 18 == x.getAge())
				.findAny()
				.orElse(null);
				System.out.println(customer2.getName() + " " + customer2.getAge());

	}

}
