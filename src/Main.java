// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MuscleMind!");
        System.out.println("Before we begin tracking your progress..\n");

        UserInput userInput = new UserInput();
        UserInfo userInfo = userInput.CollectUserInput();

        WorkoutGoalConfirmation goalTracker = new WorkoutGoalConfirmation();
        goalTracker.setCalorieGoal();

        boolean recording = true;
        while (recording) {
            System.out.println("\nWould you like to record a workout? (yes/no)");
            String answer = input.nextLine().trim().toLowerCase();
            if (answer.equals("no")) {
                recording = false;
                break;
            }

            System.out.print("Enter workout name: ");
            String name = input.nextLine();

            System.out.print("Enter workout category (Cardio, Muscle Strength, Flexibility): ");
            String category = input.nextLine();

            System.out.print("Enter time spent (minutes): ");
            int timeSpent = Integer.parseInt(input.nextLine());

            CaloriesBurned workout = new CaloriesBurned(name, category, timeSpent, userInfo.getWeight());
            goalTracker.addWorkout(workout);

            System.out.println("Workout recorded: " + workout);

            System.out.println("Would you like to undo the last workout? (yes/no)");
            if (input.nextLine().trim().equalsIgnoreCase("yes")) {
                goalTracker.undoLastWorkout();
            }
        }

        System.out.println("\n--- Workout Summary ---");
        goalTracker.confirmGoal();
        input.close();
    }
}
