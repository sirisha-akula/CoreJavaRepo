package Problems;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		char ch = 'g';
		
		if((ch >='a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
			
			System.out.println(ch + " is a character");
			
		}else {
				System.out.println(ch + "is not a character");
			}
		}
	}


