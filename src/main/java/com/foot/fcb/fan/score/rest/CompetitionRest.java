package com.foot.fcb.fan.score.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foot.fcb.fan.score.entity.Competition;
import com.foot.fcb.fan.score.service.CompetitionBP;

@RestController
@RequestMapping("competition")
public class CompetitionRest {

	@Autowired
	private CompetitionBP competitionBP;

	@GetMapping("/{id}")
	public Competition getCompetition(@PathVariable("id") Long id){
		return competitionBP.getCompetition(id);
	}

	@PostMapping("/{id}")
	public Competition create(@RequestBody Competition competition){
		return competitionBP.insert(competition);
	}

}
