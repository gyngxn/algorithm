import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			
			switch(s) {
			case "push" :
				stack.push(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop" :
				if(stack.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			
			case "size" :
				sb.append(stack.size()).append("\n");
				break;
			
			case "empty" :
				if(stack.isEmpty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
				break;
			
			case "top" :
				if(stack.isEmpty()) {
					sb.append("-1\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			}
		}
		System.out.println(sb);
	}
}
