package homeworks.hw1_20230307;

import java.util.Scanner;

public class UserInterface {

  public static int getNumber(String message) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(message);

    return scanner.nextInt();
  }
}
