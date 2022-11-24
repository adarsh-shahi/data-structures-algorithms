package algorithms.sorting;

import java.util.Arrays;

class Sort {
  public static void main(String[] args) {
    int[] array = { 5, 4, 3, 2, 1 };
    merge(array, 0, array.length - 1);
    System.out.println(Arrays.toString(array));
  }

  static void merge(int[] arr, int start, int end) {

    if (end == start)
      return;
    int mid = ((end - start) / 2) + start;

    merge(arr, start, mid);
    merge(arr, mid + 1, end);
    mergeSorted(arr, start, mid, end);
  }

  static void mergeSorted(int[] sorted, int start, int mid, int end) {
    int i = start;
    int j = mid + 1;
    int k = 0;
    int[] ans = new int[(end - start) + 1];
    while (i <= mid && j <= end) {
      if (sorted[i] < sorted[j])
        ans[k] = sorted[i++];
      else
        ans[k] = sorted[j++];
      k++;
    }
    while (i <= mid)
      ans[k++] = sorted[i++];

    while (j <= end)
      ans[k++] = sorted[j++];

    for (int l = start, m = 0; l <= end; l++, m++)
      sorted[l] = ans[m];

  }
}