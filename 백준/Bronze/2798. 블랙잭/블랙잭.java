import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());

		int arr[] = new int[N];

		//1. 배열 채우기
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//2. 차례대로 값 비교
		int sum = 0;
		int ans = 0;
		for(int i = 0; i < N - 2; i++) {
			for(int j = i+1; j < N - 1; j++) {
				for(int k = j + 1; k < N; k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if(sum <= M) {
						if(sum > ans) {
							ans = sum;
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
