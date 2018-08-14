package hangmangame;

import java.util.Scanner;



public class hangmangame {
            String word;
             int maxGuesses ;
            int score;
            char[] scores;
            int guesses;
            static  Scanner scanner;
           public  hangmangame(){
                word = "";
                maxGuesses = 0;
                score = 0;
                guesses = 0;
               scanner = new Scanner(System.in);



            }
    public hangmangame(String w){
               this();
               this.word = w;
               scores = new char[word.length()];
               maxGuesses = 10;



    }

    public  void printRules() {

        System.out.println("Welcome to Hangman! These are the rules:\n" +
                "You have 10 guesses to guess the word.\n" +
                "The word is " + this.word.length() + " characters long.\n" +
                "Get " + this.word.length() + " points before you run out of turns to win!\n" +
                "Don't guess the same word twice!\n\n");
    }
    public  void playGame() {
        // int scores[] = new int[word.length()];
        for(int g = 0; g < word.length(); g ++){
            scores[g] = '0';
        }


        for (int i = 0; i < maxGuesses; i++) {

            makeLine();
            System.out.print("(Guess) Enter a letter in word ");
            for(int j = 0; j < word.length(); j ++){
                if(scores[j] == '0' ){
                    System.out.print("*");
                }else if(scores[j] != '0' ){
                    System.out.print(word.charAt(j));
                }



            }
            char letter;
            do{
            letter = getInput();}while(letter == '0');
            System.out.println("You guessed: " + letter + "\n");

            scores = checkIfLetterCorrect(letter, scores);

            // Stop the game if the player wins
            int kool = 0;
            for(int x = 0; x < word.length();x++){
                if(scores[x] != '0'){
                    kool++;
                }
            }
            if (kool == word.length()) {
                break;
            }

            guesses++;

            System.out.println("Number of guesses: " + guesses +
                    "\nScore: " + score + "\n");
        }

    }
    public  char[] checkIfLetterCorrect(char letter, char[] scores) {
                int f = 0;
        for (int i = 0; i < word.length(); i++) {

            // Check every letter to see if it matches. Helps with revealing.
           if(scores[i] == letter) {

               if(f == 0){
               System.out.println("Tis word already has " + scores[i]);
              }
               f++;
           }else if (word.charAt(i) == letter ) {
                   score++;
                   scores[i] = word.charAt(i);
                   f = 0;
               }
           }



       return scores;
    }
    public static char getInput() {

               char x;
            try {
                String input = scanner.nextLine().toUpperCase();

                // Kan også skrives som
                // String input = scanner.nextLine();
                // input = input.toUpperCase();
                x= input.charAt(0);
            }catch(Exception e){
                System.out.println("Invalid input");
                x = '0';
            }

            return x;

    }
    public static void makeLine() {
        System.out.println("-----------------------------------------\n");
    }
    public  void gameFinished() {
               int kool = 0;
        for(int i = 0; i < scores.length;i ++){
            kool++;
        }
        if (kool == score) {

            System.out.println("Congratulations! You win!");

        } else {

            System.out.println("Ahh, too bad! Better luck next time!");

        }

        System.out.println("The word was: " + this.word + "\nThank you for playing!");
    }

}
