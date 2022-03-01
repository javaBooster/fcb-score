package com.foot.fcb.fan.score.rest;

import java.time.LocalDate;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foot.fcb.fan.score.entity.Player;
import com.foot.fcb.fan.score.service.ClubBP;
import com.foot.fcb.fan.score.service.PlayerBP;

@RestController
@RequestMapping("player")
public class PlayerRest {

	@Autowired
	private PlayerBP playerBP;

	@Autowired
	private ClubBP clubBP;

	@GetMapping("/new")
	public Player getNewPlayer(){
		Player player = new Player();
		player.setPlayerID(1l);
		player.setFirstName("adil");
		player.setLastName("meyete");
		player.setShirtNumber(15);

		return player;
	}

	@PostMapping("/")
	public Player addPlayer(){
		Player player = new Player();
		player.setFirstName("adil");
		player.setLastName("meyete");
		player.setShirtName("adilokov");
		player.setShirtNumber(15);
		player.setBirthday(LocalDate.now());
		player.setPlayerID(1l);
		player.setClub(clubBP.findAny());

		return playerBP.insert(player);
	}

	@GetMapping("/{id}")
	public Player findByID(@PathVariable("id") final Long id){
		return playerBP.findPlayerByID(id);
	}
}
