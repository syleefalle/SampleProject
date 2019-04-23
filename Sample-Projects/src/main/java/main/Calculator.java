import java.util.Scanner;
public class Calculator {
public static void main(String S[]) {
	Scanner sc = new Scanner(System.in);
	int result=0, choice=0;
	//System.out.println("Enter 2 nos:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Enter your selection:"
    		+ "1 for Addition, 2 for subtraction 3 for Multiplication and 4 for division:\r\n");
    choice = sc.nextInt();
	switch(choice)
    {
    	case 1: 
    		result = a+b;
    		break;
    	case 2: 
    		result = a-b;
    		break;
    	case 3: 
    		result = a*b;
    		break;
    	case 4: 
    		result = a/b;
    		break;
    		
    	default: System.out.println("Invalid input");
    	break;
    }
   System.out.println(result);
   
 }
}
