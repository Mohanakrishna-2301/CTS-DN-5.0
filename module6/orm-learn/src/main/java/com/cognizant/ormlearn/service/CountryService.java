package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService 
{
    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) 
    {
        this.countryRepository = countryRepository;
    }

    @Transactional(readOnly = true)
    public List<Country> getAllCountries() 
    {
        return countryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Country getCountry(String code)
    {
        return countryRepository.findById(code).orElse(null);
    }

    @Transactional
    public void addCountry(Country country)
    {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(Country country) 
    {
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) 
    {
        countryRepository.deleteById(code);
    }

    @Transactional(readOnly = true)
    public List<Country> searchCountry(String name) 
    {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}