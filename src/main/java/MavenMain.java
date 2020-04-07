import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenMain {
    public static void main(String[] args) {
        System.out.print("\nPlease enter something: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("\n%s is numeric data.\n\n", userInput);
        } else {
            System.out.printf("\n%s is non-numeric data.\n\n", userInput);
        }

        String flippedCase = StringUtils.swapCase(userInput);
        System.out.printf("Here is your input with flipped case.\n%s\n\n", flippedCase);

        String reversed = StringUtils.reverse(userInput);
        System.out.printf("Here is your input with reversed case.\n%s\n\n", reversed);

    }
}
