package snuTekst;

import java.util.Scanner;

public class SnuTekst {
	private int teller;
	
	SnuTekst(){
		teller=0;
	}
	
	public void baklengs(String tekst){
		//Litt usikker på hva oppgaveteksten vil ha meg til å gjøre
		while (teller<tekst.length()){
			baklengs(tekst,teller);
		}
	}
	
	public void baklengs(String tekst, int nummer){
		this.teller++;
		System.out.print(tekst.charAt(tekst.length()-nummer-1));
		baklengs(tekst);
	}

	public static void main(String[] args) {
		while(true){
			System.out.println("Skriv in tekst");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String tekst = input.nextLine();
			System.out.print("\n"+ tekst + " baklengs er: ");
			SnuTekst snu = new SnuTekst();
			snu.baklengs(tekst);
			System.out.println("\n");
		}	
	}
}
