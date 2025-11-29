import java.io.*;

public class Main { //그룹 단어 체커

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			boolean arr[] = new boolean[26];
			boolean check = true;
			
			arr[str.charAt(0) - 'a'] = true;  //첫 글자 왔었다?
			
			for(int j = 0; j < str.length() - 1; j++) {
				int pre = str.charAt(j);
				int next = str.charAt(j + 1);
				
				//전 과 후가 다를 때
				if(pre != next) {
					if(arr[next - 'a'] == true) { //뒷 글자가 이미 나왔었던 경우
						check = false;
						break;
					}
					arr[next - 'a'] = true; // 처음 나온 글자면 왔다고 표시
				} 
			}
			if(check == true) count++;
		}
		System.out.println(count);
	}
}
