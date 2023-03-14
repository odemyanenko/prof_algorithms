package homeworks.hw1_20230307;

/*
Описание задания.
1. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

2. Find the element that appears once in a sorted array
Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
*/

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    System.out.println("Task 1.");
    int inputNumber = UserInterface.getNumber("Enter Number for Check Polindrome, please...");

    boolean isPalindrome = Palindrome.isPalindrome1(inputNumber);
    System.out.printf("Number (%d) is Polindrome = (%b) by StringBuild\n", inputNumber, isPalindrome);

    isPalindrome = Palindrome.isPalindrome2(inputNumber);
    System.out.printf("Number (%d) is Polindrome = (%b) by ToCharArray\n", inputNumber, isPalindrome);

    System.out.println("--------------------------------------");
    System.out.println("Task 2.");
    int[] sortArray = {1, 1, 2, 2, 3, 3, 5};

    int indexElement = ArrayUtil.getNumberOneAppears(sortArray);
    System.out.println(Arrays.toString(sortArray));
    if (indexElement == -1) {
      System.out.println("No Number found");
    } else {
      System.out.printf("Number found (%d) with index = %d\n", sortArray[indexElement], indexElement);
    }
  }
}

