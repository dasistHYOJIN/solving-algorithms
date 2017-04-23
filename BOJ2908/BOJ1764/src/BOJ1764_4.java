import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1764_4 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * HashMap 사용해서
		 * 듣못한사람 추가<이름, 횟수>하고
		 * 보못한사람이름이 HashMap에 있으면 count++
		 */
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // 듣못
		int M = Integer.parseInt(NM.nextToken()); // 보못
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		for (int i = 0; i < N; i++)
			people.put(br.readLine(), 0);

		for (int i = 0; i < M; i++)
		{
			StringBuilder sb = new StringBuilder(br.readLine());
			if (people.containsKey(sb.toString()))
				people.put(sb.toString(), people.get(sb.toString()) + 1);
			//else people.put(sb.toString(), 0);
		}
		
		//String list = new String();
		int count = 0;
		StringBuilder list = new StringBuilder();
		for (Object o : people.keySet())
			if (people.get(o) > 0) //for (; people.get(o) > 0; count++)//if (people.get(o) > 0) // if (people.get(o).equals(2))
			{
		    	list.append(o).append("\n");
		    	count++;
			}
		String them[] = list.toString().split("\n");
		Arrays.sort(them);

		//System.out.println(them.length);
		System.out.println(count);
		for (int i = 0; i < them.length; i++)
			System.out.println(them[i]);
	}
}
