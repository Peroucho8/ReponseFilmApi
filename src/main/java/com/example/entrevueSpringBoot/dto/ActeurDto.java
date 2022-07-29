package com.example.entrevueSpringBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe DTO pour l'entité Acteur
 * @author J.Edgar
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActeurDto {
	

	private Long id;	
	private String nom;
	private String prenom;
	
	// ajout des getter setters car problèmes de config entre lombok et mapstruct
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	

}
