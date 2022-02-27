package com.foot.fcb.fan.score.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Elimination")
public class EliminationStage extends Stage{

}
