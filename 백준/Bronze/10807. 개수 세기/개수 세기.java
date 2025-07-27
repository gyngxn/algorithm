import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 첫 번째 줄에서 정수의 개수 n 입력 받기
        int n = Integer.parseInt(br.readLine());

        // 두 번째 줄에서 정수의 배열 입력 받기
        int numbers[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 세 번째 줄에서 찾으려는 정수 입력 받기
        int a = Integer.parseInt(br.readLine());

        // 배열에서 정수 a의 개수 구하기
        int count = 0;
        for (int number : numbers) {
            if(number == a) {
                count++;
            }
        }
        // 정수는 문자열로 변환하여 출력
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
