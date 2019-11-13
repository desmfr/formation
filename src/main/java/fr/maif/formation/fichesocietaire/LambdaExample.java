package fr.maif.formation.fichesocietaire;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	
public static void main(String[] args) throws Exception {
		
		List<Societaire> myList = new ArrayList<>();
		myList.add(new PersonnePhysique("123456","Francois","Desmier"));
		myList.add(new PersonnePhysique("123457","Teto","Carre"));
		myList.add(new PersonneMorale("999999","MAIF"));
		myList.add(new PersonnePhysique("123458","Jean","Bonno"));
		
		//exemple Lamnda
		myList.sort((s1, s2) -> s1.getDenomination().compareTo(s2.getDenomination()));
		//myList.forEach(s -> System.out.println(s.getDenomination()));
		myList.forEach(s -> s.setStatut(StatutSoc.CLASSE));
		
		//exemple stream
		myList.stream().map(s -> s.getDenomination()).forEach(d -> System.out.println(d));
		myList.stream()
			.map(Societaire::getDenomination)
			.map(String::toUpperCase)
			.filter(s -> ! s.startsWith("F"))
			.forEach(System.out::println);
		
	}

}
