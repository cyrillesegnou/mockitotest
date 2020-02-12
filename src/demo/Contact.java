package demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Contact implements Serializable {
	
	private long id;
	private String civilite;
	private String nom;
	private String prenom;

	//private List<Adresse> adresses = new ArrayList<>();
	
	public Contact() {
	}

	public Contact(String civilite, String nom, String prenom) {

		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", adresses="
				 + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

//	public List<Adresse> getAdresses() {
//		return adresses;
//	}
//
//	public void setAdresses(List<Adresse> adresses) {
//		this.adresses = adresses;
//	}
	
	

}
