import java.io.*;
import java.util.*;

public class Solution { // 24시간

	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int h1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			
			int hour = h1 + h2;
			
			if(hour > 24) {
				hour -= 24;
			} else if(hour == 24) {
				hour = 0;
			}
			System.out.println("#" + (i + 1) + " " + hour);
		}
	}
}
