package com.foot.fcb.fan.score.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SquadPlayer {

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "squadID")
	private Squad squad;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "playerID")
	private Player player;

}
