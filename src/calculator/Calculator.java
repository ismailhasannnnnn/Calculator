/**
 * 
 */
package calculator;

import java.util.*;

/**
 * @author xplos
 *
 */
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		char again = 'y';
		while(again == 'y'){
		
		System.out.println("What would you like to do?");
		System.out.println("Add, Subtract, Multiply, or Divide? (1,2,3,4?)");
		int option = scanner.nextInt(); //getting the option from the user
		
//		if(option == 1){
//			System.out.println("You chose to add.");
//		}else if(option == 2){
//			System.out.println("You chose to subtract.");
//		}else if(option == 3){
//			System.out.println("You chose to multiply.");
//		}else if(option == 4){
//			System.out.println("You chose to divide.");
//		}else{
//			System.out.println("That is not a valid option. Please try again.");
		
		switch (option){
		case 1: option = 1;
		System.out.println("You chose to add."); // option 1
		System.out.println("What is the first number you'd like to add?");
		double a1 = scanner.nextDouble();
		System.out.print("What about the second number?");
		double a2 = scanner.nextDouble();
		System.out.print(a1 + a2);
		break;
		
		case 2: option = 2;
		System.out.println("You chose to subtract."); // option 2
		System.out.println("What is the first number you'd like to subtract?");
		double s1 = scanner.nextDouble();
		System.out.print("What about the second number?");
		double s2 = scanner.nextDouble();
		System.out.print(s1 - s2);
		break;
		
		case 3: option = 3;
		System.out.println("You chose to multiply."); // option 3
		System.out.println("What is the first number you'd like to multiply?");
		double m1 = scanner.nextDouble();
		System.out.print("What about the second number?");
		double m2 = scanner.nextDouble();
		System.out.print(m1 * m2);
		break;
		
		case 4: option = 4;
		System.out.println("You chose to divide.");//very much so an option
		System.out.println("What is the first number you'd like to divide?");
		double d1 = scanner.nextDouble();
		System.out.print("What about the second number?");
		double d2 = scanner.nextDouble();
		System.out.print(d1 / d2);
		break;
		
		default: option = 5;//not an option
		System.out.println("That is not a valid option.");
		}
		System.out.println("");
		System.out.println("Would you like to start from the beginning?");
		System.out.println("(y/n)");
		again = scanner.next().charAt(0);
		
			
		}
		System.out.println("Have a nice day!");
		
		
		
		}
		
}
		
		
	


		
	
		
	


	


