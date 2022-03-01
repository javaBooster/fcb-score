package com.foot.fcb.fan.score.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.foot.fcb.fan.score.entity.Club;

@Repository
public interface ClubDAO extends CrudRepository<Club, Long> {

}