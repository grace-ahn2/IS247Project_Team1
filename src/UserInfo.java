/**
 * This class stores all the basic info about the user,
 * like their height, weight, goal, age, and gender.
 * 
 * It’s kind of like a profile that other parts of the app
 * can use to personalize workouts or track progress.
 * 
 * All the fields are private, so we use getters and setters
 * to access and update them safely.
 * 
 * @author Shiv
 * @version 1.0
 */
public class UserInfo {
    private int age;
    private char gender;
    private double height;
    private double weight;
    private double goal_weight;
    

    /**
     * Default constructor for creating a blank user profile.
     */
    public UserInfo() {}

    public UserInfo(int age, char gender, double height, double weight, double goal_weight) {
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goal_weight = goal_weight;

    }

    /**
     * Gets the user’s age.
     * @return age in years
     */
    public int getAge() {
        return age;
    }


    /**
     * Gets the user’s gender.
     * @return gender (usually 'M' or 'F')
     */
    public char getGender() {
        return gender;
    }

    /**
     * Gets the user’s current height.
     * @return height in inches
     */
    public double getHeight() {
        return height;
    }


    /**
     * Gets the user’s current weight.
     * @return weight in pounds
     */
    public double getWeight() {
        return weight;
    }


    /**
     * Gets the user’s target or goal weight.
     * @return goal weight in pounds
     */
    public double getGoal_weight() {
        return goal_weight;
    }
}
