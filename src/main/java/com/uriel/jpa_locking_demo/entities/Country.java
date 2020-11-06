/**
 * 
 */
package com.uriel.jpa_locking_demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author uriel
 *
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Country extends BaseEntity {

	@Column
	private String name;
	@Column
	private String code;
	@OneToMany(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			orphanRemoval = true)
	@JoinColumn(name = "id")
	private List<State> states = new ArrayList<>();
}
