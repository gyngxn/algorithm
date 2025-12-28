import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int arr[][] = new int[9][9];
		
		//1. 배열 채워넣기
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int max = 0;
		int row = 0;
		int col = 0;
		
		//2. 최댓값 찾기
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					row = i;
					col = j;
					
				}
			}
		}
		System.out.println(max);
		System.out.println((row + 1) + " " + (col + 1));
	}
}
