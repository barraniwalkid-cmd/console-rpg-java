package org.example;

import com.sun.management.UnixOperatingSystemMXBean;

public class Hero {
    private String name;
    private int health;
    private int maxHealth;
    private int attack;
    private int level;
    private int experience;
public Hero(String name ){
    this.name = name;
    health = 100;
    maxHealth = 100;
    attack = 15;
    level = 1;
    experience = 0 ;

}

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }
public void displayStatus(){
    System.out.println("NOM : " + this.name);
    System.out.println("PV : " + health);
    System.out.println("MAX PV :" + maxHealth);
    System.out.println("Attack : " + attack);
    System.out.println("Niveau :" + level);
    System.out.println("Experience :" + experience);

}
}




