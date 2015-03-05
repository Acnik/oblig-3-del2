package del2;

import java.util.Scanner;

public class SnuTekst {
	static int bokstavTeller;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		bokstavTeller = 0;
		System.out.println("Skriv inn teksten du vil reversere: ");
		System.out.println(baklengs(input.nextLine()));

		input.close();
	}
	public static String baklengs(String tekst){
		bokstavTeller++;
		System.out.println("Antall tegn behandlet: " + bokstavTeller);
		if ((tekst == null) || (tekst.length()<=1))
			return tekst;
		return (baklengs(tekst.substring(1)) + tekst.charAt(0));
	}
}
