import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        String[] score = new String[K];

        for (int i = 0; i < K; i++) {
            int student = scanner.nextInt(), gap = 0;
            int[] scores = new int[student];

            for(int j = 0; j < student; j++) {
                scores[j] = scanner.nextInt();
            }
            Arrays.sort(scores);

            for(int j = 0; j < student - 1; j++)
                gap = Math.max(scores[j + 1] - scores[j], gap);


            score[i] = "Class " + (i + 1) + "\nMax " + scores[student - 1] + ", Min " + scores[0] + ", Largest gap " + gap;
        }

        for (int i = 0; i < K; i++) {
            System.out.println(score[i]);
        }
    }
}