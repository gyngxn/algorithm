import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		
		int answer_hour = hour;
		int answer_min = min - 45;
		
		if(answer_min < 0) {
			if(hour == 0) {
				answer_hour = 24;
			}
			answer_hour--;
			answer_min = answer_min + 60;
		}
		System.out.println(answer_hour + " " + answer_min);
	}

}
