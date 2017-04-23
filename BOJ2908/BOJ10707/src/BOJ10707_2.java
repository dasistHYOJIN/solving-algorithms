import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10707_2 {

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
		int input[] = new int[5];
		for (int i =0; i< 5; i++)
			input[i] = Integer.parseInt(br.readLine());

		int X = input[0] * input[4];
		int Y = 0;
		if (input[4] <= input[2])
			Y = input[1];
		else
			Y = (input[4] - input[2]) * input[3] + input[1];
		
		System.out.println((X < Y) ? X : Y);
	}
}
