package JDK8Features;

public class LambdaDeclaration {
//lambda is nothing but a method body 
	public static void main(String[] args) {

		
		WebPage w1 = (value, age)-> System.out.println("hi " + value + " age: " + age);
		
		//WebPage w2 = (value)-> 	System.out.println(value.toUpperCase());
		
		//WebPage w3 = (n)-> 	System.out.println(n.length());

		
//		WebPage w2 = new WebPage() {
//			
//			@Override
//			public void header(String value, int age) {
//				
//			}
//		};
		
		
		w1.header("google" ,10);
		//w2.header("world");
		//w3.header("Automation");
	
	}

}
