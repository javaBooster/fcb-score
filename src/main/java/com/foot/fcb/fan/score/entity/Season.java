package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Season {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seasonID;

	private String year;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Competition> competitions;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Squad> squads;
}
