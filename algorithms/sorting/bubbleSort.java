package algorithms.sorting;

import java.util.Arrays;

class Sort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(bubble(new int[] {5,4,3,2,1})));
  }

  static int[] bubble(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      boolean isSorted = true;
      for (int j = 0; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          isSorted = false;
          array[j] = array[j] ^ array[j + 1];
          array[j + 1] = array[j] ^ array[j + 1];
          array[j] = array[j + 1] ^ array[j];
        }
      }
      if(isSorted) return array;
    }
    return array;
  }



}