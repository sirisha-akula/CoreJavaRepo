package JDK8Streams;
/*
 * Java 8 Stream's map: method is intermediate operation and consumes single element 
 * form input Stream and produces single element to output Stream.
 * It simply used to convert Stream of one type to another.
 * 
 * Map applies the mapper function on input Stream and generates the output Stream.
 * ---See StreamMap.java for Map implementation
 */
public class Student {

	String name;
	int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
