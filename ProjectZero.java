package homeWork1;

import java.util.*;

public class ProjectZero {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter two numbers: ");
		Scanner inputSource = new Scanner(System.in);
		
		try{
			double a = inputSource.nextDouble();
			double b = inputSource.nextDouble();
			
			if((a % 1 == 0) && (b % 1 == 0)){
				System.out.println("The sum is " + (int) (a+b));
			}
			else{
				System.out.println("The sum is " + (a+b));
			}
		}
		catch(InputMismatchException e){
			System.err.println("PLEASE ENTER VALID NUMBERS!");
		}
		inputSource.close();
	}
}