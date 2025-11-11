import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		int avg = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				sum += num;
			}
			
			avg = (int) Math.round((double) sum / 10.0);
			
			System.out.println("#" + (i + 1) + " " + avg);
		}
	}
}
