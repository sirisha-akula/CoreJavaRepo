package Problems;

public class Primenumber1 {

	public static boolean isPrime(int num) {
		
		//corner cases
		if(num<=1) {
			return false;
		}
		
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
				
		}
		return true;
	}
	
	public static void primeNumbers(int num) {
		for(int i=2 ; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(13));
		System.out.println(isPrime(2));
		System.out.println(isPrime(15));
		System.out.println(isPrime(17));
		System.out.println(isPrime(0));
		
		primeNumbers(20);
		
	}

}
