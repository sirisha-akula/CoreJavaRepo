package Problems;

import java.util.Arrays;

public class StringWordCount {
/**
 * no. of characters in String
 * @param args
 */
	public static void main(String[] args) {
//		String s = "AutomationTestingWithCucumber";
//		System.out.println(s.length());
		
int a[] = {23, 6, 31, 17,4,20 ,300};

int largest = a[0]; //23, 31

for(int i =0; i<a.length; i++) {

	if(a[i] > largest) {
		largest = a[i];
	}
	}
	
	System.out.println(largest);
	
	//smallest number in array
	int smallest  = a[0]; //23 ,6,4
	
	for(int i = 0; i<a.length; i++) {
		
		if(a[i] < smallest) {
			smallest = a[i];
		}
	}
	System.out.println(smallest);
	
	//Second largest number in array
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	int n = a.length;
	System.out.println(n);
	System.out.println(a[n-2]);
	
	}
	
	
}


		

	


