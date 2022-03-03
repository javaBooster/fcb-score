package com.foot.fcb.fan.score.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foot.fcb.fan.score.dao.SeasonDAO;
import com.foot.fcb.fan.score.entity.Season;

@Service
public class SeasonBP {

	@Autowired
	private SeasonDAO seasonDAO;

	public Season getSeason(Long seasonID){
		return seasonDAO.getById(seasonID);
	}

	public Season save(Season season){
		return seasonDAO.save(season);
	}

}
