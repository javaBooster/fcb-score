package com.foot.fcb.fan.score.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foot.fcb.fan.score.dao.CompetitionDAO;
import com.foot.fcb.fan.score.entity.Competition;

@Service
public class CompetitionBP {

	@Autowired
	private CompetitionDAO competitionDAO;

	public Competition getCompetition(final Long id){
		return competitionDAO.getById(id);
	}

	public Competition insert(final Competition competition){
		return competitionDAO.save(competition);
	}
}
