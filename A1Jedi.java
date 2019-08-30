package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int[] item = new int[scan.nextInt()];
		int[] itemCheck = new int[item.length];
		String[] itemName = new String[item.length];
		for (int i = 0; i<item.length; i++) {
			itemName[i] = scan.next();
			double itemPrice = scan.nextDouble();
		}
		
		int[] customerNumber = new int [scan.nextInt()];
		for (int j = 0; j < customerNumber.length; j++) {
			String firstName = scan.next();
			String lastName = scan.next();
			int itemCounter = scan.nextInt();
			for (int k = 0; k < itemCounter; k++) {
				int multiplier = scan.nextInt();
				String testName = scan.next();
				for (int n = 0; n < itemName.length; n++) {
					if (testName.equalsIgnoreCase(itemName[n])) {
						item[n] += multiplier;
						itemCheck[n]++;
					}
				}
			}
		}
		scan.close();
		for (int p = 0;  p < item.length; p++){
			if (itemCheck[p] == 0) {
				System.out.println("No customers bought " + itemName[p]);
			}
			else {
				System.out.println(itemCheck[p] + " customers bought " + item[p] + " " + itemName[p]);
			}
		}
	}
}
