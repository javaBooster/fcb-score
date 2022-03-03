package com.foot.fcb.fan.score.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Squad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long squadID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLUBID")
	private Club club;

	@ManyToMany(fetch = FetchType.LAZY)
	private Set<Player> players;

	@ManyToMany
	private Set<SoccerGroup> soccerGroups;

	public Long getSquadID() {
		return squadID;
	}

	public void setSquadID(final Long squadID) {
		this.squadID = squadID;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(final Club club) {
		this.club = club;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(final Set<Player> players) {
		this.players = players;
	}

	public Set<SoccerGroup> getSoccerGroups() {
		return soccerGroups;
	}

	public void setSoccerGroups(final Set<SoccerGroup> soccerGroups) {
		this.soccerGroups = soccerGroups;
	}
}
