import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int C = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < C; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());

			// 학생 수 N
			int N = Integer.parseInt(st.nextToken());
			int[] score = new int[N];
			
			// 총점 소수점 계산해야하니 double 타입
			double sum = 0; 
			
			//1. 점수를 배열에 저장하고 총합 구하기
			for(int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			
			double avg = sum / N;
			double aboveAvg = 0;
			
			//2. 평균 넘는 학생 수 카운트
			for(int j = 0; j < N; j++) {
				if (score[j] > avg) {
					aboveAvg++;
				}
			}
			
			//3. 비율 계산 및 출력
			double ratio = (aboveAvg / N) * 100;
			System.out.printf("%.3f%%\n", ratio);
		}
	}
}
