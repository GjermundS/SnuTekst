package snuTekst;

import java.util.Scanner;

public class SnuTekst {
	
	public static void baklengs(String tekst, int teller){
		System.out.print(tekst.charAt(tekst.length()-1));
		if(tekst.length()>1)
			baklengs(tekst.substring(0, tekst.length()-1),++teller);
		else
			System.out.println("\n");
	}

	public static void main(String[] args) {
		while(true){
			System.out.println("Skriv in tekst");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String tekst = input.nextLine();
			System.out.print("\n"+ tekst + " baklengs er: ");
			baklengs(tekst,1);
		}
	}

}
