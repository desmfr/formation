package fr.maif.formation.fichesocietaire;

public abstract class Societaire {

	private String id;
	private StatutSoc statut = StatutSoc.ENCOURS;
	
	public Societaire(String id) {
		this.id=id;
	}
	
	public StatutSoc getStatut() {
		return statut;
	}

	public void setStatut(StatutSoc statut) {
		this.statut = statut;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public abstract String getDenomination();
	
	public WriteFiche genererFiche() {
		return new WriteFiche(this);
	}
}
