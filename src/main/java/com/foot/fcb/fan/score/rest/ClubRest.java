package com.foot.fcb.fan.score.rest;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foot.fcb.fan.score.dao.ClubDAO;
import com.foot.fcb.fan.score.entity.Club;
import com.foot.fcb.fan.score.entity.Player;
import com.foot.fcb.fan.score.service.ClubBP;

@RestController
@RequestMapping("club")
public class ClubRest {

	@Autowired
	private ClubBP clubBP;

	@PostMapping("/")
	public Club addPlayer(){
		Club club = new Club();
		club.setCreateYear(1899);
		club.setName("FC Barcelone");
		club.setImagePath("FC Barcelone");

		return clubBP.insert(club);
	}

}
