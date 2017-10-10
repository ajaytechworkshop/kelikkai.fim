package com.kelikkai.film.repository;

import java.util.List;

import com.kelikkai.film.domain.Film;

public interface FilmRepository
{
	public void registerFilm(Film film);
	
	public void updateFilm(Film updateFilm);
	
	public Film getFilm(String filmId);
	
	public List<Film> getAllFilms();
}
