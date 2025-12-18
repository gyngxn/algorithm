import java.io.*;
import java.util.*;

public class Main { //소가 길을 건너간 이유1

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[][] records = new int[N][2];
		
		//1. 소 번호, 위치 2차원 배열에 저장
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			records[i][0] = Integer.parseInt(st.nextToken());
			records[i][1] = Integer.parseInt(st.nextToken());
		}
	
		//2. 소의 현재 위치 배열
		int[] cowPos = new int[11];
		Arrays.fill(cowPos, -1); //아직 확인 되지 않은 소는 -1로 초기화
		
		int count = 0;
		
		
		for(int i = 0 ; i < N; i++) {
			int cowNum = records[i][0];
			int location = records[i][1];
			
			if(cowPos[cowNum] == -1) {
				cowPos[cowNum] = location;
			} 
			
			else if(cowPos[cowNum] != location) {
				count++;
				cowPos[cowNum] = location;
			}
		}
		System.out.println(count);
	}
}
