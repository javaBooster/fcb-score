package com.foot.fcb.fan.score.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foot.fcb.fan.score.entity.Role;
import com.foot.fcb.fan.score.enumeration.RoleEnum;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {

	Optional<Role> findByName(RoleEnum name);
}
