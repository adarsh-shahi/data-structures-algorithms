import java.util.Arrays;

public class insertionSort {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(insertion2(new int[] { 12, 11 ,13, 5, 6})));
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


  static int[] insertion2(int[] array){
    for (int i = 1; i < array.length; i++) {
      for (int j = i; j > 0; j--) {
        if(array[j] < array[j - 1]){
            array[j - 1] = array[j] ^ array[j - 1];
            array[j] = array[j - 1] ^ array[j];
            array[j - 1] = array[j - 1] ^ array[j];
        }
        else break;   // as left part is already sorted no need to check
      }
    }
    return array;
  }
}