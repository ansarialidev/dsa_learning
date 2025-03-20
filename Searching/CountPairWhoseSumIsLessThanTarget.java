package Com.Ali.LearningDSA.Searching;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

public class CountPairWhoseSumIsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {-6,2,5,-2,-7,-1,3};
        for (int num : arr) {
            list.add(num);
        }
        System.out.println(countPairsBrute(list, -2));
    }


    //Time complexity O(N LogN)
    public static int countPairs (List<Integer> list, int target) {
        int res = 0;
        Collections.sort(list);
        int start = 0;
        int end = list.size()-1;
        while (start != end) {
            if ((list.get(start) + list.get(end)) < target) {
                res += end - start;
                start++;
            } else {
                end--;
            }
        }
        return res;
    }

    //This is Brute Force Solution    Time Complexity O(n square)
    public static int countPairsBrute(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i <nums.size() ; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (target > (nums.get(i) + nums.get(j))) {
                    res++;
                }
            }
        }
        return res;
    }
}
