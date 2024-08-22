import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), count = 0;
        int[] coin = new int[N];

        for(int i = N - 1; i >= 0; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++) {
            while(K - coin[i] >= 0) {
                K -= coin[i];
                count++;
            }
            if(K == 0)
                break;
        }
        System.out.println(count);
    }
}