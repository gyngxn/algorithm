import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int t = sc.nextInt();
        int n = sc.nextInt();

        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            //이전 합에 누적이 되어야하는 코드
            sum += a * b;
        }
        if (t == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
