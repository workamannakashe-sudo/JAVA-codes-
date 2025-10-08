public class LargestSmallest {
    public static void main(String[] args) {
        int num = 5834297;
        int largest = 0, smallest = 9;
        while (num > 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            if (digit < smallest) {
                smallest = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit: " + largest);
        System.out.println("Smallest digit: " + smallest);
    }
}
