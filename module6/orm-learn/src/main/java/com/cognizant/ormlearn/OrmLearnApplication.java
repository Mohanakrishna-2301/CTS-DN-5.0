package com.cognizant.ormlearn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner 
{
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private final CountryService countryService;

    public OrmLearnApplication(CountryService countryService) 
    {
        this.countryService = countryService;
    }

    public static void main(String[] args) 
    {
        SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main");
    }

    @Override
    public void run(String... args) 
    {
        LOGGER.info("Start");

        List<Country> countries = countryService.getAllCountries();

        countries.forEach(System.out::println);

        LOGGER.info("End");
    }
}