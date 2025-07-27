import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write((a+b) + "\n");

        }
        bw.flush();
        bw.close();
    }
}

//EOF - End of File 더 이상 읽을 수 있는 데이터가 없음을 나타내는 에러