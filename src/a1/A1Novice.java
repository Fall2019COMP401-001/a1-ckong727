package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
<<<<<<< HEAD
		/* Initializes the length of the following arrays after providing # of customers. 
=======
		/* Initializes the length of the following arrays after providing# of customers. 
>>>>>>> branch 'master' of https://github.com/Fall2019COMP401-001/a1-ckong727.git
		 * Input: Non-negative integer
		 * Output: customerCount[], totalPrice[], firstName[], lastName[]
		 */
		int input = scan.nextInt();
		int[] customerCount = new int[input];
		double[] totalPrice = new double [input];
		String[] firstName = new String[input];
		String[] lastName = new String[input];
		
		/* Totals each customer's price.
		 * Input: Non-null string, non-null string, non-negative integer
		 * Output: firstName[], lastName[], totalPrice[]
<<<<<<< HEAD
		 * 
		 */
		for (int i = 0; i<customerCount.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int counter = scan.nextInt();
			/*Calculates the total price for each customer.
			 * Input: Non-negative integer, non-null string, non-negative double.
			 */
			for (int  j = 0; j < counter; j++) {
				int numberOf = scan.nextInt();
				String groceries = scan.next();
				double price = scan.nextDouble(); 
				totalPrice[i] += price * numberOf;
			}
		}
		
		scan.close();
		
		/*Prints last name and first first name initial of customer and their total.
		 * Input: None
		 * Output: 3 void strings consisting of first initial of first name, last name, and respective total to two decmial places
		 */
		for (int k = 0; k < customerCount.length; k++) {
			System.out.println(firstName[k].charAt(0) + ". " + lastName[k] + " :" + String.format("%.2f", totalPrice[k]));
		}
=======
		 */
		for (int i = 0; i<customerCount.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int counter = scan.nextInt();
			/*Calculates the total price for each customer.
			 * Input: Non-negative integer, non-null string, non-negative double.
			 */
			for (int  j = 0; j < counter; j++) {
				int numberOf = scan.nextInt();
				String groceries = scan.next();
				double price = scan.nextDouble(); 
				totalPrice[i] += price * numberOf;
			}
		}
		
		scan.close();
		
		/*Prints last name and first first name initial of customer and their total.
		 * Input: None
		 * Output: 3 void strings consisting of first initial of first name, last name, and respective total to two decmial places
		 */
		for (int k = 0; k < customerCount.length; k++) {
			System.out.println(firstName[k].charAt(0) + ". " + lastName[k] + ": " + String.format("%.2f", totalPrice[k]));
		} 
>>>>>>> branch 'master' of https://github.com/Fall2019COMP401-001/a1-ckong727.git
	}
}
