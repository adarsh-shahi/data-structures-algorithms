package patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        printFirstSubsequence(new int[]{1, 2, 3, 2}, 0, new ArrayList<>(), 3,0);
    }

    static void subsequences(int[] array, int currentIndex, ArrayList<Integer> ans) {
        if (currentIndex == array.length) {
            System.out.println(ans);
            return;
        }

        ans.add(array[currentIndex]);
        subsequences(array, currentIndex + 1, ans);
        ans.remove(ans.size() - 1);
        subsequences(array, currentIndex + 1, ans);

    }
    static boolean printFirstSubsequence(int[] array, int currentIndex, ArrayList<Integer> ans, int k, int sum) {
        if (currentIndex == array.length) {
            if (sum == k) {
                for (int e : ans) System.out.print(e + " ");
                return true;
            }
            return false;
        }

        ans.add(array[currentIndex]);
        if (printFirstSubsequence(array, currentIndex + 1, ans, k, sum + array[currentIndex])) return true;
        ans.remove(ans.size() - 1);
        if (printFirstSubsequence(array, currentIndex + 1, ans, k, sum)) return true;
        return false;
    }

//    static void subsequencesEqualToSum(int[] array, int sum, int k, int i, ArrayList<Integer> ans) {
//        if (sum == k) {
//            System.out.println(ans);
//            return;
//        }
//        if (i >= array.length) return;
//        if (sum + array[i] <= k) {
//            ans.add(array[i]);
//            subsequencesEqualToSum(array, sum + array[i], k, i + 1, ans);
//        } else {
//            subsequencesEqualToSum(array, sum, k, i + 1, ans);
//        }
//        ans.remove(ans.size() - 1);
//        subsequencesEqualToSum(array, sum, k, i + 1, ans);
//    }
}