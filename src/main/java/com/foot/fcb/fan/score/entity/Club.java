package com.foot.fcb.fan.score.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class Club {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long clubID;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int createYear;

	private String imagePath;

}
