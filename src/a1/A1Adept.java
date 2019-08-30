package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		double netPrice = 0;
		int[] item = new int[scan.nextInt()];
		String[] itemName = new String[item.length];
		double[] itemPrice = new double[item.length];
		for (int i = 0; i<item.length; i++) {
			itemName[i] = scan.next();
			itemPrice[i] = scan.nextDouble();
		}
		int[] customerNumber = new int[scan.nextInt()];
		String[] firstName = new String[customerNumber.length];
		String[] lastName = new String[customerNumber.length];
		double[] customerTotal = new double[customerNumber.length];
		for (int j = 0; j < customerNumber.length; j++) {
			firstName[j] = scan.next();
			lastName[j] = scan.next();
			int itemCounter = scan.nextInt();
			for (int k = 0; k < itemCounter; k++) {
				int multiplier = scan.nextInt();
				String testName = scan.next();
				for (int n = 0; n < itemName.length; n++) {
					if (itemName[n].equalsIgnoreCase(testName)) {
					customerTotal[j] += itemPrice[n] * multiplier; 
					}
				}
			}
		}
	
		scan.close();
		int maxCustomer = 0;
		int minCustomer = 0;
		for (int p = 0; p < customerTotal.length; p++) {
			netPrice += customerTotal[p];
			double comparePrice = customerTotal[0];
			if (customerTotal[p] > comparePrice) {
				maxCustomer = p;
				comparePrice = customerTotal[p];
				System.out.println(firstName[p] + " " + lastName[p] + " " + customerTotal[p]);
			}
			if(customerTotal[p] < comparePrice) {
				minCustomer = p;
				comparePrice = customerTotal[p];
			}
		}
		double avg = netPrice / customerNumber.length;
		System.out.println("Biggest: " + firstName[maxCustomer] + " " + lastName[maxCustomer] + " (" + String.format("%.2f",customerTotal[maxCustomer]) + ")" );
		System.out.println("Smallest: " + firstName[minCustomer] + " " + lastName[minCustomer] + " (" + String.format("%.2f",customerTotal[minCustomer]) + ")" );
		System.out.println("Average: " + String.format("%.2f", avg));
	}
}
	
