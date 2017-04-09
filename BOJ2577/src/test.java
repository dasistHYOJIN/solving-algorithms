import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {

	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String B = br.readLine().trim();
		String B1 = br.readLine();
		int A = Integer.parseInt(br.readLine().trim());
		int A1 = Integer.parseInt(br.readLine());
		//int B = In
		//Scanner sc = new Scanner(System.in);
	//	String s1 = sc.next();
//		String s2 = sc.nextLine();

		// nextLine은 개행문자도 문자 입력으로 입력받음
		System.out.println(B);
		System.out.println(B1);
		System.out.println(A);
		System.out.println(A1);

	}

}
