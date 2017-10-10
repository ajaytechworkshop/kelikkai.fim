package com.kelikkai.film.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kelikkai.film.bean.FilmDTO;
import com.kelikkai.film.domain.Film;
import com.kelikkai.film.service.FilmService;
import com.kelikkai.film.util.Constants;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping(value=Constants.URL_APPROOT)
public class FilmController
{
	private Logger log = Logger.getLogger(FilmController.class);
	
	@Autowired
	private FilmService filmService;
	
	@ApiOperation(value="The API registers new film")
	@RequestMapping(value=Constants.URL_REGISTERFILM,method=RequestMethod.POST)
	public void registerFilm(@ApiParam("Film DTO containing the new film registeration details") @RequestBody  FilmDTO film)
	{
		log.info("--> FilmController registerFilm.."+film);
		
		filmService.registerFilm(film);
		
		log.info("FilmController registerFilm -->");
	}
	
	@ApiOperation(value="The API updates an existing filmr")
	@RequestMapping(value=Constants.URL_UPDATEFILM,method=RequestMethod.PUT)
	public void updateFilm(@ApiParam("Film DTO containing the updated film details") @RequestBody  FilmDTO filmUpdateBean)
	{
		log.info("--> FilmController updateFilm.."+filmUpdateBean);
		
		filmService.updateFilm(filmUpdateBean);
		
		log.info("FilmController updateFilm -->");
	}
	
	@ApiOperation(value="The API gets the film details passing the film id")
	@RequestMapping(value="/{filmId}",method=RequestMethod.GET)
	public Film getFilm(@ApiParam("Film id whose details needs to be fetched") @PathVariable(value="filmId") String filmId)
	{
		log.info("--> FilmController getFilm.."+filmId);
		
		Film film = filmService.getFilm(filmId);
		
		log.info("FilmController getFilm -->"+film);
		
		return film;
	}
	
	@ApiOperation(value="The API gets all the films registred in kelikkai")
	@RequestMapping(value=Constants.URL_ALLFILM,method=RequestMethod.GET)
	public List<Film> getAllFilms()
	{
		log.info("--> FilmController getAllFilms..");
		
		List<Film> films = filmService.getAllFilms();
		
		log.info("FilmController getAllFilms -->"+films);
		
		return films;
	}
}
