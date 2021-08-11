package Problems;

public class NumberOfDigits {

	//1234 => 4
	//123 => 3
	public static void main(String[] args) {
		long num = 9989950801l;
		int count = 0;
		
		while(num!= 0) {
			num = num/10; //123 12 1 
			count++; //1, 2, 3,4
		}
		System.out.println("Number of Digits:" +count);
	}

}
