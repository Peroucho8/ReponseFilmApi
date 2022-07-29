package com.example.entrevueSpringBoot.dto;

import java.util.List;

import com.example.entrevueSpringBoot.domain.Acteur;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe DTO pour l'entité Film
 * @author J.Edgar
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto{

	@JsonIgnoreProperties
	private Long id;	
	private String titre;	
	private String description;	
	private List<Acteur> acteurs;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
