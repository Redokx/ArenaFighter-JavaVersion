package com.projekt1;

public class Gracz {

    protected int ID;
    protected String nickname;
    protected int hitPoints;
    protected int maxHitPoints;
    protected int staminaPoints;
    protected int maxStaminaPoints;
    protected int manaPoints;
    protected int maxManaPoints;
    protected int experiencePoints;
    protected int level;
    protected int damage;
    protected int magicDamage;
    protected RollKostka kostka;
    protected String message;


    @Override
    public String toString() {
        return nickname;
    }

    public boolean alive() {
        return (hitPoints > 0);
    }


    public void BasicAttack(Gracz enemy) {
        int hit = damage + kostka.roll();
        setMessage(nickname + " zadał " + hit + " obrażeń");
        enemy.rana(hit);
        staminaPoints -= 5;
    }



    public void SwordAttack(Gracz enemy) {
        int hit = damage + kostka.roll();
        setMessage(nickname + " zadał " + hit + " obrażeń");
        enemy.rana(hit);
        staminaPoints -= 5;
    }

    public void FireBall(Gracz enemy) {
        int hit = damage + kostka.roll();
        setMessage(nickname + " zadał " + hit + " obrażeń");
        enemy.rana(hit);
        manaPoints -= 5;
    }

    




    public void rana(int hit) {
        int injury = hit - kostka.roll();
        if (injury > 0) {
            hitPoints -= injury;
            message = nickname + " próbował się obronić ale otrzymał " + injury + " obrażeń";
            if (hitPoints <= 0) {
                hitPoints = 0;
                message += " i przegrał";

            }

        } else
            message = nickname + " zablokował atak";
        setMessage(message);
    }



        protected void setMessage(String message) {
            this.message = message;

        }

        public String getLastMessage() {
            return message;
        }

    protected void attack(Warrior enemy) {
    }
}





