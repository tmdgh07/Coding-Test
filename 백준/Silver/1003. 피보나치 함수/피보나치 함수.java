import java.util.Scanner;

public class Main {

    static int[] cache;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();


        for(int i = 0; i < T; i++) {
            int num = scanner.nextInt();

            cache = new int[num + 1];
            if (num != 0) {
                cache[1] = 1;
                System.out.println(fibonacci(num - 1) + " " + fibonacci(num));
            }
            else
                System.out.println("1 0");
        }
    }

    public static int fibonacci(int n) {
        if(n <= 1 || cache[n] != 0) return cache[n];
        cache[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return cache[n];
    }
}
