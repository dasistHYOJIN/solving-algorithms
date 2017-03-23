import java.util.Scanner;

public class BOJ2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int music[] = new int[8];
		
		for(int i = 0; i < 8; i++)
			music[i] = sc.nextInt();

		/*
		 * ascending: 1부터 시작
		 * descending: 8부터 시작
		 * mixed: 중간에 순서가 뒤죽박죽
		 * 이전 값이랑 비교해서 그래프?의 변화가 있으면 flag를 바꿔줌
		 */
		
		boolean flag = true;
		
		if(music[0] == 1 && music[7] == 8) // ascending인 경우
		{
			for(int i = 1; i < 7; i++) // 만약 다 ascending 상태면
			{
				if(music[i] == i+1)
					flag = false;
				else {
					flag = true;
					break;
				}
				if(i == 6)
					System.out.println("ascending");
			}
			
		}
		else if(music[0] == 8 && music[7] == 1)
		{
			for(int i = 1; i < 7; i++) // 만약 다 descending 상태면
			{
				if(music[i] == 8-i)
					flag = false;
				else {
					flag = true;
					break;
				}
				
				if(i == 6)
					System.out.println("descending");
			}		
		}
		
		if(flag)
			System.out.println("mixed");
		
	}

}
