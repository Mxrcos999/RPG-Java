import Entities.Location;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        List<Location> lista = new ArrayList<>();
        lista.add(new Location("Masmorra", "teste"));
        lista.add(new Location("Floresta", "teste2"));
        lista.add(new Location("Castelo", "teste2"));

        Entities.World mundo = new Entities.World("Terra media", lista);
 
        // Explora o mundo
        mundo.explorar();
        mundo.explorar(); 
    }
}
