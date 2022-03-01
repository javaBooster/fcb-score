package com.foot.fcb.fan.score.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.foot.fcb.fan.score.dao.PlayerDAO;
import com.foot.fcb.fan.score.entity.Player;

@Service
public class PlayerBP {

	@Autowired
	private PlayerDAO playerDAO;

	public Player getNewPlayer(){
		return new Player();
	}

	public Player findPlayerByID(Long playerID){
		return playerDAO.findById(playerID).get();
	}

	public Player insert(Player player){
		return playerDAO.save(player);
	}
}
