import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2884 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String(br.readLine().trim());
		String hm[] = str.split(" ");

		int min = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]) - 45;
		System.out.println((Integer.parseInt(hm[0]) == 0 && Integer.parseInt(hm[1]) < 45)
				? (23 + " " + (60+min%60)) : (min/60 + " " + min%60));
	}
}
