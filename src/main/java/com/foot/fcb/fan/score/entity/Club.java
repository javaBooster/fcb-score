package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.lang.Nullable;

@Entity
public class Club {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clubID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int createYear;

	private String imagePath;

	@OneToMany
	private Set<Squad> squads;

	@OneToOne
	@JoinColumn(name = "CURRENTSQUADID")
	private Squad CurrentSquad;

}
