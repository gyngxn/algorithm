import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력 - 10, 5
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        // 배열 선언
        int[] numbers = new int[N];

        // 두 번째 줄 입력 - 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i]= Integer.parseInt(st.nextToken());
        }

        // 배열 안에서 X = 5 보다 작은 수 출력
        for (int i = 0; i < N; i++) {
            if (numbers[i] < X) {
                bw.write(numbers[i] + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
