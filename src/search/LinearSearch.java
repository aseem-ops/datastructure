package search;

public class LinearSearch {
    public static void main(String[] args) {
        int index = LinearSearch.linearSearch(new int[]{2, 6, 8, 4, 3, 87}, 8);
        System.out.println("Index: " + index);
    }

    public static int linearSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
