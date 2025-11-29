import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int answer = 10;
		
		for(int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			char s = str.charAt(i+1);
			
			if(c == s) {
				answer += 5;
			} else {
				answer += 10;
			}
		}
		System.out.println(answer);
	}

}
