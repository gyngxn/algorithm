import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = -1;
		
		for(int i = M; i <= N; i++) {
			int count = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				sum += i;
				
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(min == -1) {
			System.out.print(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
