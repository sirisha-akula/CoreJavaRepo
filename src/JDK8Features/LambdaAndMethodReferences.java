package JDK8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class LambdaAndMethodReferences {

	public static void main(String[] args) {

List<String> namesList = Arrays.asList("Vishnu", "Pranitha","Harika","Arjun","Vihaan");

//1.Anonymous class

namesList.forEach(new Consumer<String>() {

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
});
System.out.println("**************");
 
//2.Lambda Exp:

namesList.forEach(ele -> System.out.println(ele));

System.out.println("**************");
//3. Method Reference

namesList.forEach(System.out::println);
System.out.println("**************");

//typical for loop
for(int i = 0; i<namesList.size(); i++) {
	System.out.println(namesList.get(i));
}
System.out.println("**************");

//foreach
for(String t : namesList) {
	System.out.println(t);
}
	}

}
