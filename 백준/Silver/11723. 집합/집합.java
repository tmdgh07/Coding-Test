import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = 0, M = Integer.parseInt(br.readLine());

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "add":
                    S |= (1 << (Integer.parseInt(st.nextToken()) - 1));
                    break;
                case "remove":
                    S &= ~(1 << (Integer.parseInt(st.nextToken()) - 1));
                    break;
                case "check":
                    sb.append((S & (1 << (Integer.parseInt(st.nextToken()) - 1))) != 0 ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    S ^= (1 << (Integer.parseInt(st.nextToken()) - 1));
                    break;
                case "all":
                    S = (1 << 20) - 1;
                    break;
                case "empty":
                    S = 0;
            }
        }

        System.out.println(sb);
    }
}