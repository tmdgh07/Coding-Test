import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()), sum = 0;
        int[] ATM = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++)
            ATM[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(ATM);
        
        for(int i = 1; i <= N; i++) {
            ATM[i] = ATM[i] + ATM[i - 1];
            sum += ATM[i];
        }

        System.out.println(sum);
    }
}