public class Harshad {
    public static void main(String[] args) {
        int start = 1, end = 200;
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0, temp = num;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (num % sum == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
