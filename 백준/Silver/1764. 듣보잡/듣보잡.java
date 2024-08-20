import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), count = 0;
        String[] listen = new String[N], temp = new String[Math.max(N, M)];
        Map<String, Integer> nameToIndex = new HashMap<>();

        for(int i = 0; i < N; i++) {
            listen[i] = br.readLine();
            nameToIndex.put(listen[i], i + 1);
        }

        for(int i = 0; i < M; i++) {
            String tmp = br.readLine();
            if (nameToIndex.get(tmp) != null) {
                temp[count] = tmp;
                count++;
            }
        }
        System.out.println(count);
        String[] result = new String[count];
        System.arraycopy(temp, 0, result, 0, count);
        Arrays.sort(result);

        for(int i = 0; i < count; i++)
            System.out.println(result[i]);

    }
}