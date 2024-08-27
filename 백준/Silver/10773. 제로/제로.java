import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()), tmp, sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            tmp = Integer.parseInt(br.readLine());
            if(tmp == 0)
                stack.pop();
            else
                stack.push(tmp);
        }

        while(!stack.empty())
            sum += stack.pop();

        System.out.println(sum);
    }
}