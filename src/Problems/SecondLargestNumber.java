package Problems;

import java.util.Arrays;

public class SecondLargestNumber {

	/**
	 * second largest number in array
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = {23 ,45, 66,10, 52};
		int temp, size;
		size = a.length;
		System.out.println(size);
		
		//1. to get second largest number in array we need to sort array in ascending order.
		for(int i=0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];  
					a[i] = a[j];  
					a[j] =  temp; 
				}
			}
		}
		
		//System.out.println("Elements in array: " +Arrays.toString(a));
		for(int i =0 ;i<size; i++) {
			System.out.println(a[i]);
		}
		//2. to get second largest number from sorted aarray
		System.out.println("second largest number array:" +a[size-2]);
		
	}

   
}
