package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="STAGETYPE")
public abstract class Stage {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stageID;

	@OneToMany
	private Set<Match> matches;

}
