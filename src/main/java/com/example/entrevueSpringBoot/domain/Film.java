package com.example.entrevueSpringBoot.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * @author J.Edgar
 * 
 * Classe de persistence pour l'entité Film
 *
 */
@Table(name = "Film")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Film {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id")
	private Long id;
	
	@Column(name = "Titre")
	private String titre;
	
	@Column(name = "Descripton")
	private String description;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "Film_Acteur", joinColumns = @JoinColumn(name = "Id_Film"), inverseJoinColumns = @JoinColumn(name = "Id_Acteur"))
	private List<Acteur> acteurs;

	
	// ajout des getter setters car problèmes de config entre lombok et mapstruct
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Acteur> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<Acteur> acteurs) {
		this.acteurs = acteurs;
	}
	
	

}
