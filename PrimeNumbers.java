public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");
        for (int num =4; num <= 100; num++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}