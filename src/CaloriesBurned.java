// CaloriesBurned.java
public class CaloriesBurned extends WorkoutHistory {
    private double userWeight;

    public CaloriesBurned(String workoutDefined, String workoutCategory, int timeSpent, double userWeight) {
        super(workoutDefined, workoutCategory, timeSpent);
        this.userWeight = userWeight;
    }

    public int caloriesBurned() {
        int caloriesPerHour = Workout.workoutCategory.getOrDefault(getWorkoutCategory(), 0);
        double caloriesPerMinute = caloriesPerHour / 60.0;
        double weightFactor = userWeight / 150.0;
        return (int)(getTimeSpent() * caloriesPerMinute * weightFactor);
    }

    public double getUserWeight() {
        return this.userWeight;
    }

    @Override
    public String toString() {
        return super.toString() + " | Calories Burned: " + caloriesBurned();
    }
}
