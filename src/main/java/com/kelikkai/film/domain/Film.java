package com.kelikkai.film.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.kelikkai.film.util.Constants;
import com.kelikkai.film.util.Genre;
import com.kelikkai.film.util.Language;

@Document(collection=Constants.COLLECTIONNAME_FILM)
public class Film
{
	@Id
	private String id;
	private String name;
	private String releaseYear;
	private Language lang; 
	private String length;
	private Genre genre;
	private String rating;
	private String storeyBase;
	private String storyLine;
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getReleaseYear()
	{
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear)
	{
		this.releaseYear = releaseYear;
	}
	public Language getLang()
	{
		return lang;
	}
	public void setLang(Language lang)
	{
		this.lang = lang;
	}
	public String getLength()
	{
		return length;
	}
	public void setLength(String length)
	{
		this.length = length;
	}
	public Genre getGenre()
	{
		return genre;
	}
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}
	public String getRating()
	{
		return rating;
	}
	public void setRating(String rating)
	{
		this.rating = rating;
	}
	public String getStoreyBase()
	{
		return storeyBase;
	}
	public void setStoreyBase(String storeyBase)
	{
		this.storeyBase = storeyBase;
	}
	public String getStoryLine()
	{
		return storyLine;
	}
	public void setStoryLine(String storyLine)
	{
		this.storyLine = storyLine;
	}
	
	@Override
	public String toString()
	{
		return "Film [id=" + id + ", name=" + name + ", releaseYear=" + releaseYear + ", lang=" + lang + ", length="
				+ length + ", genre=" + genre + ", rating=" + rating + ", storeyBase=" + storeyBase + ", storyLine="
				+ storyLine + "]";
	}
	
}
