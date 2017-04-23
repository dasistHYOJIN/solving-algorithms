import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10707 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * X사 : 1리터당 A엔.
		 * Y사 : 기본요금은 B엔이고, 사용량이 C리터 이하라면 요금은 기본요금만 청구된다.
		 * 		사용량이 C리터가 넘었을 경우 기본요금 B엔에 더해서 추가요금이 붙는다. 
		 * 		추가요금은 사용량이 C리터를 넘었을 경우 1리터를 넘었을 때마다 D엔이다.
		 * 
		 * A : X사의 1리터당 요금
		 * B : Y사의 기본요금
		 * C : Y사의 요금이 기본요금이 되는 사용량의 상한
		 * D : Y사의 1리터 당 추가요금
		 * P : JOI군의 집에서 사용하는 한 달간 수도의 양
		 */
		/*String input = new String();
		for (int i =0; i< 5; i++)
			input += br.readLine() + " ";*/
		
		StringBuilder input = new StringBuilder();
		for (int i =0; i< 5; i++) 
			input.append(br.readLine()).append(" "); //input.append(br.readLine()).append("\n");
		String price[] = input.toString().split(" ");

		int X = Integer.parseInt(price[0]) * Integer.parseInt(price[4]);
		int Y = 0;
		if (price[4].compareTo(price[2]) <= 0) //if (Integer.parseInt(price[4]) <= Integer.parseInt(price[2]))
			Y = Integer.parseInt(price[1]);//Integer.parseInt(price[0]) * Integer.parseInt(price[4]);
		else
			Y = (Integer.parseInt(price[4]) - Integer.parseInt(price[2])) * Integer.parseInt(price[3]) + Integer.parseInt(price[1]);
		
		System.out.println((X < Y) ? X : Y);	
	}
}
