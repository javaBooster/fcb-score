package com.foot.fcb.fan.score.rest;

import java.time.LocalDate;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foot.fcb.fan.score.dao.ClubDAO;
import com.foot.fcb.fan.score.entity.Club;
import com.foot.fcb.fan.score.entity.Player;
import com.foot.fcb.fan.score.entity.Season;
import com.foot.fcb.fan.score.service.ClubBP;

@RestController
@RequestMapping("club")
public class ClubRest {

	@Autowired
	private ClubBP clubBP;

	@GetMapping("/{id}")
	public Club getClub(@PathParam("id") Long id){
		return clubBP.findAny();
	}

	@PostMapping("/create")
	public Club addPlayer(@RequestBody Club club){
		return clubBP.insert(club);
	}

}
