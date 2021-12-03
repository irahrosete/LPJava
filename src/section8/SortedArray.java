package section8;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
  public static void main(String[] args) {
    int[] myArray = getIntegers(5);
    sortIntegers(myArray);
//    System.out.println(Arrays.toString(sortIntegers(myArray)));
    printArray(myArray);
  }

  public static Scanner scanner = new Scanner(System.in);

  public static int[] getIntegers(int numbers) {
    System.out.println("Enter " + numbers + " values.\r");
    int[] integerArray = new int[numbers];

    for (int i=0; i<integerArray.length; i++) {
      integerArray[i] = scanner.nextInt();
    }
    return integerArray;
  }

  public static void printArray(int[] array) {
    for (int i=0; i<array.length; i++) {
      System.out.println("Element " + i + " contains " + array[i]);
    }
  }

  public static int[] sortIntegers(int[] array) {
    int temp;
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] < array[j]) {
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
}