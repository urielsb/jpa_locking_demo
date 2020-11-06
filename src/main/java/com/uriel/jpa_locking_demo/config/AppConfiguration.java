/**
 * 
 */
package com.uriel.jpa_locking_demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uriel.jpa_locking_demo.entities.Country;
import com.uriel.jpa_locking_demo.repositories.CountryRepository;

/**
 * @author uriel
 *
 */
@Configuration
public class AppConfiguration {

	@Bean
	public CommandLineRunner initData(CountryRepository countryRepository) {
		return (args) -> {
			System.out.println("Que onda loko");
			Country mex = new Country();
			mex.setName("México");
			mex.setCode("MX");
			countryRepository.save(mex);
		};
	}
}
