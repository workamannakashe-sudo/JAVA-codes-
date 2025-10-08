public class Reverse {
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reversed number: " + reverse(number));
    }
}
