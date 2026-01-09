import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] area = new int[100][100];
		int count = 0;
		
		for(int test = 0; test < N; test++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
		
			for(int i = x; i < x + 10; i++) {
				for(int j = y; j < y + 10; j++) {
					
					// 중복 제거
					if(area[i][j] == 0) {
						area[i][j] = 1;
						count++;
					}
				}
			}
		}
		System.out.print(count);
	}
}
