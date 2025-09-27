import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 3개의 자연수 입력 받기
		int A = Integer.parseInt(br.readLine()); 
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String multi = String.valueOf(A * B * C);
		
		// 2. 0부터 9까지 숫자의 개수 저장할 배열
		int count[] = new int[10];
		
		// 문자열 한 글자씩 순회
		for (int i = 0; i < multi.length(); i++) {
			int digit = multi.charAt(i) - '0';
			
			// 해당 숫자의 카운트 1 증가
			count[digit]++;
		}
		
		// 3. 0부터 9까지 카운트 순서대로 출력
		for(int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
	}
}
