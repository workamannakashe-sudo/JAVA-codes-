public class PrimeNumber {
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i > 1) {
                boolean isPrime = true;
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int start = 10, end = 50;
        printPrimes(start, end);
    }
}
