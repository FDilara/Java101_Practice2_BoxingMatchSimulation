package boxing_match_simulation;

public class Ring {
    Boxer b1;
    Boxer b2;
    //Is the boxer's weight appropriate for the match?
    int minWeight;
    int maxWeight;

    public Ring(Boxer b1, Boxer b2, int minWeight, int maxWeight) {
        this.b1 = b1;
        this.b2 = b2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    //we need to start the match
    public void run() {

        if (checkWeight()) {
            //The match ends when any boxer's strength(health) drops below 0.
            while (b1.health > 0 && b2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                //b1's opponent is assigned as b2
                b2.health = b1.hit(b2);
                if (isWin()){
                    break;
                }
                //b2's opponent is assigned as b1
                b1.health = b2.hit(b1);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("The weights of the boxers do not match.");
        }
    }

    public boolean checkWeight() {
        return (b1.weight>=minWeight && b1.weight<=maxWeight) && (b2.weight>=minWeight && b2.weight<=maxWeight);
    }

    public boolean isWin() {
        if (b1.health == 0) {
            System.out.println("Winner of this match: " + b2.name);
            return true;
        } else if (b2.health == 0){
            System.out.println("Winner of this match: " + b2.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(b1.name + " Staying power(health) \t:" + b1.health);
        System.out.println(b2.name + " Staying power(health) \t:" + b2.health);
    }
}
