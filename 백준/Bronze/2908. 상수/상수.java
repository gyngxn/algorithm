import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int n = a;
		int answer = 0;
		while(n > 0) {
			int digit = n % 10;
			answer = answer * 10 + digit;
			n /= 10;
		}
		
		int num = b;
		int answer2 = 0;
		while(num > 0) {
			int digit = num % 10;
			answer2 = answer2 * 10 + digit;
			num /= 10;
		}
		
		System.out.println(Math.max(answer, answer2));
	}
}
