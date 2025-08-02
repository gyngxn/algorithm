import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];
        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            num[i] = Integer.parseInt(br.readLine()); //한 줄씩 숫자 입력
            if (max < num[i]) { 
                max = num[i];
                index = i + 1;
            }
        }
        bw.write(String.valueOf(max)+"\n");
        bw.write(String.valueOf(index));
        bw.flush();
        bw.close();
    }
}
