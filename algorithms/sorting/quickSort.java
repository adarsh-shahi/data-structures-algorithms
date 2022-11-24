package algorithms.sorting;

import java.util.Arrays;

public class quickSort {
  public static void main(String[] args) {
    int[] array = { 8, 7, 0, 6, 2, 1, 3, 4 };
    quick(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  static void quick(int[] array, int start, int end) {
    if (start < end) {
      int pIndex = partition(array, start, end);
      quick(array, start, pIndex - 1);
      quick(array, pIndex + 1, end);
    }
  }

  static int partition(int[] array, int start, int end) {
    int pivotIndex = start;
    int pivot = array[end];
    for (int i = start; i < end; i++) {
      if (array[i] <= pivot) {
        swapArr(array, pivotIndex, i);
        pivotIndex++;
      }
    }
    swapArr(array, pivotIndex, end);
    System.out.println("pivotIndex " + Arrays.toString(array));
    return pivotIndex;
  }

  public static void swapArr(int[] array, int i, int j) {
    if(array[i] == array[j]) return;
    array[i] = array[i] ^ array[j];
    array[j] = array[i] ^ array[j];
    array[i] = array[i] ^ array[j];
  }
}
