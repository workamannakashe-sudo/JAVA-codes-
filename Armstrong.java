public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num, sum = 0, digits = 0;

        int n = num;
        while (n > 0) {
            digits++;
            n /= 10;
        }

        n = num;
        while (n > 0) {
            int digit = n % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            n /= 10;
        }

        if (sum == temp) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
