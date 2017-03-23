import java.util.Scanner;

public class BOJ2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num[] = new int[10];
		
		String total = A*B*C+"";

		for(int i = 0; i < total.length() ; i++)
			num[total.charAt(i)-48]++;
		
		for(int i = 0; i < 10; i++)
			System.out.println(num[i]);		
	}

}
