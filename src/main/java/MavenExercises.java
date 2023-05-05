
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class MavenExercises {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some input: ");
        String userInput = scanner.nextLine();

        //check if the the user entered a number

        System.out.println("You enter" + userInput);
        if (StringUtils.isNumeric(userInput)){
            System.out.println("This is a number");


        }

        else {

            System.out.println("This is not a number");

        }

        // flip the case of the string

        System.out.println("Flipped Case" + StringUtils.swapCase(userInput));


        // reverse the string

        System.out.println("Reverse" + StringUtils.reverse(userInput));





    }

}
