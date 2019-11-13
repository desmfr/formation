package fr.maif.formation.fichesocietaire;

import java.util.Comparator;

public class SocDenominationComparator implements Comparator<Societaire>{

	@Override
	public int compare(Societaire o1, Societaire o2) {
		return o1.getDenomination().compareTo(o2.getDenomination());
	}

}
