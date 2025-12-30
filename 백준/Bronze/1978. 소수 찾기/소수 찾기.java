import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
		
			int sum = 0;
			
			for(int j = 1; j <= num; j++) {
				if(num % j == 0) {
					sum += j;
				}
			}
			
			if(sum == 1 + num) {
				count++;
			}
		}
		System.out.print(count);
	}
}

