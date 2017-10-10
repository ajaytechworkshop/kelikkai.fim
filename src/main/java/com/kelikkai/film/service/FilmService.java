package com.kelikkai.film.service;

import java.util.List;

import com.kelikkai.film.bean.FilmDTO;
import com.kelikkai.film.domain.Film;

public interface FilmService
{
	public void registerFilm(FilmDTO film);
	
	public void updateFilm(FilmDTO updateFilm);
	
	public Film getFilm(String filmId);
	
	public List<Film> getAllFilms();
}
