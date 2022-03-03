package com.foot.fcb.fan.score.rest;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foot.fcb.fan.score.entity.Season;
import com.foot.fcb.fan.score.service.SeasonBP;

@RestController
@RequestMapping("season")
public class SeasonRest {

	@Autowired
	private SeasonBP seasonBP;

	@GetMapping("/{id}")
	public Season getSeason(@PathParam("id") Long id){
		return seasonBP.getSeason(id);
	}

	@PostMapping(path= "/create", consumes = "application/json")
	public Season create(@RequestBody final Season season){
		return seasonBP.save(season);
	}
}
