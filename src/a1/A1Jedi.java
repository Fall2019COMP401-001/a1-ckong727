package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int[] itemAmount = new int[scan.nextInt()];
		int[] itemCheck = new int[itemAmount.length];
		String[] itemName = new String[itemAmount.length];
		for (int i = 0; i < itemName.length; i++) {
			itemName[i] = scan.next();
			double price = scan.nextDouble();
		}
		int[] numCustomer = new int[scan.nextInt()];
		String[] firstName = new String[numCustomer.length];
		String[] lastName = new String[numCustomer.length];
		
		for (int i = 0; i < numCustomer.length; i++) {
			firstName[i] = scan.next();
			lastName[i] = scan.next();
			int itemCount = scan.nextInt();
			String[] individualCart = new String[itemCount];
			for (int j = 0; j < itemCount; j++ )
			{
				int multiplier = scan.nextInt();
				String testName = scan.next();
				individualCart[j] = testName;
				
				for (int n = 0; n < itemName.length; n++) {
					if (testName.equalsIgnoreCase(itemName[n])) {
						itemAmount[n] += multiplier;
							itemCheck[n]++;
						for (int k = 0; k < j; k++) {
							if(individualCart[k].equalsIgnoreCase(testName)) {
						itemCheck[n]--;
					}
						}
					}
				}
				
			}
		}
		for (int p = 0;  p < itemAmount.length; p++){
			if (itemCheck[p] == 0) {
				System.out.println("No customers bought " + itemName[p]);
			}
			else {
				System.out.println(itemCheck[p] + " customers bought " + itemAmount[p] + " " + itemName[p]);
			}
		}
	}
}
