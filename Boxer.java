package boxing_match_simulation;

public class Boxer {
    String name;
    int damage; //damage to the opponent boxer
    int health; //boxer's strength
    int weight; //boxer's weight
    double dodge; //dodge incoming damage

    public Boxer(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Boxer foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " damage");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodges the incoming damage.");
            return foe.health;
        }
        if ((foe.health - this.damage)<0){
            return 0;
        }
        return (foe.health - this.damage);
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
