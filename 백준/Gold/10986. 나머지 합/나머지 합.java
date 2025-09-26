import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//1. 수의 개수 N, 나누기 할 수 M 입력
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long result = 0;
		long[] S = new long[N + 1];  //누적 합 배열
		long[] cnt = new long[M]; 	 //나머지 카운트 배열
		
		//2. N개의 수 입력 받으면서 구간 합 배열 저장
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			S[i] = S[i-1] + Integer.parseInt(st.nextToken());
		}

		//3. 구간 합 배열 S[i]를 M으로 나눈 나머지 저장 및 카운트
		for(int i = 1; i <= N; i++) {
			int remain = (int) (S[i] % M);
			
			// 경우 1: 나머지가 0인 경우
			if(remain == 0) {
				result++;
			}
			
			// 현재 나머지에 해당하는 카운트 1 증가 (경우 2에 사용)
			cnt[remain]++;
		}
		
		//4. 나머지 카운트 배열 cnt를 사용해서 경우 2 계산
		for(int i = 0; i < M; i++) {
			// 경우 2: 나머지가 같은 그룹 안에서 2개를 뽑은 조합 수
			if(cnt[i] > 1) {
				
				// nC2 조합: n * (n - 1) / 2
				result = result + (cnt[i] * (cnt[i]-1)) / 2; 
			}
		}
		
		System.out.println(result);
	}
}
