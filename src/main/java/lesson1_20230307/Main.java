package lesson1_20230307;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //start
    //Number input: a,b,c
    //declare sum
    //sum = a+b+c
    //print sum
    //end
    System.out.println("Enter a...");
    int a = scanner.nextInt();
    System.out.println("Enter b...");
    int b = scanner.nextInt();
    System.out.println("Enter c...");
    int c = scanner.nextInt();
    System.out.println(sumThreeNumbers(a,b,c));

    String[] names = {"Alex", "Thea", "Thomas", "Sergey", "Azriel"};
    String[] copyNames = copyArray(names);//-->O(n)

    //=====================================
    //Formula NOD(a,b)
    System.out.println(gcd(48, 8));
  }

  private static int gcd(int a, int b){
    if (a > b) {
      int t1 = a/b;
      int t2 = b / (a % b);
    }
    return 0;
  }
  private static String[] copyArray(String[] names){
    String[] array = new String[names.length];
    for (int i = 0; i < names.length; i++) {
      array[i] = names[i];
    }
    return array;
  }
  private static int sumThreeNumbers(int a, int b, int c) {
    return a + b + c;
  }

}