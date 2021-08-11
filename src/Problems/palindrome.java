package Problems;

public class palindrome {

	public static void main(String[] args) {
		//121->121Z
		int num = 121;
		int rev =0;
		
		int actualnum = num;
		
		while(num !=0) {
			int n = num%10;
			rev = rev*10+n;
			num= num/10;
		}
		System.out.println(rev);
		
		if(actualnum == rev) {
			System.out.println(actualnum + " it is palindrome number");
		}else {
			System.out.println(actualnum +" it is not a palindrome number");
		}
	}

}
