package Entities;
 
import java.util.List;
import java.util.Random;

public class World {
    private String name;
    private List<Location> locations;

    public World(String name, List<Location> locations) {
        this.name = name;
        this.locations = locations;
    }

    public void adicionarLocal(Location location) {
        locations.add(location);
        System.out.println("Local adicionado: " + location);
    }

    public void explorar(String name) {
        if (locations.isEmpty()) {
            System.out.println("O mundo está vazio. Adicione locais para explorar.");
            return;
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(locations.size());
        Location localDescoberto = locations.get(indiceAleatorio); 

        System.out.println("Explorando o mundo " + name + "...");
        var local = localDescoberto.getName();
        System.out.println(name + " Descobriu: " + local); 
    }
}
