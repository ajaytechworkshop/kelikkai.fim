package com.kelikkai.film.repository;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import com.kelikkai.film.domain.Film;

@Repository
public class FilmRepoSitoryImpl implements FilmRepository
{
	private Logger log = Logger.getLogger(FilmRepoSitoryImpl.class);
	
	@Autowired
	private MongoOperations mongoOps;
	
	@Override
	public void registerFilm(Film film)
	{
		mongoOps.save(film);
	}

	@Override
	public void updateFilm(Film updateFilm)
	{
		mongoOps.save(updateFilm);
	}

	@Override
	public Film getFilm(String filmId)
	{
		return mongoOps.findById(filmId,Film.class);
	}

	@Override
	public List<Film> getAllFilms()
	{
		return mongoOps.findAll(Film.class);
	}
	
	
}
