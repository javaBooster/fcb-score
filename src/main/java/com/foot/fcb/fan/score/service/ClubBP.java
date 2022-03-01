package com.foot.fcb.fan.score.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foot.fcb.fan.score.dao.ClubDAO;
import com.foot.fcb.fan.score.entity.Club;

@Service
public class ClubBP {

	@Autowired
	private ClubDAO clubDAO;

	public Club insert(Club club){
		return clubDAO.save(club);
	}

	public Club findAny(){
		List<Club> list = new ArrayList<>();
		clubDAO.findAll().forEach(list::add);
		return list.get(0);
	}
}
