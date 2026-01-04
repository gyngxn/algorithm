import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		String num2 = br.readLine();
		
		System.out.println(num1 * (num2.charAt(2) - '0'));
		System.out.println(num1 * (num2.charAt(1) - '0'));
		System.out.println(num1 * (num2.charAt(0) - '0'));
		System.out.print(num1 * Integer.parseInt(num2));
	}

}
