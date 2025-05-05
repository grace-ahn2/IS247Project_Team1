import java.util.Date;

public class WorkoutHistory {
    private String workoutDefined;
    private String workoutCategory;
    private int timeSpent; // in minutes
    private Date workoutDate;

    // Constructor
    public WorkoutHistory(String workoutDefined, String workoutCategory, int timeSpent) {
        this.workoutDefined = workoutDefined;
        this.workoutCategory = workoutCategory;
        this.timeSpent = timeSpent;
        this.workoutDate = new Date(); // sets to current date
    }

    // Getters using `this` keyword
    public String getWorkoutType() {
        return this.workoutDefined;
    }

    public String getWorkoutCategory() {
        return this.workoutCategory;
    }

    public int getTimeSpent() {
        return this.timeSpent;
    }

    public Date getWorkoutDate() {
        return this.workoutDate;
    }

    // Optional toString for debugging
    @Override
    public String toString() {
        return "Workout: " + workoutDefined + " | Category: " + workoutCategory +
                " | Time: " + timeSpent + " mins | Date: " + workoutDate;
    }
}

