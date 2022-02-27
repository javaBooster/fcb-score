package com.foot.fcb.fan.score.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long matchID;

	private LocalDate matchTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPETITIONID")
	private Competition competition;

	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name = "STAGEID")
	private Stage stage;

}
