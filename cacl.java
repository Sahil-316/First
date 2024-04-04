package calculator;

import java.util.Scanner;

public class cacl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b,c,R;
		String shouldContinue = null;
		Scanner sw = new Scanner(System.in);
	do { System.out.println("Choose a given option \n Press 1 for Addition.\n Press 2 for substraction. \n Press 3 for multiplication. \n Press 4 for Division.");
	int a = sw.nextInt();
	
 switch(a) {
	case 1:
		
		System.out.println("Addition \n\nInput first number");
		b = sw.nextInt();
		System.out.println("Input second number");
		c = sw.nextInt();
	    R = b+c;  
		System.out.println("Addition of both the numbers is: " + R);
		break;
		
	case 2:
		System.out.println("Substraction \n\nInput first number");
		b = sw.nextInt();
		System.out.println("Input second number");
		c = sw.nextInt();
		R = b-c;
		System.out.println("Substraction of both the numbers is: " + R);
		break;
	case 3:
		System.out.println("Multiplication \n\nInput first number");
		b = sw.nextInt();
		System.out.println("Input second number");
		c = sw.nextInt();
		R = b*c;
		System.out.println("Multiplication of both the numbers is: " + R);
		break;
	case 4:
		System.out.println("Division \n\n Input first number");
		b = sw.nextInt();
		System.out.println("Input second number");
		c = sw.nextInt();
		R = b/c;
		System.out.println("Division of both the numbers is: " + R);
		break;
	default: 
		System.out.println("Wrong input. Want to try again ? (Y,N)");
		shouldContinue = sw.next();
	    break;
 }
 }while(shouldContinue.equals("Y") || shouldContinue.equals("y"));
	System.out.println("Program by Sahil");
	sw.close();
	}

}
