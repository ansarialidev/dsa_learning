package Com.Ali.LearningDSA.Searching;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        System.out.println(getPivot(arr));

    }
    public static int getPivot (int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid -1]) {
                return mid -1 ;
            } else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int getPivot1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Ensure mid+1 is within bounds before accessing
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Ensure mid-1 is within bounds before accessing
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If left half is sorted, move to the right half
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else { // Otherwise, move to the left half
                end = mid - 1;
            }
        }

        return -1; // No pivot found (array not rotated)
    }
}
