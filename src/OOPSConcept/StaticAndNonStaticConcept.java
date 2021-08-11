package OOPSConcept;

public class StaticAndNonStaticConcept {
	
	String name = "Arjun"; //non-static Global variable
	static int age = 1; //Static Global variable

	public static void main(String[] args) {
		/*How to call Static Variables and Methods?
		 * 1.Direct Calling 
		 */
		
		System.out.println(age);
	    sum();
	    
	    //2.By Using Classname
	    System.out.println(StaticAndNonStaticConcept.age);
	    StaticAndNonStaticConcept.sum();
	    
	    //how to call non-static methods and variables?--by creating class object we call non-static methods and variables

	    StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
	    System.out.println(obj.name);
	    obj.sendMail();
	    
	 // can I access/call the static methods by using object reference? yes but it gives warning.
	    obj.sum();
	    System.out.println(obj.age);
	    
	}
	
	public void sendMail() { //Non-Static Method
		System.out.println("SendMail--hello Arjun");
	}
	
	public static void sum() { //Static Method
		System.out.println("sum");
	}

}
