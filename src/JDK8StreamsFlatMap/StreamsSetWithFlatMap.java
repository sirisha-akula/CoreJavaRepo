package JDK8StreamsFlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Harika");
		emp1.addDevices( "macbook");
		emp1.addDevices("iphone8");
		emp1.addDevices("Samsung 9");
		emp1.addDevices("Redme pro");
		
		Employee emp2 = new Employee();
		emp2.setName("Arjun");
		emp2.addDevices( "macbook");
		emp2.addDevices("iphone8");
		emp2.addDevices("Lenova");
		emp2.addDevices("Nokia");
		
		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(emp1);
		empList.add(emp2);
		
	List<String> devicesList =	empList.stream()
		       .map(x ->x.getDevices()) //Stream<Set<String>>
		       .flatMap(x ->x.stream()) //Stream<String>
		       .distinct()
		       .collect(Collectors.toList());
	
	devicesList.forEach(x ->System.out.println(x));
	}

}
