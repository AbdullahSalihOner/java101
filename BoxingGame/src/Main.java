public class Main {
    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc" , 20 , 100, 90, 20);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 40);
        Game r = new Game(marc,alex , 90 , 100);
        r.fight();
    }

}
