package Problems;

public class NaturalNumberSum {

	public static void main(String[] args) {
		int num =100;
		int sum =0;
		
		//1+2+3+4+5+....+100 =>5050
		
		for(int i = 1; i<=num;i++) {
			sum = sum+i;
			
		}
		System.out.println("Sum of natural number :" + sum);
//using while loop
		int j =1;
		int sum1 =0;
		while(j<=100) {
			sum1 = sum1+j;
			j++;
			
		}
		System.out.println("Sum of natural number :" + sum);
	
	}

}
