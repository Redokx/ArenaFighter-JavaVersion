package com.projekt1;

public class Mage extends Gracz {


    public Mage(String nickname, int ID, int hitPoints, int damage , int manaPoints,int maxManaPoints, int magicDamage, int experiencePoints, int level,int staminaPoints, RollKostka kostka) {
       super();
        this.nickname = nickname;
        this.ID=ID;
        this.hitPoints = hitPoints;
        this.maxHitPoints = hitPoints;
        this.damage = damage;
        this.maxManaPoints = maxManaPoints;
        this.manaPoints=manaPoints;
        this.magicDamage = magicDamage;
        this.level=level;
        this.experiencePoints=experiencePoints;
        this.staminaPoints=staminaPoints;
        this.kostka = kostka;
    }


}
