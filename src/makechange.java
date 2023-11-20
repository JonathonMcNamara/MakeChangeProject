import java.util.Scanner;

public class makechange {
	public static void main(String[] args) {
		
//		USE THE MOD OPERATOR 
//		LOOPING IS NOT USEFUL
//		CAN PUT ALL OF THE STUFF IN THE MAIN
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the sale amount: $");
		double salePrice = sc.nextDouble();
		System.out.print("Please enter the received amount: $");
		double cashReceived = sc.nextDouble();
		
		makeChange(salePrice, cashReceived);
		System.out.print("$" + (cashReceived - salePrice));
		
		
	}
	
//	NEED 20 DOLLAR BILL, 10 DOLLAR BILL, 5 DOLLAR, 1 DOLLAR, 25CENTS, 10 CENTS, 5 CENTS, 1 PENNY
	
	
	public static void makeChange(double salePrice, double cashReceived) {
		double changeDue = (cashReceived - salePrice);
		if(changeDue < 0) {
			System.out.println("ERROR, NOT ENOUGH MONEY");
		}
		if(changeDue == 0) {
			System.out.print(0);
		} 
		if(changeDue >= 20) {
			int Twenties = (int) (changeDue / 20);
			changeDue = changeDue % 20;
			System.out.printf(Twenties + " Twenty Dollar Bills ");
			}
		if(changeDue >= 10) {
			int Tens = (int) (changeDue / 10);
			changeDue = changeDue % 10;
			System.out.printf(Tens + " Ten Dollar Bills ");
			}
		if(changeDue >= 5) {
			int Fives = (int) (changeDue /5);
			changeDue = changeDue % 5;
			System.out.printf(Fives + " Five Dollar Bills ");
		}
		if(changeDue >= 1) {
			int Ones = (int) (changeDue /1);
			changeDue = changeDue % 1;
			System.out.printf(Ones + " One Dollar Bills ");
		}
		if(changeDue >= 0.25) {
			int Quarters = (int) (changeDue /0.25);
			changeDue = changeDue % 0.25;
			System.out.printf(Quarters + " Quarters ");
		}
		if(changeDue >= 0.10) {
			int Dimes = (int) (changeDue /0.10);
			changeDue = changeDue % 0.10;
			System.out.printf(Dimes + " Dimes ");
		}
		if(changeDue >= 0.05) {
			int Nickels = (int) (changeDue /0.05);
			changeDue = changeDue % 0.05;
			System.out.printf(Nickels + " Nickels ");
		}
		if(changeDue >= 0.01) {
			int Pennies = (int) (changeDue /0.01 + .05);
			changeDue = changeDue % 0.01;
			System.out.printf(Pennies + " Pennies ");
		}
	}

}
