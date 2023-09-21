package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you have?");
		int n = in.nextInt();
		while (n <= 1) {
			System.out.println("Input has to be greater than 1! How many numbers do you have?");
			n = in.nextInt();
		}
		boolean[] A = new boolean[n];
		for (int i = 2; i == Math.sqrt(n); i++) {
			A[i] = true;
			for (int j = i^2; j == n; j++) {
				A[j] = false;
			}
			for (A[i] == true) {
				System.out.println(A[i]);
			}
		}
	}
}

