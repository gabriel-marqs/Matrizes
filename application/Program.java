package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números serão lidos? ");
		int n = sc.nextInt();
		int negativo = 0;

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					negativo++;
				}
			}
		}

		System.out.print("Diagonal Principal: ");
		for (int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.print("Negativos: " + negativo);

		sc.close();

	}

}
