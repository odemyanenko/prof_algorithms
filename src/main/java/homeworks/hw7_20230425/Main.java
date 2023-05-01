package homeworks.hw7_20230425;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    int[] numbers1 = {1, 2, 3};

    System.out.println(Arrays.toString(numbers1));
    numbers1 = getModifiedArray2(numbers1);
    System.out.println(Arrays.toString(numbers1));

    int[] numbers2 = {4, 3, 2, 1};
    System.out.println(Arrays.toString(numbers2));
    numbers2 = getModifiedArray2(numbers2);
    System.out.println(Arrays.toString(numbers2));

    int[] numbers3 = {9};
    System.out.println(Arrays.toString(numbers3));
    numbers3 = getModifiedArray2(numbers3);
    System.out.println(Arrays.toString(numbers3));
  }

  public static int[] getModifiedArray(int[] array) {
    int number = 0;
    int level = 0;

    for (int i = array.length - 1; i >= 0; i--) {
      number += array[i] * Math.pow(10, level++);
    }

    return Integer.toString(number + 1)
            .chars()
            .map(c -> c - '0')
            .toArray();
  }

  public static int[] getModifiedArray2(int[] array) {
    int number = Integer.parseInt(IntStream
            .of(array)
            .boxed()
            .map(String::valueOf)
            .collect(Collectors.joining()));

    return Integer.toString(number + 1)
            .chars()
            .map(c -> c - '0')
            .toArray();
  }

}
