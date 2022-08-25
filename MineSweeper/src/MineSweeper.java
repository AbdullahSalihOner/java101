import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineCount;

    String[][] gameMap = new String[row][col];
    String[][] gameBoard = new String[row][col];

    int rowSelect;
    int colSelect;
    int mineCounter ;

    MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.mineCount =(col * row) / 4 ;
        this.gameMap = new String[row][col];
        this.gameBoard = new String[row][col];

    }


    // we randomly select mine position and create all map
    public  void  createMap(){
        // randomly select mine position
        for (int i  =0 ; i<mineCount; i++){
            while (true){

                int r = (int)(Math.random() * row);
                int c = (int)(Math.random() * col);

                if (gameMap[r][c] != "*"){
                    gameMap[r][c] = "*" ;
                }
                break;
            }
        }
        System.out.println("==============================");
        // then fill the other positions and write the map
        for (int i = 0; i < gameMap.length ; i++){
            // we write  "gameMap[0]" in here because  we want see which row's column we are
            for (int j = 0; j < gameMap[0].length ; j++){
                if (gameMap[i][j] != "*") {
                    gameMap[i][j] = "-";
                }
                System.out.print( gameMap[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("==============================");
    }

// ************
// *************************************
    public void playerSelection(){
            Scanner scn = new Scanner(System.in);
            System.out.print("Select your row  : ");
            rowSelect = (scn.nextInt() - 1);
            System.out.print("Select your column  : ");
            colSelect = (scn.nextInt() - 1);
    }

    //We get the answers of gamer
    public void getAnswers(){
        playerSelection();
        boolean isTrue = false;
        while (!isTrue){
            if (rowSelect<0 || rowSelect > gameBoard.length - 1 || colSelect <0 || colSelect > gameBoard[0].length - 1){
                System.out.println("Wrong entrance, Try again");
                playerSelection();
            }else{
                isTrue =true;
            }
        }
    }

    /////************************************************************************************

    // We create  inVisible game board
    public void inVisibleGameBoard(){
        for (int i = 0 ;i <gameBoard.length ; i++){
            for (int j = 0 ; j < gameBoard[i].length ; j++){
                gameBoard[i][j] = "-";
            }
        }
    }

    public void printInVisibleGameBoard(){
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }





    public void mineDetector() {
        mineCounter = 0;
        if (colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect][colSelect + 1] == "*")
                mineCounter++;
        }

        if (colSelect - 1 >= 0) {
            if (gameMap[rowSelect][colSelect - 1] == "*")
                mineCounter++;
        }

        if (rowSelect + 1 < gameMap.length ) {
            if (gameMap[rowSelect + 1][colSelect] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 0) {
            if (gameMap[rowSelect - 1][colSelect] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 1 && colSelect - 1 >= 1) {
            if (gameMap[rowSelect - 1][colSelect - 1] == "*")
                mineCounter++;
        }

        if (rowSelect - 1 >= 0 && colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect - 1][colSelect + 1] == "*")
                mineCounter++;
        }

        if (rowSelect + 1 < gameMap.length  && colSelect - 1 >= 1) {
            if (gameMap[rowSelect + 1][colSelect - 1] == "*")
                mineCounter++;
        }
        if (rowSelect + 1 < gameMap.length  && colSelect + 1 < gameMap[0].length ) {
            if (gameMap[rowSelect + 1][colSelect + 1] == "*")
                mineCounter++;
        }


        for (int i = 0 ; i <= mineCounter ; i++){
            gameBoard[rowSelect][colSelect] = ""+i;
            gameMap[rowSelect][colSelect] = ""+i;
        }

    }





    boolean checkContinue() {
        for (int i = 0; i < gameMap.length; i++) {
            for (int j = 0; j < gameMap[0].length; j++) {
                if (gameMap[i][j] == "-")
                    return false;
            }
        }
        return true;
    }


    public void run(){
        System.out.println("WELCOME TO THE GAME");
        createMap();
        inVisibleGameBoard();
        printInVisibleGameBoard();


        while (true){

            this.getAnswers();

            if (gameMap[rowSelect][colSelect] == "*"){
                System.out.println("Game Over !!!");
                break;

            }else{
                mineDetector();
                printInVisibleGameBoard();
                if ((checkContinue())) {
                    System.out.println("Congratulations... WIN GAME !");
                    break;
                }
            }
        }
    }




   /* Oyun Kuralları :
    Oyun metin tabanlıdır.
    Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
    Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
    Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
    Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
    Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
    Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
    Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
    Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.*/
}
