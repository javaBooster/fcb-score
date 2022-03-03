package com.foot.fcb.fan.score.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foot.fcb.fan.score.entity.Season;

@Repository
public interface SeasonDAO extends JpaRepository<Season, Long> {

}
