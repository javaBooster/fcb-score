package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Competition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long competitionID;

	private String name;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Season> saisons;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Club> clubs;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Match> matchs;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Stage> rounds;







}

