package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double[] vector = new double[n];

		for (int i = 0; i < n; i++) {
			vector[i] = input.nextDouble();
		}

		System.out.println(Arrays.toString(vector));

		input.close();

	}
}
