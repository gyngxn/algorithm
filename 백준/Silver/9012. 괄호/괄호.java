import java.io.*;
import java.util.*;;

public class Main {
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			String ps = br.readLine();
			Stack<Character> stackStr = new Stack<>();
			boolean isVPS = true;
			
			for(int j = 0; j < ps.length(); j++) {
				char s = ps.charAt(j);
				
				if (s == '(') {
					stackStr.push(s);
				} else if(s == ')') {
					if(stackStr.isEmpty()) {
						isVPS = false;
						break;
					} else {
						stackStr.pop();
					}
				}
			}
			
			if(!stackStr.isEmpty()) {
				isVPS = false;
			}
			
			if (isVPS) {
				sb.append("YES").append("\n");
			} else {
				sb.append("NO").append("\n");
			}
		}
		System.out.println(sb);
	}
}
