import java.util.Scanner;

/**
 * This is the main class for the MuscleMind fitness tracker.
 * It starts the program, gets some basic info from the user,
 * and shows a simple menu (more features can be added later!).
 * 
 * Think of this as the app's front door — it's where everything begins.
 * 
 * @author Shiv
 * @version 1.0
 */
public class Main {

    /**
     * Starts the app and collects user info like age, gender, height, and weight.
     * After that, it displays the main menu. Right now the menu options aren't active,
     * but they're here as placeholders for future features!
     * 
     * @param args Not used, but required for Java main method
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MuscleMind!");
        System.out.println("Before we begin tracking your progress..\n");

        UserInput user = new UserInput();
        user.CollectUserInput();

        System.out.println("Created a new user profile for you!");

        int menuOption = 1;

        while (menuOption != 6) {
            System.out.println("\n=== MuscleMind Tracker ===");
            System.out.println("1. Record Workout");
            System.out.println("2. Track Progress");
            System.out.println("3. Schedule Workout");
            System.out.println("4. Suggested Workouts");
            System.out.println("5. Manage User Profile");
            System.out.println("6. Exit program");
            System.out.println("What would you like to do?");

            try{
                String userChoice = input.nextLine();
                menuOption = Integer.parseInt(userChoice);
                
                switch (menuOption) {
                    case 1:
                        System.out.println("recording workout...");
                        break;
                    case 2:
                        System.out.println("tracking progress...");
                        break;
                    case 3:
                        System.out.println("scheduling workout...");
                        break;
                    case 4:
                        System.out.println("suggetsing workout...");
                        break;
                    case 5:
                        System.out.println("managing user profile...");
                        break;
                    case 6:
                        System.out.println("Thanks for using MuscleMind!");
                        break;
                    default:
                        System.out.println("Invalid input.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number 1-6.");
            }
        }
        
        input.close();
    }
}
