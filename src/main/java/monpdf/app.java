package monpdf;

import java.time.LocalDate;
import java.util.Scanner;

public class app {

	public static void main(String[] args) throws Exception{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("name? ");
		String name = scanner.nextLine();
		System.out.println("surname? ");
		String prenom = scanner.nextLine();
		
		Societaire soc = new Societaire("088419m", prenom, name);
		//societaire.setName(name);
		//societaire.setPrenom(prenom);
		soc.setBirthDate(LocalDate.of(1983, 07, 18));
		
		//System.out.println(societaire.getPrenom() + " " +
		//					soc.getName() + " " +
		//					soc.getAge() +
		//					" ans.");
		
		FicheSocietaire fiche = soc.genererFiche();
		fiche.save();
		//scanner.close();
	}
}
