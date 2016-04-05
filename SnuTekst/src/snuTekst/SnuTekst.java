package snuTekst;

import java.util.Scanner;

public class SnuTekst {
	
	public static void baklengs(String tekst){
		System.out.print(tekst.charAt(tekst.length()-1));
		if(tekst.length()>1)
			baklengs(tekst.substring(0, tekst.length()-1));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String tekst = input.nextLine();
		System.out.print("\n"+ tekst + " er: ");
		baklengs(tekst);
		System.out.println(" baklengs");
	}

}
