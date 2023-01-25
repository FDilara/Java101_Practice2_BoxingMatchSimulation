package boxing_match_simulation;
/*
* A match is two boxers
* Boxer will have power and damage
* Boxers will take turns hitting each other
* */
public class BoxingMatchSimulation {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Boxer1", 15, 100, 90, 0);
        Boxer boxer2 = new Boxer("Boxer2", 10, 95, 100, 0);
        Ring r = new Ring(boxer1, boxer2, 90, 100);
        r.run();
    }
}
