package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("Groupe")
public class GroupStage extends Stage{

	@OneToMany
	public Set<SoccerGroup> groups;
}
