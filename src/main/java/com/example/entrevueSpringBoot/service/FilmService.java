package com.example.entrevueSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.dto.FilmDto;
import com.example.entrevueSpringBoot.mapper.FilmMapper;
import com.example.entrevueSpringBoot.repository.FilmRepository;

import javassist.NotFoundException;

@Service
public class FilmService {
	
	@Autowired
	private FilmMapper filmMapper;
	
	@Autowired
	private FilmRepository filmrepository;
	
	/**
	 * Chercher un film dans la db par son Id
	 * 
	 * @param id - le id du film
	 * @return un {@link FilmDto}
	 * @throws NotFoundException
	 */
	public FilmDto getFilm(Long id) throws NotFoundException {
		return filmMapper.toDto(filmrepository.findById(id).orElseThrow(()-> new NotFoundException(id.toString())));
	}
	
	/**
	 * Ajouter un film dans db
	 * 
	 * @param {@link {@link FilmDto}}
	 * @return le filmDto ajouté dans la db
	 */
	public FilmDto addFilm(FilmDto filmDto) {
		return filmMapper.toDto(filmrepository.save(filmMapper.fromDto(filmDto)));
	}

}
