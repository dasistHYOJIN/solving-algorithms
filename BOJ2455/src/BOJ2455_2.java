/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2455_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = 0;
		int max = 0;

		for (int i = 0; i < 4; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			total = total - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			if (max < total) max = total;
		}
		
		System.out.println(max);
	}

}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2455_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int total = 0;
		int max = 0;

		for (int i = 0; i < 4; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			//total = - Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			total += -(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
			if (max < total) max = total;
		}
		System.out.println(max);
	}
}
