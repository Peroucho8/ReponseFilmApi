package com.example.entrevueSpringBoot.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevueSpringBoot.domain.Acteur;
import com.example.entrevueSpringBoot.dto.ActeurDto;

@Mapper(componentModel = "spring")
public interface ActeurMapper {
	
	@Mapping(target = "id", source = "id")
	@Mapping(target = "nom", source = "nom")
	@Mapping(target = "prenom", source = "prenom")
	ActeurDto toDto(Acteur acteur);
	
	@InheritInverseConfiguration
	Acteur fromDto(ActeurDto acteur);
	
	List<ActeurDto> toDtos(Iterable<Acteur> acteurList);
	

}
