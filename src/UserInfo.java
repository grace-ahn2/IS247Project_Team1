// UserInfo.java
public class UserInfo {
    private int age;
    private char gender;
    private double height;
    private double weight;
    private double goal_weight;

    public UserInfo() {}

    public UserInfo(int age, char gender, double height, double weight, double goal_weight) {
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goal_weight = goal_weight;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getGoal_weight() {
        return goal_weight;
    }
}
