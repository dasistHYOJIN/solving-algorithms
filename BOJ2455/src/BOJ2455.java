import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2455 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder();

		String[] people = new String[2];
		int total = 0;
		int max = 0;

		for (int i = 0; i < 4; i++)
		{
			input.setLength(0);
			input.append(br.readLine().trim());
			people = input.toString().split(" ");
			total = total - Integer.parseInt(people[0]) + Integer.parseInt(people[1]);
			if (max < total) max = total;
		}
		
		System.out.println(max);
	}

}
