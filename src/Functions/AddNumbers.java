package Functions;

import java.util.Scanner;

public class AddNumbers {
    private int numInts;

    public AddNumbers(Scanner scan) {
        System.out.println("How many numbers would you like to add together?");
        this.numInts = Integer.parseInt(scan.nextLine());

    }

    public void add(Scanner scan) {
        int sum = 0;
        for(int i = 0; i < numInts; i++) {

            System.out.print("Number: ");
            int addedNum = Integer.parseInt(scan.nextLine());
            sum += addedNum;
            if(addedNum == 0) {
                System.out.println("We had fun! Your total sum was " + sum + ". Goodbye!");
                return;
            }
            System.out.println("the sum so far is " + sum + ". Enter 0 to quit.");


        }

        System.out.println("That was all the numbers! your total sum was " + sum + ". Goodbye!");
    }
}
