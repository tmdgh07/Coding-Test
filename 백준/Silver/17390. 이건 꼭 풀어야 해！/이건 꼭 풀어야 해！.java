import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); int Q = Integer.parseInt(st.nextToken());
        int[] hap = new int[N];
        int L, R;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            hap[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(hap);

        for(int i = 1; i < N; i++) {
            hap[i] += hap[i - 1];
        }

        for(int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken()) - 1;
            R = Integer.parseInt(st.nextToken()) - 1;
            if(L == 0)
                System.out.println(hap[R]);
            else
                System.out.println(hap[R] - hap[L - 1]);
        }

    }
}