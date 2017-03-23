import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2577_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		int num[] = new int[10];
		
		String total = A*B*C+"";

		for(int i = 0; i < total.length() ; i++)
			num[total.charAt(i)-48]++;
		
		for(int i = 0; i < 10; i++)
			System.out.println(num[i]);		

	}

}
