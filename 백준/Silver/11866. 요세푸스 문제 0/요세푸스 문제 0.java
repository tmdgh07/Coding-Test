import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), K =Integer.parseInt(st.nextToken());
        Queue<Integer> yose = new LinkedList<>();

        for(int i = 1; i <= N; i++) {
            yose.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for(int i = 0; i < N; i++) {
            for(int j = 1; j < K; j++)
                yose.add(yose.remove());
            sb.append(yose.remove());
            if (i < N - 1) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
