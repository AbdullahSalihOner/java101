public class Game {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Game(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight =maxWeight;
        this.minWeight = minWeight;
    }

    public  void fight(){

        if (checkWeigh()){
            int n = 1 ;
            while (f1.health > 0 && f2.health > 0){
                System.out.println("================ " + n + ". ROUND ==================");


                if (whoStart()){
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                }else {
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                }

                printScore();

                n++;
            }
        }else {
            System.out.println("The weights of the athletes do not match.");
        }


    }

    public boolean checkWeigh(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }


    public boolean isWin(){
        if (f1.health==0){
            System.out.println("Winner is \t: " + f2.name);
            return true;
        }else if (f2.health == 0){
            System.out.println("Winner is \t: " + f1.name);
            return true;
        }
        return false;
    }


    public void printScore(){
        System.out.println("--------------------------");
        System.out.println(f1.name + " Health  \t:" +f1.health);
        System.out.println(f2.name + " Health  \t:" +f2.health);
        System.out.println("\n");
    }

    public  boolean whoStart(){
        double randomValue = Math.random() * 100;
        if (randomValue<=50){
            return true;
        }else {
            return false;
        }
    }
}
