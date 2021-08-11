package JDK8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
	
	
	/*
	 * Java 8 Stream's map: method is intermediate operation and consumes single element 
	 * form input Stream and produces single element to output Stream.
	 * It simply used to convert Stream of one type to another.
	 * 
	 * Map applies the mapper function on input Stream and generates the output Stream.
	 */

	public static void main(String[] args) {
		
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Harry", 17));
		studentsList.add(new Student("Tom", 13));
		studentsList.add(new Student("Peter", 19));
		studentsList.add(new Student("David", 24));
		studentsList.add(new Student("Lisa", 8));
		
		//Using map function convert Stream<Student> to List<String>
		
		List<String> newStudentList =  studentsList.stream() //convert to stream
													.map(s -> s.getName()) //convert from Stream<Student> to List<String>
													.filter(x -> x.contains("Peter"))
													.collect(Collectors.toList()); //collect as collectors
		
		newStudentList.forEach(System.out::println);
	}

}
