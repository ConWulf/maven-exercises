import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {

        System.out.println("enter something:");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.printf("you entered: %s\n", userInput);
        if (StringUtils.isBlank(userInput))
            System.out.println("you did not enter anything");
        else if (StringUtils.isNumeric(userInput))
            System.out.printf("%s is a number\n", userInput);
        else
            System.out.printf("%s is not a number\n", userInput);

        System.out.printf("flipped case: %s\n", StringUtils.swapCase(userInput));
        System.out.printf("reversed: %s\n", StringUtils.reverse(userInput));


    }

}
