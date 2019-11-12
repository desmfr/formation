package fr.maif.formation.fichesocietaire;

public class Societaire {

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
	
	public String getDenomination() {
		return "";
	}
	
	public WriteFiche genererFiche() {
		return new WriteFiche(this);
	}
}
