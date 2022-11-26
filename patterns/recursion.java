package patterns;

import java.util.ArrayList;
import java.util.Arrays;

public class recursion{
    public static void main(String[] args) {
        subsequences(new int[] {1,2,3}, 0, new ArrayList<>());
    }

    static void subsequences(int[] array, int currentIndex, ArrayList<Integer> ans){
        if(currentIndex == array.length) {
            System.out.println(ans);
            return;
        }

        ans.add(array[currentIndex]);
        subsequences(array, currentIndex + 1, ans);
        ans.remove(ans.size() - 1);
        subsequences(array, currentIndex + 1, ans);

    }
}