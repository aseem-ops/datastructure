package search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int index = BinarySearch.binarySearch(new int[]{2, 5, 3, 7, 45, 645}, 645);
        System.out.println("Index: " + index);
    }

    public static int binarySearch(int arr[], int num) {
        Arrays.sort(arr);
        int index = 0;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex = 0;

        while (startIndex <= endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            if (arr[midIndex] == num) {
                return midIndex;
            } else if (arr[midIndex] >= num) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }
}
