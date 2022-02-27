package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class SoccerGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long soccerGroupID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GROUPESTAGEID")
	private GroupStage groupStage;

	@ManyToMany
	@JoinTable(name = "SQUADSOCCERGROUP",
			joinColumns = @JoinColumn(name = "SOCCERGROUPID"),
			inverseJoinColumns = @JoinColumn(name = "SQUADID"))
	private Set<Squad> squads;

}
