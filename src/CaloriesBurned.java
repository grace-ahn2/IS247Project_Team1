public class CaloriesBurned extends WorkoutHistory {
    private double userWeight; // in pounds

    // Constructor using super
    public CaloriesBurned(String workoutDefined, String workoutCategory, int timeSpent, double userWeight) {
        super(workoutDefined, workoutCategory, timeSpent);
        this.userWeight = userWeight;
    }

    // Override caloriesBurned method
    public int caloriesBurned() {
        int caloriesPerHour = Workout.workoutCategory.getOrDefault(getWorkoutCategory(), 0);
        double caloriesPerMinute = caloriesPerHour / 60.0;

        // Multiplies by user weight factor (optional): for simplicity, we’ll scale it a bit
        double weightFactor = userWeight / 150.0; // 150lbs is baseline
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
