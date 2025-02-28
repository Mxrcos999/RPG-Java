package Entities;

import java.util.Random;

public class Quest {
    private String title;
    private String type;
    private String description;
    private int reward;

    public Quest(String title, String description, String Type, int reward) {
        this.title = title;
        this.type = type;
        this.description = description;
        this.reward = reward;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public void IniciarQuest(Character person){
        System.out.println(person.getName() + " iniciou uma missão: "  + this.getTitle() + "!");
        boolean vitoria = false;
        if(this.getType() == null){
            var enemy = new Enemy();
            
            vitoria = Combate(person, enemy.CreateEnemy());
        } 
        
        if(vitoria){
            person.setLevel(person.getLevel() + 1);
            person.RemoveQuests(this);
            System.out.println("Parabéns, você conseguiu! Novo nivel: " + person.getLevel());
            return;
        }

        System.out.println("Você falhou!");
    }

    public Boolean Combate(Character person, Enemy enemy) {
        Random random = new Random();
        boolean vitoria = false;
        System.out.println("===== INÍCIO DO COMBATE =====");
        System.out.println(person.getName() + " VS " + enemy.getName());
        System.out.println("Vida de " + person.getName() + ": " + person.getHealthPoints());
        System.out.println("Vida de " + enemy.getName() + ": " + enemy.getHealthPoints());
        System.out.println("=============================");
    
        while (person.getHealthPoints() > 0 && enemy.getHealthPoints() > 0) {
            boolean playerTurn = random.nextBoolean();  
    
            if (playerTurn) {
                int action = random.nextInt(2); 
                if (action == 0) {
                    int danoCausado = person.getDamage() + random.nextInt(5);
                    enemy.setHealthPoints(enemy.getHealthPoints() - danoCausado);
                    System.out.println(person.getName() + " atacou e causou " + danoCausado + " de dano!");
                } else {
                    System.out.println(person.getName() + " se defendeu!");
                }
            } else {
                int action = random.nextInt(2);
                if (action == 0) {
                    int danoCausado = enemy.getDamage() + random.nextInt(5);
                    person.setHealthPoints(person.getHealthPoints() - danoCausado);
                    System.out.println(enemy.getName() + " atacou e causou " + danoCausado + " de dano!");
                } else {
                    System.out.println(enemy.getName() + " se defendeu!");
                }
            }
    
            System.out.println("Vida de " + person.getName() + ": " + person.getHealthPoints());
            System.out.println("Vida de " + enemy.getName() + ": " + enemy.getHealthPoints());
            System.out.println("-----------------------------");
    
            if (person.getHealthPoints() <= 0) {
                System.out.println(person.getName() + " foi derrotado!");
                vitoria = false;
                break;
            } else if (enemy.getHealthPoints() <= 0) {
                System.out.println(enemy.getName() + " foi derrotado!");
                vitoria = true;
                break;
            }
        }
    
        System.out.println("===== FIM DO COMBATE =====");
        return vitoria;
    }
    
}
