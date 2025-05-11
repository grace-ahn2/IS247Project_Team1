// Workout.java
import java.util.Map;
import java.util.HashMap;

public interface Workout<T> {

    Map<String, Integer> workoutCategory = new HashMap<>() {{
        put("Cardio", 500);
        put("Muscle Strength", 400);
        put("Flexibility", 200);
    }};

    void addWorkout(T workout);
    int caloriesBurned(String category, int timeSpent);
    java.util.ArrayList<T> getAllWorkouts();
}
