package Searching;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {12, 23, 45, 67, 78, 90, 91, 95, 98, 100, 104};

        System.out.println(binarySearch(nums, 45));
    }

    public static int binarySearch(int[] ar, int key) {
        int left = 0;
        int right = ar.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ar[mid] < key) {
                left = mid + 1;
            } else if (ar[mid] > key) {
                right = mid - 1;
            } else {
                return mid;  // Key found
            }
        }
        return -1;  // Key not found
    }
}
