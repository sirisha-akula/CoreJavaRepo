package Problems;

public class StringCaptialWordCount {

	public static void main(String[] args) {
		String str = "thisCompleteGuideForAutomationTestingit";
		
		//if there is small character at the begging
		int c=0;
		if(Character.isLowerCase(str.charAt(0))) {
			c++;
		}
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				c++;
			}
		}
		 System.out.println(c);
		
		//1.
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count++;
			}
		}
         System.out.println(count);
         
         
       //2.
 		int count1 = 0;
 		for(int i = 0; i<str.length(); i++) {
 			if(str.charAt(i) >= 65 && str.charAt(i) <= 90) {
 				count1++;
 			}
 		}
          System.out.println(count1);
          
          //3.
   		int count2 = 0;
   		for(int i = 0; i<str.length(); i++) {
   			if(Character.isUpperCase(str.charAt(i))) {
   				count2++;
   			}
   		}
            System.out.println(count2);
            
            //4. Using streams //most powerful
          long count4 =  str.chars().filter(e -> Character.isUpperCase(e)).count();
          System.out.println(count4);
	}

}
