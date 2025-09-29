import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			int score = 0;  // 'O'이 나올 때마다 1씩 증가
			int sum = 0;    // 테스트 케이스의 총점을 저장
			for(int j = 0; j < str.length(); j++) {
				
				// j번째 문자가 'O' 경우
				if(str.charAt(j) == 'O') {
					score++;
					sum += score;
				}
				
				// j번째 문자가 'X' 인경우
				else {
					score = 0; //연속이 끊겨서 점수 0으로 초기화
				}
			}
			System.out.println(sum);
		}
	}
}
