package Friend;

import Game.NumberGuessing;
import Methods.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        askName(scan);
//        askBooks(scan);
//        askColor(scan);

        new Menu(scan);

    }


    public static void askName(Scanner scan) {
        System.out.println("Hello, my name is FRIEND. What is your name?");
        String in = scan.nextLine();
        System.out.println("Hi " + in + "!");
    }

    public static void askBooks(Scanner scan) {
        System.out.println("What kind of books do you like to read?");
        String booksGenre = scan.nextLine();
        System.out.println("Cool! I love " + booksGenre + " too!");
    }

    public static void askColor(Scanner scan) {
        System.out.println("What is your favorite color?");
        String color = scan.nextLine();
        System.out.println(color + " is a pretty color!");
    }
}
