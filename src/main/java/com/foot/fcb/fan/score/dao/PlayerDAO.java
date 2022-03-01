package com.foot.fcb.fan.score.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foot.fcb.fan.score.entity.Player;

@Repository
public interface PlayerDAO extends CrudRepository<Player, Long> {
	Player findByPlayerID(long playerID);
}
