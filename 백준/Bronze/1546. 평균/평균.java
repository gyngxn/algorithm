import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //과목 개수 N 입력
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int score[] = new int[N];
        int M = 0;
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
        	score[i] = Integer.parseInt(st.nextToken());
        	if(score[i] > M) {
        		M = score[i];
        	}
        }
       
        for (int i = 0; i < N; i++) {
    	   sum += (double) score[i] / M * 100;
       }
       
       System.out.println(sum / N);
	}
}
