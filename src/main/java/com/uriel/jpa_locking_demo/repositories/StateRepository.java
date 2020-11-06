/**
 * 
 */
package com.uriel.jpa_locking_demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uriel.jpa_locking_demo.entities.State;

/**
 * @author uriel
 *
 */
public interface StateRepository extends JpaRepository<State, Long> {

}
