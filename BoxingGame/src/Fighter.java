public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double blockAbility;

    public Fighter(String name , int damage, int health, int weight, double blockAbility){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.blockAbility = blockAbility;

    }

    public  int hit(Fighter ali){

        System.out.println("-------------------------------------------");
        System.out.println(this.name + " = > " + ali.name + this.damage + " hit. ");

        if (ali.blockAbility()){
            System.out.println(ali.name + " blocked the hit.");
            return ali.health;
        }

        if (ali.health - this.damage < 0){
            return  0;
        }

        return ali.health - this.damage;
    }


    public  boolean blockAbility(){
        double randomValue = Math.random() * 100;
        return  randomValue <= this.blockAbility;
    }


}
