package Entities;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Character extends BaseEntity {
    private List<Quest> quests = new ArrayList<>();

    public Character(String name, Race race, CharacterClass characterClass, int level, int maxHealthPoints, int healthPoints, Inventory inventory, int damage) {
        this.setName(name);
        this.setRace(race);
        this.setCharacterClass(characterClass);
        this.setLevel(level);
        this.setmaxHealthPoints(maxHealthPoints);
        this.setHealthPoints(healthPoints);
        this.setInventory(inventory);
        this.setDamage(damage);
    }

    public Character(){}
    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }

    public void RemoveQuests(Quest quest) {
        this.quests.remove(quest);
    }

    public void addQuest(Quest quest) {
        if (quest != null) {
            this.quests.add(quest);
        }
    }

    public static Character createCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do personagem: ");
        String name = scanner.nextLine();

        System.out.println("Raças disponiveis:");
        List<Race> races = Race.getRaces();
        for (int i = 0; i < races.size(); i++) {
            System.out.println((i + 1) + " - " + races.get(i).getName());
        }
        System.out.println("=============================");

        Race selectedRace = races.get(1);

        System.out.println("Classes disponiveis:");
        List<CharacterClass> classes = CharacterClass.getClasses(); 
        for (int i = 0; i < classes.size(); i++) {
            System.out.println((i + 1) + " - " + classes.get(i).getName());
        }
        CharacterClass selectedClass = classes.get(1);
        System.out.println("=============================");

        int level = 1;
        int maxHealthPoints = 100; 
        int healthPoints = maxHealthPoints;
        int damage = 10; 
        Inventory inventory = new Inventory();

        Character character = new Character(name, selectedRace, selectedClass, level, maxHealthPoints, healthPoints, inventory, damage);

        System.out.println("Personagem criado com sucesso!");
        System.out.println("\n");

        System.out.println("Personagem: " + character.getName());
        System.out.println("Raça: " + character.getRace().getName());
        System.out.println("Classe: " + character.getCharacterClass().getName());
        System.out.println("Nível: " + character.getLevel());
        System.out.println("Pontos de Vida: " + character.getHealthPoints() + "/" + character.getMaxHealthPoints());
        System.out.println("Dano: " + character.getDamage());
        System.out.println("=============================");

        return character;
    }
}
