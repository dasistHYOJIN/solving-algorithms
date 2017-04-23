import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ6359 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- != 0)
		{
			int round = Integer.parseInt(br.readLine().trim());
			boolean room[] = new boolean[round];
		
			for(int i = 1; i <= round; i++)
			{
				for(int j = 1; i*j <= round; j++)
					room[i*j-1] = !room[i*j-1];
			}
		
			int result = 0;
			while (round-- != 0)
				if(room[round])	result++;
			
			System.out.println(result);
		}
		
	}
}
