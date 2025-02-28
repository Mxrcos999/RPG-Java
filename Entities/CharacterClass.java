package Entities;

import java.util.ArrayList;
import java.util.List;

public class CharacterClass {
    private String name;
    private List<Skill> skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

        public static List<CharacterClass> getClasses() {
        List<CharacterClass> classes = new ArrayList<>();

        CharacterClass warrior = new CharacterClass();
        warrior.setName("Guerreiro");
        warrior.setSkills(List.of(new Skill("Ataque Pesado", 2), new Skill("Defesa Firme", 2)));

        CharacterClass mage = new CharacterClass();
        mage.setName("Mago");
        mage.setSkills(List.of(new Skill("Bola de Fogo", 2), new Skill("Escudo Arcano", 2)));

        CharacterClass rogue = new CharacterClass();
        rogue.setName("Ladino");
        rogue.setSkills(List.of(new Skill("Ataque Furtivo", 2), new Skill("Evasão", 2)));

        CharacterClass cleric = new CharacterClass();
        cleric.setName("Clérigo");
        cleric.setSkills(List.of(new Skill("Cura Divina", 2), new Skill("Proteção Sagrada", 2)));

        classes.add(warrior);
        classes.add(mage);
        classes.add(rogue);
        classes.add(cleric);

        return classes;
    }
}
