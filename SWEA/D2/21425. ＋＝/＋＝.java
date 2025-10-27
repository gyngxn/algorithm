import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			int count = 0;
			
			while (A <= N && B <= N) {
				if(A < B) {
					A += B;
				} else {
					B += A;
				}
				count++;
			}
			System.out.println(count);
		}
	}
}
