import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int chess[] = {1, 1, 2, 2, 2, 8};
		int answer[] = new int [chess.length];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < chess.length; i++) {
			answer[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = chess[i] - answer[i];
		}

		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	} 

}
