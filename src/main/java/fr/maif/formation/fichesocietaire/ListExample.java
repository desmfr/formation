package fr.maif.formation.fichesocietaire;

import java.util.List;
import java.util.ArrayList;

public class ListExample {
	
	public static void main(String[] args) throws Exception {
		
		List<PersonnePhysique> listPP = new ArrayList<>();
		listPP.add(new PersonnePhysique("123456","Francois","Desmier"));
		listPP.add(new PersonnePhysique("123457","Teto","Carre"));
		listPP.add(new PersonnePhysique("123458","Jean","Bonno"));
		
		listPP.sort(new SocDenominationComparator());
		
		ListExample.generatePdf(listPP);
	}

	public static void generatePdf(List<? extends Societaire> societaires) throws Exception {
		for(Societaire s : societaires) {
			s.genererFiche().save();
		}
	}
	
	public static void addTeacherToList(List<? super PersonnePhysique> societaires) {
		societaires.add(new PersonnePhysique("098765","David","Gayerie"));
	}
	
}
