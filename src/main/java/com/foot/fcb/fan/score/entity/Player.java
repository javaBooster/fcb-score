package com.foot.fcb.fan.score.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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

	private List<String> nickNames;

	private String imagePath;
	@ManyToMany
	private Squad squad;

}
