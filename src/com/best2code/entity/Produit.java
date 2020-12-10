package com.best2code.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name_produit")
	private String nameProduit;
	
	public Produit() {
		
	}

	public Produit(String nameProduit) {
		this.nameProduit = nameProduit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameProduit() {
		return nameProduit;
	}

	public void setNameProduit(String nameProduit) {
		this.nameProduit = nameProduit;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nameProduit=" + nameProduit + "]";
	}
	
	
	
	

}
