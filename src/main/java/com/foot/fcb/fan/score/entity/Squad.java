package com.foot.fcb.fan.score.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Squad {

	@Id
	@GeneratedValue
	private Long squadID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int createYear;

	private String imagePath;

	@OneToMany
	private Set<Player> players;



}
