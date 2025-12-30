import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == -1) break;
			
			String word = "is NOT perfect.";
			String result = "1";
			int sum = 1;
			
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					sum += i;
					result += " + " + i;
				}
			}
			
			if(sum == n) {
				System.out.println(n + " = " + result);
			} else {
				System.out.println(n + " " + word);
			}
		}
	}
}
