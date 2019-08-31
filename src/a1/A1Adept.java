package a1;

import java.util.Scanner;

public class A1Adept {

	/**
	 * @param args
	 */
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
		double maxComparePrice = customerTotal[0];
		double minComparePrice = customerTotal[0];
		for (int p = 0; p < customerTotal.length; p++) {
			netPrice += customerTotal[p];
			if (maxComparePrice > customerTotal[p]) {
				maxCustomer = p;
				maxComparePrice = customerTotal[p];
			}			
			else if(minComparePrice < customerTotal[p]) {
				minCustomer = p;
				minComparePrice = customerTotal[p];
			}
		}
		double avg = netPrice / customerNumber.length;
		System.out.println("Biggest: " + firstName[minCustomer] + " " + lastName[minCustomer] + " (" + String.format("%.2f",customerTotal[minCustomer]) + ")" );
		System.out.println("Smallest: " + firstName[maxCustomer] + " " + lastName[maxCustomer] + " (" + String.format("%.2f",customerTotal[maxCustomer]) + ")" );
		System.out.println("Average: " + String.format("%.2f", avg));
			}
		}

	
