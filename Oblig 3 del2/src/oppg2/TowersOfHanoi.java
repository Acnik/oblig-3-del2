package oppg2;

import java.util.Scanner;

public class TowersOfHanoi {
	static int teller;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Legg inn antall plater: ");
		int n = input.nextInt();

		System.out.println("Flyttene er:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("Totalt antall flyttinger: " + teller);
		input.close();
	}

	public static void moveDisks(int n, char fromTower, char toTower,
			char auxTower) {
		teller++;
		if (n == 1)
			System.out.println("Flytt plate " + n + " fra " + fromTower
					+ " til " + toTower);
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Flytt plate " + n + " fra " + fromTower
					+ " til " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}