/**
 * 
 */
package com.uriel.jpa_locking_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uriel.jpa_locking_demo.entities.Country;

/**
 * @author uriel
 *
 */
public interface CountryRepository extends JpaRepository<Country, Long> {

}
