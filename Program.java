import Entities.Location;
import Entities.Quest;
import Entities.Shop;
import Entities.Character;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Character person = new Character();

        person = person.createCharacter(); 
        
        List<Location> lista = new ArrayList<>();
     
        lista.add(new Location("Masmorra", "teste"));
        lista.add(new Location("Floresta", "teste2"));
        lista.add(new Location("Castelo", "teste2"));

        Entities.World mundo = new Entities.World("Terra media", lista);
        Entities.Shop shop = new Shop();

        mundo.explorar(person.getName());

        shop.Purchase(person);
        System.out.println("\n");
        System.out.println("O mercador deu uma lista de tarefas para você!");
        var quests = new ArrayList<Quest>();

        quests.add(new Quest("Mate os inimigos da floresta", "Limpe todos os inimigos da floresta", "Combate", 1));
        quests.add(new Quest("Busque uma flor ao mercador", "Busque uma rosa ao mercador", "Ajuda", 1));
        person.setQuests(quests);

        var quest = person.getQuests().get(0);
        quest.IniciarQuest(person);
    }
}
