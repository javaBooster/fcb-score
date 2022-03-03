package com.foot.fcb.fan.score.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Season implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seasonID;

	private String year;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Competition> competitions;

	@OneToMany(fetch = FetchType.LAZY)
	private Set<Squad> squads;

	public Long getSeasonID() {
		return seasonID;
	}

	public void setSeasonID(final Long seasonID) {
		this.seasonID = seasonID;
	}

	public String getYear() {
		return year;
	}

	public void setYear(final String year) {
		this.year = year;
	}

	public Set<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(final Set<Competition> competitions) {
		this.competitions = competitions;
	}

	public Set<Squad> getSquads() {
		return squads;
	}

	public void setSquads(final Set<Squad> squads) {
		this.squads = squads;
	}
}
