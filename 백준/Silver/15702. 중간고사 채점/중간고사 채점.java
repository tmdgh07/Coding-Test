import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(), M = scanner.nextInt();
        int[] score = new int[N];
        int[][] student = new int[M][2];
        char[][] answer = new char[M][N];

        for(int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        for (int i = 0; i < M; i++) {
            student[i][0] = scanner.nextInt();
            for (int j = 0; j < N; j++) {
                answer[i][j] = scanner.next().charAt(0);
            }
        }

        int max = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (answer[i][j] == 'O')
                        student[i][1] += score[j];
            }
            if ((student[max][1] <= student[i][1])) {
                if (student[max][1] == student[i][1]) {
                    max = student[max][0] > student[i][0] ? i : max;
                }
                else
                    max = i;
            }
        }

        System.out.print(student[max][0] + " " + student[max][1]);

    }
}