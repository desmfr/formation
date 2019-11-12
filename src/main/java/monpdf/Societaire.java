package monpdf;

import java.time.LocalDate;
import java.time.Period;

public class Societaire {

	private String id = null;
	private String name = null;
	private String prenom = null;
	private LocalDate birthDate = null;
	
	public Societaire(String id, String prenom, String name) {
		this.id = id;
		this.prenom = prenom;
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getAge() {
		if (birthDate == null) {
			throw new NullPointerException("birthdate is null");
		}
		LocalDate now = LocalDate.now();
		Period age = Period.between(birthDate, now);
		return age.getYears();
	}
	
	public FicheSocietaire genererFiche() {
		return new FicheSocietaire(this);
	}
	
	public void setId(String id) {
		this.id = id;
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
}
