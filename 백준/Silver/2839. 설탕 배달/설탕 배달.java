import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(sugar(num));
    }

    public static int sugar(int num) {
        for(int i = num / 5; i >= 0; i--) {
            int remainder = num - (i * 5);

            if(remainder % 3 == 0)
                return i + (remainder / 3);
        }
        return -1;
    }
}
