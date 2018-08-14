import hangmangame.hangmangame;


public class playhangman {

    public static void main(String[] args) {
        hangmangame game = new hangmangame("PROGRAM");
        game.printRules();
        game.playGame();
        game.gameFinished();

    }
}
