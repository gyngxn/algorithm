import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder()
;
		int T = Integer.parseInt(br.readLine());
		int arr[] = new int[T];
		
		// 1. 수열 배열 만들기
		for(int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Stack<Integer> stack = new Stack<>();
				
		int num = 1;
		boolean ps = true;
		
		// 2. 수열을 하나씩 확인
		for(int i = 0; i < arr.length; i++) {
			int su = arr[i];
			
			// 3. 수열이 num 보다 크면 num을 수열 숫자까지 push
			if (su >= num) {  
				while(su >= num) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {  // 4. 수열이 num 보다 작을 때
				int top = stack.pop(); 
				
				// 5. 스택에서 꺼낸 top와 수열 값이 다른 경우
				if(top != su) {
					System.out.println("NO");
					ps = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}
		
		// 6. for문이 중단되지 않고 스택 연산이 모두 이뤄진 경우
		if(ps) {
			System.out.println(sb.toString());
		}
	}
}
