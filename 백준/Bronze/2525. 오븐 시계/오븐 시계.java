import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int run = Integer.parseInt(br.readLine());
		
		int answer = min + run;
		
		while(answer > 59) {
			hour++;
			answer -= 60;
			
			if(hour > 23) {
				hour = 0;
			}
		}
		System.out.println(hour + " " + answer);
	}
}
