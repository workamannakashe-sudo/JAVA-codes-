public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num, rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (num == rev) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}
