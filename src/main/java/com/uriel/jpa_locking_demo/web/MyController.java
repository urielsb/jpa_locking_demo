package com.uriel.jpa_locking_demo.web;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uriel.jpa_locking_demo.entities.Country;
import com.uriel.jpa_locking_demo.service.CountryService;

@RestController("/")
public class MyController {
	
	private CountryService countryService;

	public MyController(CountryService countryService) {
		this.countryService = countryService;
	}

	@Transactional
	@GetMapping("countries")
	public List<Country> findAllCountries() {
		System.out.println("Que onda loko!");
		long nCountries = countryService.getCountryCount();
		System.out.printf("There are %d countries.", nCountries);
		return countryService.getAll();
	}
	
}
