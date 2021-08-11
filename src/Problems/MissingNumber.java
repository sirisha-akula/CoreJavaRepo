package Problems;

public class MissingNumber {

	public static void main(String[] args) {
		//int a[] = {1, 2, 4, 5, 6,7,......100};
		//1+2+4+5 =>12
		//1+2+3+4+5 =>15
		//15-12=>3
		
		//{1,2,3,4,5,7}
		//22
		//28
		//28-22=>6
		
		int a[]= {1, 2, 3, 4, 5, 7}; //make sure array is in sorted order
		int sum  = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for(int i=1; i<=7; i++) {
			sum1 = sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing Number is ::" + (sum1-sum));
	}

}
