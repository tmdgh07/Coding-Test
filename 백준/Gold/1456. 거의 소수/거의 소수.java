import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        scanner.close();

        BigInteger bigA = BigInteger.valueOf((long) A);
        BigInteger bigB = BigInteger.valueOf((long) B);

        List<BigInteger> primes = sieveOfEratosthenes((long) Math.sqrt(B));
        int count = 0;

        for (BigInteger prime : primes) {
            BigInteger power = prime;
            while (true) {
                power = power.multiply(prime);
                if (power.compareTo(bigB) > 0) break;
                if (power.compareTo(bigA) >= 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
    
    public static List<BigInteger> sieveOfEratosthenes(long max) {
        boolean[] isPrime = new boolean[(int) max + 1];
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<BigInteger> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(BigInteger.valueOf(i));
            }
        }

        return primes;
    }
}
