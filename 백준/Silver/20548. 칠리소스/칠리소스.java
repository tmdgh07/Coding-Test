import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double c = Double.parseDouble(br.readLine());
        double square, level = 0;

        for(int i = 12; i >= 0; i--) {
            square = Math.pow(7, i);
            while(c - square >= 0) {
                c -= square;
                level += Math.pow(3, i);
            }
        }

        System.out.println((long)level);
    }
}