package Problems;

public class StringsSwap {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		
		//Swapping using third variable
		/*String temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a: "  +a);
		System.out.println("After swapping b: "  +b); */
		
		//Swapping without using third variable
		
		//append a and b 
		a = a + b; //HelloWorld
		
		//Store intial String a into String b
		b = a.substring(0, a.length()-b.length()); // 0,5  //Hello
		
		//Store intial String b into String a
		a = a.substring(b.length());
		
		System.out.println("After swapping a: "  +a);
		System.out.println("After swapping b: "  +b);
		

	}

}
