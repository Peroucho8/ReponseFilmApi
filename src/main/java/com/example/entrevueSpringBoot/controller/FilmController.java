package com.example.entrevueSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.constant.ApiConstant;
import com.example.entrevueSpringBoot.dto.FilmDto;
import com.example.entrevueSpringBoot.service.FilmService;

import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = FilmController.CONTEXT)
@Slf4j
public class FilmController {
	
	public static final String CONTEXT = ApiConstant.CONTEXT_BASE;
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/film/{id}")
	public ResponseEntity<FilmDto> getFilm(@PathVariable(name = "id") Long id) {
		try {
			return new ResponseEntity<>(filmService.getFilm(id) ,HttpStatus.OK);
		} catch (NotFoundException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/film")
	public ResponseEntity<FilmDto> addFilm(@RequestBody FilmDto filmDto){
		FilmDto newFilm = filmService.addFilm(filmDto);
		return new ResponseEntity<>(newFilm, HttpStatus.CREATED);
	}	

}
