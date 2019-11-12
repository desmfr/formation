package fr.maif.formation.fichesocietaire;

import java.time.LocalDate;
import java.time.Period;

public class PersonnePhysique extends Societaire {

	private String name = null;
	private String prenom = null;
	private LocalDate birthDate = null;
	
	public PersonnePhysique(String id, String prenom, String name) {
		super(id); /*appel du constructeur de la superclasse societaire*/
		this.prenom = prenom;
		this.name = name;
	}
	
	public int getAge() {
		if (birthDate == null) {
			throw new NullPointerException("birthdate is null");
		}
		LocalDate now = LocalDate.now();
		Period age = Period.between(birthDate, now);
		return age.getYears();
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	@Override
	public String getDenomination() {
		return this.prenom + " " + this.name;
	}
}
