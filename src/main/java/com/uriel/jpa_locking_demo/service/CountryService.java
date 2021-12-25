package com.uriel.jpa_locking_demo.service;

import java.util.List;

import com.uriel.jpa_locking_demo.entities.Country;

public interface CountryService {

	public long getCountryCount();
	
	public List<Country> getAll();
}
