package com.uriel.jpa_locking_demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.uriel.jpa_locking_demo.entities.Country;
import com.uriel.jpa_locking_demo.repositories.CountryRepository;
import com.uriel.jpa_locking_demo.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	private CountryRepository repository;

	public CountryServiceImpl(CountryRepository repository) {
		this.repository = repository;
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	@Override
	public long getCountryCount() {
		System.out.println("Number of countries");
		return repository.count();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public List<Country> getAll() {
		System.out.println("Get All Countries");
		return repository.findAll();
	}

}
