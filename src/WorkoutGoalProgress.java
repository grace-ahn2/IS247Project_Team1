// WorkoutGoalProgress.java
import java.util.Date;

public class WorkoutGoalProgress extends WorkoutHistory {
    private int progressPercentage;
    private static int totalWorkouts = 0;

    public WorkoutGoalProgress(Date workoutDate, int progressPercentage) {
        super("ProgressWorkout", "General", 30);
        this.progressPercentage = progressPercentage;
        totalWorkouts++;
    }

    public static int getTotalWorkouts() {
        return totalWorkouts;
    }

    public void displayProgress() {
        System.out.println(toString());
        System.out.println("Progress: " + progressPercentage + "%");
    }
}
