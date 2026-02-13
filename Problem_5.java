public class PrimeNumbers {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
          boolean isPrime = true;
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + ", ");
            }
        }
    }
}
