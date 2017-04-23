import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // 듣못
		int M = Integer.parseInt(NM.nextToken()); // 보못
		String n_person[] = new String[N];
		String m_person[] = new String[M];

		 /*첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
		  이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, 
		 N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.*/ 
		StringBuilder name = new StringBuilder(" ");
		for (int i = 0; i < N; i++) n_person.append(br.readLine() + " ");
		for (int i = 0; i < M; i++) m_person[i] = br.readLine().trim();

		int count = 0;
		for (int i = 0; i < M; i++)
			if (n_person.toString().contains(" " + m_person[i] + " "))
			{
				name.append(m_person[i]).append("\n");
				count++;
			}
		
		// 듣보잡의 수와 그 명단을 사전순으로 출력한다.
		System.out.println(count);
		String str[] = name.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1764_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
		StringTokenizer NM = new StringTokenizer(br.readLine().trim());
		int N = Integer.parseInt(NM.nextToken()); // 듣못
		int M = Integer.parseInt(NM.nextToken()); // 보못
		StringBuilder n_person = new StringBuilder();
		String m_person[] = new String[M];

		 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
		  이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, 
		 N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
		StringBuilder name = new StringBuilder(" ");
		for (int i = 0; i < N; i++) n_person.append(br.readLine() + " ");
		for (int i = 0; i < M; i++) m_person[i] = br.readLine().trim();

		int count = 0;
		for (int i = 0; i < M; i++)
			if (n_person.toString().contains(" " + m_person[i] + " "))
			{
				name.append(m_person[i]).append("\n");
				count++;
			}
		
		// 듣보잡의 수와 그 명단을 사전순으로 출력한다.
		System.out.println(count);
		String str[] = name.toString().split("\n");
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}*/