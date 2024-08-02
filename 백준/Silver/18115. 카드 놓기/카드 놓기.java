import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] skills = new int[N];
        Deque<Integer> cards = new LinkedList<>();

        for (int i = 0; i < N; i++)
            skills[i] = scanner.nextInt();

        for (int i = N - 1; i >= 0; i--) {
            if (skills[i] == 1) {
                cards.offerFirst(N - i);
            } else if (skills[i] == 2) {
                int tmp = cards.pollFirst();
                cards.offerFirst(N - i);
                cards.offerFirst(tmp);
            } else {
                cards.addLast(N - i);
            }
        }

        StringBuilder out = new StringBuilder();
        for (int card : cards)
            out.append(card).append(" ");

        System.out.println(out);
    }
}