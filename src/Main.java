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


        

        System.out.print("What is your age? ");
        user_age = input.nextInt();
        System.out.print("What is your gender (M/F)? ");
        user_gender = input.next().charAt(0);
        System.out.print("What is your height (in)? ");
        user_height = input.nextDouble();
        System.out.print("What is your weight (lbs)? ");
        user_weight = input.nextDouble();

        while (menuOption) {
            System.out.println("\n=== MuscleMind Tracker ===");
            System.out.println("1. Record Workout");
            System.out.println("2. Track Progress");
            System.out.println("3. Schedule Workout");
            System.out.println("4. Suggested Workouts");
            System.out.println("5. Manage User Profile");
            // Placeholder: menu logic would go here
            menuOption = false; // prevent infinite loop for now
        }

        input.close();
    }
}
