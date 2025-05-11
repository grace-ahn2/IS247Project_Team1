// WorkoutGoalConfirmation.java
import java.util.*;

public class WorkoutGoalConfirmation {
    private int calorieGoal;
    private ArrayList<CaloriesBurned> workouts = new ArrayList<>();
    private Stack<CaloriesBurned> undoStack = new Stack<>();

    public void setCalorieGoal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your calorie burn goal: ");
        calorieGoal = input.nextInt();
    }

    public void addWorkout(CaloriesBurned workout) {
        workouts.add(workout);
        undoStack.push(workout);
    }

    public boolean undoLastWorkout() {
        if (!undoStack.isEmpty()) {
            CaloriesBurned removed = undoStack.pop();
            workouts.remove(removed);
            System.out.println("Last workout undone: " + removed);
            return true;
        } else {
            System.out.println("No workouts to undo.");
            return false;
        }
    }

    public int getCalories() {
        int total = 0;
        for (CaloriesBurned cb : workouts) {
            total += cb.caloriesBurned();
        }
        return total;
    }

    public int getCalories(Date day) {
        int total = 0;
        for (CaloriesBurned cb : workouts) {
            if (isSameDay(cb.getWorkoutDate(), day)) {
                total += cb.caloriesBurned();
            }
        }
        return total;
    }

    public int getCaloriesWeek(int weekOffset) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_YEAR, -weekOffset);
        int targetWeek = cal.get(Calendar.WEEK_OF_YEAR);
        int targetYear = cal.get(Calendar.YEAR);

        int total = 0;
        for (CaloriesBurned cb : workouts) {
            Calendar wCal = Calendar.getInstance();
            wCal.setTime(cb.getWorkoutDate());
            if (wCal.get(Calendar.WEEK_OF_YEAR) == targetWeek && wCal.get(Calendar.YEAR) == targetYear) {
                total += cb.caloriesBurned();
            }
        }
        return total;
    }

    public int getCaloriesMonth(int monthOffset) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -monthOffset);
        int targetMonth = cal.get(Calendar.MONTH);
        int targetYear = cal.get(Calendar.YEAR);

        int total = 0;
        for (CaloriesBurned cb : workouts) {
            Calendar wCal = Calendar.getInstance();
            wCal.setTime(cb.getWorkoutDate());
            if (wCal.get(Calendar.MONTH) == targetMonth && wCal.get(Calendar.YEAR) == targetYear) {
                total += cb.caloriesBurned();
            }
        }
        return total;
    }

    public int getCaloriesRecursive() {
        return sumCaloriesRecursive(workouts.size() - 1);
    }

    private int sumCaloriesRecursive(int index) {
        if (index < 0) return 0;
        return workouts.get(index).caloriesBurned() + sumCaloriesRecursive(index - 1);
    }

    public void confirmGoal() {
        int totalBurned = getCalories();
        System.out.println("You burned a total of " + totalBurned + " calories.");
        if (totalBurned >= calorieGoal) {
            System.out.println("🎉 Congratulations! You met your goal.");
        } else {
            System.out.println("Keep going! You're " + (calorieGoal - totalBurned) + " calories away from your goal.");
        }
    }

    private boolean isSameDay(Date d1, Date d2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(d1);
        cal2.setTime(d2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
               cal1.get(Calendar.DAY_OF_YEAR) == cal2.get(Calendar.DAY_OF_YEAR);
    }
}
