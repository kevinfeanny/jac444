import hangmangame.hangmangame;

import java.lang.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class playhangman {

    static String[] x = {"Cheese", "fly", "house"};

    public static void main(String[] args) {
       do{
        int choi = menu();
        if(choi == 2) {
            int i = 0;
            ArrayList<String> words = new ArrayList<>();
            File textFile = new File("hangman.txt");
            if (!textFile.exists()) {
                System.out.println(textFile.getAbsolutePath());
                System.out.println(textFile + " does not exist.");
                System.exit(1);
            }
            try {
                Scanner input = new Scanner(textFile);
                while (input.hasNext()) {
                    words.add(input.next().toUpperCase());
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

            System.out.println(words.get(2));

            hangmangame game = new hangmangame(words.get((int) (Math.random() * 20)));
            game.printRules();
            game.playGame();
            game.gameFinished();
            do {
                i++;
                System.out.print(i);
                System.out.println("Do you wish to play again");
                Scanner d = new Scanner(System.in);
                try {
                    String choice = d.next().toUpperCase();
                    if (choice.charAt(0) == 'Y') {
                        hangmangame game2 = new hangmangame(words.get((int) (Math.random() * 20)));
                        game2.printRules();
                        game2.playGame();
                        game2.gameFinished();
                    } else if (choice.charAt(0) == 'N') {
                        break;
                    } else {
                        System.out.println("Please choose Y or N");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input");
                }
            }

            while (true);

        }else if(choi == 1){
            hangmangame game = new hangmangame(x[(int) (Math.random() * 3)].toUpperCase());
            game.printRules();
            game.playGame();
            game.gameFinished();

        }}while(true);
    }
    public static int menu(){
        int x = 0;
        System.out.println("Hangman game");
        System.out.println("Press 1 to run game with randomly generated word");
        System.out.println("Press 2 to run game with reading a word from a text  file");
        System.out.println("Enter choice");
        try {
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
        }catch (Exception e){
            System.out.println("please enter either 1 or 2");
        }

        return x;
    }
}

