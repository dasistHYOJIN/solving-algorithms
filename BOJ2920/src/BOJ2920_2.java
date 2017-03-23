import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2920_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int music[] = new int[8];

		for(int i = 0; i < 8; i++)
			music[i] = Integer.parseInt(br.readLine().trim());

		/*
		 * ascending: 1부터 시작
		 * descending: 8부터 시작
		 * mixed: 중간에 순서가 뒤죽박죽
		 * 이전 값이랑 비교해서 그래프?의 변화가 있으면 flag를 바꿔줌
		 */
		
		String state = "ascending";
		if(music[0] < music[1]) // ascending인 경우
		{
			for(int i = 0; i < 8; i++) // 만약 다 ascending 상태면
			{
				if(music[i] != i+1) {
					state = "mixed";
					break;
				}
			}
			
		}
		else
		{
			for(int i = 0; i < 8; i++) // 만약 다 ascending 상태면
			{
				if(music[i] == 8-i)
					state = "descending";
				else {
					state = "mixed";
					break;
				}
			}	
		}
		
		System.out.println(state);

	}

}
