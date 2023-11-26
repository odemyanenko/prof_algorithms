package interview_tasks.array_operations;
/*
Implement a method to find the maximum and minimum values in an array of integers without using any library functions.
*/
public class Task1_db {
  public static void main(String[] args){
    int[] array = new int[] {2, 45, 3, 67, 4, 64};
    System.out.println("max = " + getMax(array));
    System.out.println("min = " + getMin(array));
  }

  public static int getMax(int[] array){
    if (array.length == 0) {
      return -1;
    }
    int max = array[0];
    for (int i = 1; i < array.length; i++){
      if (max < array[i]) {
        max = array[i];
      }
    }
    return max;
  }
  public static int getMin(int[] array){
    if (array.length == 0) {
      return -1;
    }
    int min = array[0];
    for (int i = 1; i < array.length; i++){
      if (min > array[i]) {
        min = array[i];
      }
    }
    return min;
  }
}

/*
CHAT GPT

public class ArrayMinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 43, 23, 8, 67, 10, 36};

        int[] result = findMinMax(numbers);

        System.out.println("Minimum value: " + result[0]);
        System.out.println("Maximum value: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{0, 0}; // Return 0 for both min and max if the array is empty or null.
        }

        int min = arr[0];
        int max = arr[0];

        for (int number : arr) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new int[]{min, max};
    }
}
* */