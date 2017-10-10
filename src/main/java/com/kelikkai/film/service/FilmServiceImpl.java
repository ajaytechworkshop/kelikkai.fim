package com.kelikkai.film.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelikkai.film.bean.FilmDTO;
import com.kelikkai.film.domain.Film;
import com.kelikkai.film.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService
{
	@Autowired
	private FilmRepository filmRepo;
	
	private Logger log = Logger.getLogger(FilmServiceImpl.class);
	
	public void registerFilm(FilmDTO film)
	{
		Film newFilm = new Film();
		BeanUtils.copyProperties(film, newFilm);
		filmRepo.registerFilm(newFilm);
	}

	@Override
	public void updateFilm(FilmDTO updateFilmDTO)
	{
		Film updateFilm = new Film();
		BeanUtils.copyProperties(updateFilmDTO, updateFilm);
		filmRepo.updateFilm(updateFilm);
	}

	@Override
	public Film getFilm(String filmId)
	{
		return filmRepo.getFilm(filmId);
	}

	@Override
	public List<Film> getAllFilms()
	{
		return filmRepo.getAllFilms();
	}
	
	
}
