import java.util.Arrays;

public class insertionSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(insertion(new int[] { 5, 4, 3, 2, 6 })));
  }

  static int[] insertion(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        array[i] = array[i + 1] ^ array[i];
        array[i + 1] = array[i] ^ array[i + 1];
        array[i] = array[i] ^ array[i + 1];
        for (int j = i; j > 0; j--) {
          if (array[j] < array[j - 1]) {
            array[j - 1] = array[j] ^ array[j - 1];
            array[j] = array[j - 1] ^ array[j];
            array[j - 1] = array[j - 1] ^ array[j];
          }
        }
      }
    }
    return array;
  }
}