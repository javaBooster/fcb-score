package com.foot.fcb.fan.score.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.foot.fcb.fan.score.enumeration.RoleEnum;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleID;

	@Enumerated(EnumType.STRING)
	private RoleEnum name;

	public Integer getRoleID() {
		return roleID;
	}

	public void setRoleID(final Integer roleID) {
		this.roleID = roleID;
	}

	public RoleEnum getName() {
		return name;
	}

	public void setName(final RoleEnum name) {
		this.name = name;
	}
}
