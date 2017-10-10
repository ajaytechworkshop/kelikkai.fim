package com.kelikkai.film.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.kelikkai.film.util.Constants;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class MongoConfig
{
	@Bean
	public MongoDbFactory mongoDbFactory()
	{
		return new SimpleMongoDbFactory(new MongoClient(new MongoClientURI("mongodb://localhost:27017")),Constants.DB_NAME);
	}
	
	@Bean
	public MongoTemplate mongoTemplate()
	{
		return new MongoTemplate(mongoDbFactory());
	}
}
