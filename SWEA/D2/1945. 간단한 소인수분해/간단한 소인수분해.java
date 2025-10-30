import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			
			while (N % 2 == 0) {
				a++;
				N /= 2;
			}
			
			while (N % 3 == 0) {
				b++;
				N /= 3;
			}
			
			while (N % 5 == 0) {
				c++;
				N /= 5;
			}
			
			while (N % 7 == 0) {
				d++;
				N /= 7;
			}
			
			while (N % 11 == 0) {
				e++;
				N /= 11;
			}
			System.out.println("#" + (i + 1) + " " + a + " " + b + " " + c + " " + d + " " + e);
		}
	}
}
