
public class Singleton {
	//singleton class means the class which is allowed to create only one object for the class.
	//whenever a new request is made it uses the existing object instead of creating new object.
	
	//3 steps to create singleton class
	//1.create a static data variable which is instance of singleton class
	//2.Create a private constructor which restricts creation of object for singleton class
	//3.create a static method which allows to create and access the object. And also it restricts to create
	//more than one object
	//Advantage: it saves the memory as it allows only to create one object.
	
	private static Singleton singleton = null;
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(singleton  == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void getDetails() {
		System.out.println("get details");
	}

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);
		
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2);

		
		Singleton obj3 = Singleton.getInstance();
		System.out.println(obj3);

		
		
	}

}
