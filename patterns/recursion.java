package patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        System.out.println(countSubsequencesSum(new int[]{1, 2, 3, 2}, 0, new ArrayList<>(), 5,0));
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

    static int countSubsequencesSum(int[] array, int i, ArrayList<Integer> ans, int k, int sum){
        if(i == array.length){
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        ans.add(array[i]);
        int a = countSubsequencesSum(array, i + 1, ans, k, sum + array[i]);
        ans.remove(ans.size() - 1);
        int b = countSubsequencesSum(array, i + 1, ans, k, sum);
        return a + b;
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