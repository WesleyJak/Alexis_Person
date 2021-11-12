package Methods;

import Functions.AddNumbers;
import Game.NumberGuessing;

import java.util.Scanner;

public class Menu {

    public Menu(Scanner scan) {

        boolean programIn = true;

        while(programIn) {
            System.out.println("What would you like to do?\n" +
                    "Enter 1 to play a number guessing game\n" +
                    "Enter 2 to play a kitchen game\n" +
                    "Enter 3 to add some numbers together!\n" +
                    "Enter 4 to play a restaurant game\n" +
                    "Enter 0 to quit.");

            int choice = Integer.parseInt(scan.nextLine());
            System.out.println("You chose " + choice);

            switch (choice) {
                case 1:
                    NumberGuessing game = new NumberGuessing(scan);
                    game.playGame(scan);
                    break;

                case 2:
                    System.out.println("We don't have a kitchen game yet!");
                    break;

                case 3:
                    AddNumbers numbers = new AddNumbers(scan);
                    numbers.add(scan);
                    break;

                case 4:
                    System.out.println("We dont have a restaurant game yet!");
                    break;

                case 0:
                    System.out.println("Exiting, goodbye!");
                    programIn = false;
                    break;

                default:
                    System.out.println("You need to choose something on the menu!");
                    break;

            }
        }

    }
}
