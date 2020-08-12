package com.projekt1;

public class Warrior extends Gracz {


    public Warrior(String nickname, int ID, int staminaPoints, int maxStaminaPoints, int hitPoints, int damage , int experiencePoints, int level, RollKostka kostka) {
        this.nickname = nickname;
        this.ID=ID;
        this.hitPoints = hitPoints;
        this.maxHitPoints = hitPoints;
        this.damage = damage;
        this.staminaPoints=staminaPoints;
        this.maxStaminaPoints=maxStaminaPoints;
        this.level=level;
        this.experiencePoints=experiencePoints;
        this.kostka = kostka;
    }


}

