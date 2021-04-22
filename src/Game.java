public class Game {

    public static void main (String args[]) {

        //create an instance of Engine so we can use the methods
        Engine round1 = new Engine();
        round1.intro();

        //create instances of players
        Player player1 = new Player();
        Player player2 = new Player();

        //set names
        System.out.println("\nPlease, insert the name of the first Player");
        player1.setName();

        System.out.println(player1.getName() + "?? What a wonderful name! \n Now introduce the second name\n");
        player2.setName();

        System.out.println("Marvelous \n LET'S START THE GAME\n");

        //attribute tools to players and run game
        round1.runGame(player1.getName(), player2.getName());

    }
}