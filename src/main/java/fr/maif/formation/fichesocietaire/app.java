package fr.maif.formation.fichesocietaire;

import java.time.LocalDate;
import java.util.Scanner;

public class app {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("name? ");
		String name = scanner.nextLine();
		System.out.println("surname? ");
		String prenom = scanner.nextLine();
		
		Societaire soc = new PersonnePhysique("123456m", prenom, name);
		
		WriteFiche fiche = soc.genererFiche();
		fiche.save();
	
	}
}
