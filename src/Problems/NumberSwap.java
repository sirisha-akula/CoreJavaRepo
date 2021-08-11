package Problems;

public class NumberSwap {

	public static void main(String[] args) {
	
int a = 5; //a=20 ,b=5
int b= 20;
 
/*System.out.println("Before swapping: a=" +a);
 System.out.println("Before swapping: b=" +b);
 
 int temp = a;
 a= b;
 b= temp;
 
 System.out.println("After swapping: a=" +a);
 System.out.println("After swapping: b=" +b);*/

//Without third var: using + operator

/*a= a-b; //-10
b= a+b; //10
a =b-a; //20

/* a = a+b;
 * b= a-b;
 * a =a-b;
 * 
 */
System.out.println("After swapping: a=" +a);
System.out.println("After swapping: b=" +b); 
 
//Without third var: using * operator

a= a * b; //100
b= a/b; // 5
a= a/b; //20

System.out.println("After : a= " +a);
System.out.println("After : b= " +b);
	}

}
