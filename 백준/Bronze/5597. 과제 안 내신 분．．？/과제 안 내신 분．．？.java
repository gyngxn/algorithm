import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] stu = new int[31];

        for(int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            stu[num] = 1; // 과제 제출한 번호 표시
        }

        for(int i = 1; i < 31; i++) {
            if(stu[i] == 0) bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
