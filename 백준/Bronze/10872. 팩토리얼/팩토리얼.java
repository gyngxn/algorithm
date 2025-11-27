import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine().trim());
		int answer = 1;
		
		for(int i = N; i > 0; i--) {
			answer *= i;
		}
		System.out.println(answer);
	}
}
