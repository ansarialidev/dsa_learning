package Com.Ali.LearningDSA.Searching;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(searchRange(arr,8)));

        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }

    static int[] searchRange (int[] arr, int target) {
        int[] ans = {-1, -1};
        int bs = binarySearch(arr, target);
        if (bs == -1) {
            return new int[] {-1, -1};
        }
        if (bs > 0 && arr[bs] == arr[bs-1]) {
            ans[0] = bs-1;
        } else {
            ans[0] = bs;
        }
        if (bs < arr.length-1 && arr[bs] == arr[bs+1]) {
            ans[1] = bs+1;
        } else {
            ans[1] = bs;
        }
        return ans;
    }

    static int binarySearch (int[] arr , int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
