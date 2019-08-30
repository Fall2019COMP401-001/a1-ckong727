package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int input = scan.nextInt();
		int[] customerCount = new int[input];
		double[] totalPrice = new double [input];
		String[] firstName = new String[input];
		String[] lastName = new String[input];
		
		for (int i = 0; i<customerCount.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int counter = scan.nextInt();
			for (int  j = 0; j < counter; j++) {
				int numberOf = scan.nextInt();
				String groceries = scan.next();
				double price = scan.nextDouble(); 
				totalPrice[i] += price * numberOf;
			}
		}
		scan.close();
		for (int k = 0; k < customerCount.length; k++) {
			System.out.println(firstName[k].charAt(0) + ". " + lastName[k] + " " + String.format("%.2f", totalPrice[k]));
		}
	}
}
