package com.foot.fcb.fan.score.enumeration;

public enum PhaseEnum {

	ELIMINATION_PHASE("Elimination"),
	GROUPE_PHASE("Groupe");

	private String code;

	PhaseEnum(final String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
