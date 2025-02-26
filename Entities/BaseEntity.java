package Entities;

import java.util.List;

public class BaseEntity {
    private String name;
    private Race race;
    private CharacterClass characterClass;
    private int level;
    private int maxHealthPoints;
    private int healthPoints;
    private Inventory inventory;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setmaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage;
    }

    public int setDamage(int damage) {
        return this.damage = damage;
    }

    public int receiveDamage(int damage) {
        this.healthPoints = healthPoints - damage;

        return healthPoints;
    }

    public List<Item> addItens(Item item) {
        return inventory.addItem(item);
    }
}
