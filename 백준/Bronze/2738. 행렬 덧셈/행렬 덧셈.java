import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		
		//1. A 배열에 값 저장
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//2. B 배열에 값 저장
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		//3. 정답 배열 생성 및 데이터 넣기
		int answer[][] = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		
		//4. 정답 배열 출력
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}

	}

}
