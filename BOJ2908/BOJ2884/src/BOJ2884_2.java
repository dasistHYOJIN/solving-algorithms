import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2884_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
		int total = hour * 60 + min - 45;
		System.out.println((hour == 0 && min < 45)
				? (23 + " " + (60+total%60)) : (total/60 + " " + total%60));
	}
}
