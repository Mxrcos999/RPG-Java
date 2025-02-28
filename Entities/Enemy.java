package Entities;

import java.util.List;

public class Enemy extends BaseEntity {
    public Enemy(String name, Race race, int maxHealthPoints, int healthPoints, int damage) {
        this.setName(name);
        this.setRace(race);
        this.setmaxHealthPoints(maxHealthPoints);
        this.setHealthPoints(healthPoints);
        this.setDamage(damage);
    }

    public Enemy(){}
    public Enemy CreateEnemy(){
        List<Race> races = Race.getRaces();

        return new Enemy("Gigante da floresta", races.get(3), 80,80, 10);
    }
}
