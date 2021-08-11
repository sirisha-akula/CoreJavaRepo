package OOPSConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, Obj is the object reference variable referring to this object.
		//after creating object, copy of all non-static methods will be given to this Object.
		
		obj.firstmethod();
		
		int a1 = obj.secondmethod();
		System.out.println(a1);
		
	String s1 =	obj.thirdmethod();
	System.out.println(s1);
	
	int mul= obj.fourthmethod(7, 4);
	System.out.println(mul);
		
		
	}
		
		//Non-Static methods
	
		//return type is void(does not return any value)
		public void firstmethod() { //no input, no output
			System.out.println("firstmethod");
		}

	public int secondmethod() { //no input , some output, return type is int
		System.out.println("second method");
		int a = 10, b = 20;
		int c = a+b;
		return c;
		
	}
	
	public String thirdmethod() { //return type String
		System.out.println("thirdmethod");
		String s = "Selenium";
		return s;
	}
	
	//x, y are called arguments/parameters
	public int fourthmethod(int x, int y) { //some input, some output
		System.out.println("fourthmethod");
		int z= x*y;
		return z;
	}
	

}
