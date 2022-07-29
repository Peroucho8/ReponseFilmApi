package com.example.entrevueSpringBoot.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.dto.FilmDto;

@Mapper(uses = {ActeurMapper.class}, componentModel = "spring")
public interface FilmMapper {
	
	@Mapping(target = "titre", source = "titre" )
	@Mapping(target = "description", source = "description" )
	@Mapping(target = "acteurs", source = "film.acteurs" )
	FilmDto toDto(Film film);	
	
	@InheritInverseConfiguration
	Film fromDto(FilmDto filmDto);
	
	List<FilmDto> toDtos(Iterable<Film> filmList);

}
