import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		double totalScore = 0.0;
		double subjectAvg = 0.0;
		
		for(int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double score = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(!grade.equals("P")) {
				totalScore += score;
			
				switch(grade) {
				case "A+" :
					subjectAvg += score * 4.5;
					break;
				
				case "A0" :
					subjectAvg += score * 4.0;
					break;
				
				case "B+" :
					subjectAvg += score * 3.5;
					break;
			
				case "B0" :
					subjectAvg += score * 3.0;
					break;
			
				case "C+" :
					subjectAvg += score * 2.5;
					break;
				
				case "C0" :
					subjectAvg += score * 2.0;
					break;
				
				case "D+" :
					subjectAvg += score * 1.5;
					break;
				
				case "D0" :
					subjectAvg += score * 1.0;
					break;
				
				case "F" :
					subjectAvg += score * 0;
					break;
				}
			}
		}
		System.out.println(subjectAvg / totalScore);
	}
}
