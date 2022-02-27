package com.foot.fcb.fan.score.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long compoID;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SQUADID")
	private Squad squad;

}
