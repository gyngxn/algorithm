import java.io.*;

public class Solution { //조별과제

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int answer = N / 3;
			
			System.out.println("#" + (i + 1) + " " + answer);
		}
	}
}
