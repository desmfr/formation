package fr.maif.formation.fichesocietaire;

public abstract class Societaire {

	private String id;
	
	public Societaire(String id) {
		this.id=id;
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
