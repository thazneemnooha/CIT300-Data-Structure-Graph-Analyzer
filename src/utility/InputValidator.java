package utility;

import java.util.Scanner;

public class InputValidator {

private static final Scanner scanner =
new Scanner(System.in);

public static int getValidInt() {

while (true) {

try {

return Integer.parseInt(
scanner.nextLine());

} catch (Exception e) {

System.out.println(
"Invalid input. Enter a number.");
}
}
}

public static String getValidString() {

return scanner.nextLine().trim();
}
}
