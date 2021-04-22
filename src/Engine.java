import java.sql.SQLOutput;
import java.util.Scanner;

public class Engine {

    int pointsPlayer1 = 0;
    int N1 = 0;

    int pointsPlayer2 = 0;
    int N2 = 0;

    //creating an array with the enum... uffa... that one was hard.
    GameTools arr[] = GameTools.values();

    public int Randomizer(){
        return (int)(Math.random() * 3);
    }

    public void intro() {

        System.out.println("*** Welcome to Rock, Paper and Scissors ***");
        System.out.println("Are you the lucky one? Let us see...");

    }

    public void runGame(String player1, String player2) {

        while ((pointsPlayer1 != 2) && (pointsPlayer2 != 2)) {

            N1 = Randomizer();
            System.out.println(player1 + " choose: " + arr[N1]);

            N2 = Randomizer();
            System.out.println(player2 + " choose: " + arr[N2]);

            if ((N1 == 0 && N2 == 0) || (N1 == 1 && N2 == 1) || (N1 == 2 && N2 == 2)) {
                System.out.println("We have a tie\n");
            }
            else if ((N1 == 0 && N2 == 2) || (N1 == 1 && N2 == 0) || (N1 == 2 && N2 == 1)){
                ++pointsPlayer1;
                System.out.println(pointsPlayer1 +": Looks like " + player1 + " is winning\n");
            }
            else {
                ++pointsPlayer2;
                System.out.println(pointsPlayer2 + ": Looks like " + player2 + " is winning\n");
            }
        }

        System.out.println("Best of 3!");
        if (pointsPlayer1 == 2){
            System.out.print(player1);
        }
        else {
            System.out.print(player2);
        }
        System.out.print(" won!");
    }
}