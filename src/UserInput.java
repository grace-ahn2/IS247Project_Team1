import java.util.Scanner;

public class UserInput {
    Scanner input = new Scanner(System.in);

    int menuOption;
    int user_age;
    char user_gender;
    double user_height;
    double user_weight;
    double user_goal_weight;


    public UserInfo CollectUserInput() {
        System.out.print("What is your age? ");
        user_age = input.nextInt();
        input.nextLine();

        System.out.print("What is your gender (M/F)? ");
        user_gender = input.nextLine().charAt(0);

        System.out.print("What is your height (in)? ");
        user_height = input.nextDouble();

        System.out.print("What is your weight (lbs)? ");
        user_weight = input.nextDouble();

        System.out.print("What is your goal weight? ");
        user_goal_weight = input.nextDouble();input.nextLine();

        return new UserInfo(user_age, user_gender, user_height, user_weight, user_goal_weight);

    }
}