package helper;
public class helper{
  public static void swapArr(int[] array, int i, int j){
    array[i] = array[i] ^ array[j];
    array[j] = array[i] ^ array[j];
    array[i] = array[i] ^ array[j];
  }
}