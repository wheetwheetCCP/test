import java.util.Random;
import java.util.Scanner;

/**
 * @author Crystal Panter
 */
class IFElseActivities {
    /**
     * Just uncomment whichever activity you'd like to run, or C&P to your own file
     * @param args
     */
    public static void main(String[] args) {
//       dogSaysCatSays();
//       guessingGame();
       grade();
    }

    /**
     * Ask the user to enter 'dog' or 'cat'; program prints animal's sound
     */
    private static void dogSaysCatSays() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose cat or dog: ");
        String userAnswer = scanner.next();

        if(userAnswer.toLowerCase().equals("cat")){
            System.out.println("Meow!!");
        }
        else if(userAnswer.toLowerCase().equals("dog")){
            System.out.println("BARK!");
        }
        else{
            System.out.println("Generic animal sound here.");
        }
    }

    /**
     * User provides a number between 1-10. If the number stored in the program is the same, "WOW!", else "Nope!"
     */
    private static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10);
        System.out.println("Enter a nuber 1-10: ");
        int userAnswer = scanner.nextInt();

        if(userAnswer == randomNumber){
            System.out.println("WOW!");
        }
        else{
            System.out.println("Nope!");
        }
    }

    /**
     * Ask the user for their number grade. If the grade is at least 60, tell them they passed. If it's lower than 60, tell them they have to take the class again
     */
    private static void grade() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your grade? ");
        int userAnswer = scanner.nextInt();

        if(userAnswer >= 60){
            System.out.println("You passed!");
        }
        else{
            System.out.println("Unfortunately you need to take the class again");
        }
    }

}