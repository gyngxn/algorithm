import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;
		
		for(int i = 1; i <= N; i++) {
			if(N % i == 0) {
				list.add(i);
				count++;
			}
		}
		
		if(count >= K) {
			System.out.print(list.get(K - 1));
		} else {
			System.out.print(0);
		}
	}
}
