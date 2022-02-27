package com.foot.fcb.fan.score.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long playerID;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column(nullable = false)
	private String shirtName;

	@Column(nullable = false)
	private int shirtNumber;

	@Column(nullable = false)
	private LocalDate birthday;

	@ElementCollection(targetClass=String.class)
	private List<String> nickNames;

	private String imagePath;

	@ManyToMany
	@JoinTable(name = "SquadPlayer",
			joinColumns = @JoinColumn(name = "PLAYERID"),
			inverseJoinColumns = @JoinColumn(name = "SQUADID"))
	private Set<Squad> squads;

	@ManyToOne
	@JoinColumn(name = "CLUBID")
	private Club club;

	@OneToOne
	@JoinColumn(name = "CURRENTSQUADID")
	private Squad currentSquad;


}
