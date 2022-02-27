package com.foot.fcb.fan.score.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Squad {

	@Id
	@GeneratedValue
	private Long squadID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int createYear;

	private String imagePath;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLUBID")
	private Club club;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Player> players;

	@ManyToMany
	private Set<SoccerGroup> soccerGroups;


}
