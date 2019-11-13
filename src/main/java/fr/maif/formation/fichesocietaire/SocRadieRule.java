package fr.maif.formation.fichesocietaire;

public class SocRadieRule implements Rules{
	
	private Societaire soc;
	
	public SocRadieRule(Societaire soc) {
		this.soc = soc;
	}
	
	@Override
	public boolean eval() {
		return soc.getStatut() != StatutSoc.RADIE;
	}

}
