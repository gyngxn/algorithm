import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수의 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        int num[] = new int[N];

        // 두 번째 줄 N개의 수 한 번에 입력 받고 하나씩 나누기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int min = num[0];
        int max = num[0];

        for(int i = 1; i < N; i++) {
            if(num[i] < min) {
                min = num[i];
            }
            if(num[i] > max){
                max = num[i];
            }
        }
        bw.write(String.valueOf(min + " " + max));
        bw.flush();
        bw.close();
    }
}
