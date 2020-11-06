/**
 * 
 */
package com.uriel.jpa_locking_demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author uriel
 *
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class State extends BaseEntity {

	@Column
	private String name;
	@Column
	private String code;
}
