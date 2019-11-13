package fr.maif.formation.fichesocietaire;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CsvLoader {

	public static void main(String[] args) throws Exception {
		
		List<Societaire> myList = null;
		
		Path filePath = Paths.get("societaires.csv");
		
		myList = Files.lines(filePath)
			//l=line c=colonne
			.map(l -> l.split(";"))
			.filter(c -> c.length >= 3)
			.filter(c -> c[1].equals("PP") || c[1].equals("PM"))
			.map(CsvLoader::createSoc)
			.collect(Collectors.toList());
	
		myList.stream()
			.map(Societaire::getDenomination)
			.forEach(System.out::println);
		
		Optional<Societaire> r = myList.stream()
			.reduce((s1, s2) -> s1.getDenomination().length() > s2.getDenomination().length() ? s1 : s2);
		
		
		if (r.isPresent()) {
			System.out.println("longer is : " + r.get().getDenomination());
		}
	}
	
	public static Societaire createSoc(String[] c) {
		if (c[1].equals("PP")) {
			return new PersonnePhysique(c[0], c[2], c[3]);
		} else {
			return new PersonneMorale(c[0], c[2]);
		}
	}

}
