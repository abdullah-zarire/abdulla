package SimpleGame;

import java.util.Scanner;

public class SimpleGame {
	
	
	 
	 
	
	
	
	public String convertTime(int seconds) {
		return null;
		
	}
	
	

	public static void main(String[] args) {
		System.out.print("Please choose 1 or 2 : ");
		Scanner one = new Scanner(System.in);
		int x = one.nextInt();
		//System.out.println(x);
		if (x == 1) {
			System.out.print("Input seconds: ");
			Scanner in = new Scanner(System.in);
			int seconds = in.nextInt();
			int p1 = seconds % 60;
			int p2 = seconds / 60;
			int p3 = p2 % 60;
			p2 = p2 / 60;
			System.out.print(p2 + ":" + p3 + ":" + p1);
			System.out.print("\n");
		}
		else if (x == 2) {
			int num = 0, rem = 0, sum = 0;
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			num = sc.nextInt();
			while (num > 0) {
				rem = num % 10;
				sum = sum + rem;
				num = num / 10;
				}
				System.out.println("Sum of digits : " + sum);
			}
			
		}
		
		
			
		
		
		

}

		
			 
			
				
			
				
			
				
			
			

