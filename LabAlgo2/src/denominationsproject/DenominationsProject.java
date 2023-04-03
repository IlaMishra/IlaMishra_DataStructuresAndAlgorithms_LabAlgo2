package denominationsproject;

import java.util.Arrays;
import java.util.Scanner;

public class DenominationsProject
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Take input of denominations
		System.out.print("Enter size of denominations: ");
		int n = scanner.nextInt();
		int[] denominations = new int[n];
		System.out.println("Enter denominations value: ");
		for (int i = 0; i < n; i++) {
			denominations[i] = scanner.nextInt();
		}

		// Take input of amount to pay
		System.out.print("Enter amount you want to pay: ");
		int amount = scanner.nextInt();

		// Sort the denominations in descending order
		Arrays.sort(denominations);
		reverseArray(denominations);

		// Calculate payment approach
		int[] notes = new int[n];
		for (int i = 0; i < n; i++) {
			notes[i] = amount / denominations[i];
			amount %= denominations[i];
		}

		// Print payment approach
		System.out.println("Your payment approach in order to give min no of notes is");
		for (int i = 0; i < n; i++) {
			if (notes[i] > 0) {
				System.out.println(denominations[i] + ":" + notes[i]);
			}
		}
	}

	// Helper method for reversing array
	public static void reverseArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

}