import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "long ";
		
		for(int i = 0; i < N / 4; i++) {
			System.out.print(str);
		}
		System.out.print("int");
	}

}
