package Entities;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static List<Race> getRaces() {
        List<Race> races = new ArrayList<>();

        Race human = new Race();
        human.setName("Humano");

        Race elf = new Race();
        elf.setName("Elfo");

        Race dwarf = new Race();
        dwarf.setName("Anão");

        Race orc = new Race();
        orc.setName("Orc");

        Race troll = new Race();
        troll.setName("Troll");

        races.add(human);
        races.add(elf);
        races.add(dwarf);
        races.add(orc);
        races.add(troll);

        return races;
    }
}
