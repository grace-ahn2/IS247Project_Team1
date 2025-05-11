// WorkoutHistory.java
import java.util.Date;

public class WorkoutHistory {
    private String workoutDefined;
    private String workoutCategory;
    private int timeSpent;
    private Date workoutDate;

    public WorkoutHistory(String workoutDefined, String workoutCategory, int timeSpent) {
        this.workoutDefined = workoutDefined;
        this.workoutCategory = workoutCategory;
        this.timeSpent = timeSpent;
        this.workoutDate = new Date();
    }

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

    @Override
    public String toString() {
        return "Workout: " + workoutDefined + " | Category: " + workoutCategory +
                " | Time: " + timeSpent + " mins | Date: " + workoutDate;
    }
}
