import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 알파벳 빈도 저장 배열
		int[] alphaCount = new int[26];
		
		// 2. 입력 문자열을 모두 대문자로 변환
		String S = br.readLine().toUpperCase();
		
		// 3. 문자열 길이만큼 순회
		for(int i = 0; i < S.length(); i++) {
			 alphaCount[S.charAt(i) - 'A']++;
		}
		
		int max = 0;
		char mostChar = 'A';
		
		// 4. 알파뱃 빈도 배열 크기 만큼 순회
		for(int i = 0; i < 26; i++) {
			if (alphaCount[i] > max) {
				// 새로운 최대값을 max에 갱신
				max = alphaCount[i];
				mostChar = (char) ('A' + i);
			} else if (alphaCount[i] == max) {
				mostChar = '?';
			}
		}
		System.out.print(mostChar);
	}
}
