package fr.maif.formation.fichesocietaire;

public class PersonneMorale extends Societaire {
	
	private String name;
	private String respName;
	
	public PersonneMorale(String id, String name) {
		super(id);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRespName() {
		return respName;
	}
	
	public void setRespName(String respName) {
		this.respName = respName;
	}

	@Override
	public String getDenomination() {
		return this.name;
	}
}
