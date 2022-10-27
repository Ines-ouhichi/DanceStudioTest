package com.example.demo.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cheographes")
@DiscriminatorValue("cheographe")
public class choegraphe extends Personne implements Serializable{
	
	private int nb_h;
	private float tarif_h;
	private String type_dance;
	
	@OneToMany
	 private Collection<cours> cours=new ArrayList<>();
	
	public choegraphe(Long id, String email, String password, String nom_Pers, String prenom_Pers, int nb_h,
			float tarif_h, String type_dance) {
		super(id, email, password, nom_Pers, prenom_Pers);
		this.nb_h = nb_h;
		this.tarif_h = tarif_h;
		this.type_dance = type_dance;
	}

	public int getNb_h() {
		return nb_h;
	}

	public void setNb_h(int nb_h) {
		this.nb_h = nb_h;
	}

	public float getTarif_h() {
		return tarif_h;
	}

	public void setTarif_h(float tarif_h) {
		this.tarif_h = tarif_h;
	}

	public String getType_dance() {
		return type_dance;
	}

	public void setType_dance(String type_dance) {
		this.type_dance = type_dance;
	}
	
	

}
