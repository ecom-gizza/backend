package com.imag.ecom.categorie;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import com.imag.ecom.produit.Produit;

/**
 * Entity implementation class for Entity: Categorie
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
public class Categorie implements Serializable {

	@Id
	private Long id;

	@OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
	private Collection<Produit> produits;
	private static final long serialVersionUID = 1L;

	public Categorie() {
		super();
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
