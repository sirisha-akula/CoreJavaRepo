package Problems;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 12345; //54321
		int rev = 0;
		
		while(num!=0) {
			int n = num%10;
			rev = rev*10+n;
			num= num/10;
		}
				
System.out.println(rev);
	

	//2. Using StringBuffer 
//convert into Integer to String using String.valueOf() function
int n = 9876;
System.out.println(new StringBuffer(String.valueOf(n)).reverse());
	
	}
}
