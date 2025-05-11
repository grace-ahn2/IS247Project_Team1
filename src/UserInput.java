// UserInput.java
import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);

    public UserInfo CollectUserInput() {
        System.out.print("What is your age? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your gender (M/F)? ");
        char gender = input.nextLine().charAt(0);

        System.out.print("What is your height (in)? ");
        double height = input.nextDouble();

        System.out.print("What is your weight (lbs)? ");
        double weight = input.nextDouble();

        System.out.print("What is your goal weight? ");
        double goal_weight = input.nextDouble();
        input.nextLine();

        return new UserInfo(age, gender, height, weight, goal_weight);
    }
}

