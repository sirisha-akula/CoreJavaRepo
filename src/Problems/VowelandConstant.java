package Problems;

public class VowelandConstant {
 
	
	//vowels = a, e, i, o, u
	
	public static void main(String[] args) {
		
char ch= 'o';

if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	System.out.println(ch + ": is a Vowel");
}else
{
	System.out.println(ch + ": is a Constant");
}


switch(ch) {
case  'a':
case 'e':
case 'i':
case 'o':
case 'u':
	System.out.println(ch + ": is a Vowel");
	break;
	
	default:
		System.out.println(ch + ": is a Constant");
		break;

}
	}

}
