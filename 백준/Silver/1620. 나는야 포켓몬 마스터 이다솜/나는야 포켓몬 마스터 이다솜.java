import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        String[] name = new String[N];
        Map<String, Integer> nameToIndex = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            name[i] = br.readLine();
            nameToIndex.put(name[i], i + 1);
        }

        for (int i = 0; i < M; i++) {
            String tmp = br.readLine();
            
            if (isInteger(tmp)) {
                int num = Integer.parseInt(tmp);
                System.out.println(name[num - 1]);
            } 
            else {
                System.out.println(nameToIndex.get(tmp));
            }
        }
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
