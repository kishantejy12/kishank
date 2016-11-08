package number;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		System.out.println("entre the number"); //entering the number
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = x;

		y = 1;

		for (int i = x; i > 0; i--) {

			for (int j = 1; j <= i * 2; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= y - 1; j++) {

				System.out.print(j + " ");
			}
			for (int j = y - 1; j > 1; j--) {

				System.out.print(" " + j);
			}
			System.out.print(" " + "1");
			System.out.println();

			y++;
		}

		for (int i = 0; i < x; i++) {

			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= y - 1; j++) {
				System.out.print(j + " ");
			}
			System.out.print(" ");

			for (int j = y - 1; j > 1; j--) {
				System.out.print(j + " ");
			}
			System.out.print("1");
			System.out.println();

			y--;

		}
	}
}