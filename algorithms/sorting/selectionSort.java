package algorithms.sorting;

import java.util.Arrays;

class Sort {
  public static void main(String[] args) {  
    System.out.println(Arrays.toString(selection(new int[] {2,3,5,4})));
  }

  static int[] selection(int[] array){
    for (int i = 0; i < array.length - 1; i++) { 
      for(int j = i + 1; j < array.length; j++){
        if(array[i] > array[j]){
          array[i] = array[j] ^ array[i];
          array[j] = array[i] ^ array[j];
          array[i] = array[i] ^ array[j];
        }
      }
    }
    return array;
  }
}