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
		System.out.println("You chose to add.");
		System.out.println("What is the first number you'd like to add?");
		int a1 = scanner.nextInt();
		System.out.print("What about the second number?");
		int a2 = scanner.nextInt();
		System.out.print(a1 + a2);
		break;
		
		case 2: option = 2;
		System.out.println("You chose to subtract.");
		System.out.println("What is the first number you'd like to subtract?");
		int s1 = scanner.nextInt();
		System.out.print("What about the second number?");
		int s2 = scanner.nextInt();
		System.out.print(s1 - s2);
		break;
		
		case 3: option = 3;
		System.out.println("You chose to multiply.");
		System.out.println("What is the first number you'd like to multiply?");
		int m1 = scanner.nextInt();
		System.out.print("What about the second number?");
		int m2 = scanner.nextInt();
		System.out.print(m1 * m2);
		break;
		
		case 4: option = 4;
		System.out.println("You chose to divide.");//very much so an option
		System.out.println("What is the first number you'd like to divide?");
		int d1 = scanner.nextInt();
		System.out.print("What about the second number?");
		int d2 = scanner.nextInt();
		System.out.print(d1 / d2);
		break;
		
		default: option = 5;//not an option
		System.out.println("That is not a valid option. Please try again.");
		break;
		
		
		}
	
			
		}
		
			
		}
		

	


