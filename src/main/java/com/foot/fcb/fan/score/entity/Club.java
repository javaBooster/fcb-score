package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Club {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clubID;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CREATEYEAR", nullable = false)
	private int createYear;

	@Column(name = "IMAGEPATH")
	private String imagePath;

	@OneToMany
	@JsonIgnore
	private Set<Squad> squads;
/*

	@OneToOne
	@JoinColumn(name = "CURRENTSQUADID")
	private Squad CurrentSquad;
*/

	public Long getClubID() {
		return clubID;
	}

	public void setClubID(final Long clubID) {
		this.clubID = clubID;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getCreateYear() {
		return createYear;
	}

	public void setCreateYear(final int createYear) {
		this.createYear = createYear;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(final String imagePath) {
		this.imagePath = imagePath;
	}

	public Set<Squad> getSquads() {
		return squads;
	}

	public void setSquads(final Set<Squad> squads) {
		this.squads = squads;
	}

}
