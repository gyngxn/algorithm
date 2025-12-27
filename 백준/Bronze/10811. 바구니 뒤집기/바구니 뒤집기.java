import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		//1. 배열 저장
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		//2. 역순 부분 입력
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int front = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			
			//3. 역순으로 표현 - 투 포인터 사용
			while(front < end) {
				int temp = arr[end];
				arr[end] = arr[front];
				arr[front] = temp;
				
				front++;
				end--;
			}
		}
		
		//4. 마지막으로 저장된 배열 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
