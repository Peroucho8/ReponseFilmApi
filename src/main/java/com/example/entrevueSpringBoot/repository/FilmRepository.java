package com.example.entrevueSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entrevueSpringBoot.domain.Film;

public interface FilmRepository extends JpaRepository<Film, Long>{

}
