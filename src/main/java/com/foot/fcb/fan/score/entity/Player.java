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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long playerID;

	@Column(name = "FIRSTNAME", nullable = false)
	private String firstName;

	@Column(name = "LASTNAME", nullable = false)
	private String lastName;

	@Column(name = "SHIRTNAME", nullable = false)
	private String shirtName;

	@Column(name = "SHIRTNUMBER", nullable = false)
	private int shirtNumber;

	@Column(name = "BIRTHDAY", nullable = false)
	private LocalDate birthday;

	@ElementCollection(targetClass=String.class)
	private List<String> nickNames;
/*

	@Column(name = "IMAGEPATH")
	private String imagePath;
*/

	@ManyToMany
	@JoinTable(name = "SquadPlayer",
			joinColumns = @JoinColumn(name = "PLAYERID"),
			inverseJoinColumns = @JoinColumn(name = "SQUADID"))
	private Set<Squad> squads;

	@ManyToOne
	@JoinColumn(name = "CLUBID")
	private Club club;

/*	@OneToOne
	@JoinColumn(name = "CURRENTSQUADID")
	private Squad currentSquad;*/

	public Long getPlayerID() {
		return playerID;
	}

	public void setPlayerID(final Long playerID) {
		this.playerID = playerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getShirtName() {
		return shirtName;
	}

	public void setShirtName(final String shirtName) {
		this.shirtName = shirtName;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(final int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(final LocalDate birthday) {
		this.birthday = birthday;
	}

	public List<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(final List<String> nickNames) {
		this.nickNames = nickNames;
	}

	public Set<Squad> getSquads() {
		return squads;
	}

	public void setSquads(final Set<Squad> squads) {
		this.squads = squads;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(final Club club) {
		this.club = club;
	}
}
