package Game;

import java.util.Scanner;

public class NumberGuessing {
    private int randomNumber;
    private boolean win;
    private int max;

    public NumberGuessing(Scanner scan) {

        System.out.println("Choose a maximum number:");

        this.max = Integer.parseInt(scan.nextLine());
        this.randomNumber = (int) ((Math.random() * (max)) + 0);

        win = false;
    }

    public void playGame(Scanner scan) {
        System.out.println("Let's play! Choose a number between 0 and " + max);

        while(!win) {
            int guess = Integer.parseInt(scan.nextLine());

            if(guess == randomNumber) {
                win = true;
                System.out.println("You win the game! gg");
            } else {
                if(guess > randomNumber) {
                    System.out.println("You guessed too high!");
                }

                if(guess < randomNumber) {
                    System.out.println("You guessed too low!");
                }
            }
        }


    }
}
