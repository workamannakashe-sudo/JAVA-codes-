import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 15, 21, 5};
        int target = 9;

        boolean foundLinear = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundLinear = true;
                break;
            }
        }
        System.out.println("Linear Search: " + (foundLinear ? "Found" : "Not Found"));

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        boolean foundBinary = false;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                foundBinary = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Binary Search: " + (foundBinary ? "Found" : "Not Found"));
    }
}

    

