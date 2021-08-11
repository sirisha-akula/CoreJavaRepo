package JDK8Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	int id;
	String name;
	double sal;
	

	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		
	}
	public static void main(String[] args) {
		
		Employee obj = new Employee(1,"tom",100.01);
		Employee obj1 = new Employee(2,"David",201.01);
		Employee obj2 = new Employee(3,"Steven",400.01);
		Employee obj3 = new Employee(4,"Lisa",300.01);
		
		//List of employee objects
	List<Employee> employeeList = new ArrayList<Employee>();
	
		//Adding employee to list
		employeeList.add(obj);
		employeeList.add(obj1);
		employeeList.add(obj2);
		employeeList.add(obj3);
	
	List<Double> sal = employeeList.stream().map(n->n.sal).collect(Collectors.toList());
	//sal.forEach(ele ->System.out.println(ele));
	
	sal.stream().filter(x->x>200).forEach(System.out::println);
	
	

	}

}
