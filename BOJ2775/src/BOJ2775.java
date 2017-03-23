import java.util.Scanner;

public class BOJ2775 {

	public static void main(String[] args) {
		/*
		 * 층, 방번호, 인원수 배열
		 * 배열 초기화 -> 1,2,3,4,5...
		 * resiNum[방번호] ← resiNum[방번호-1] + resiNum[방번호-1]
		 */

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int[] resiNum;
		
		while (num!=0)
		{
			int floor= scanner.nextInt();
			int room = scanner.nextInt();
			
			if(floor<1 || 14<floor || room<1 || 14<room)
			{
				System.out.println("다시 입력해주세요");
			}
			
			// 배열 초기화 : 0층
			resiNum = new int[room];
			for(int i = 0; i < room; i++)
				resiNum[i] = i+1;
			
			while (0!=floor)
			{ // 1번방은 모두 같으니까 바꿀 필요가 없음
				for(int i = 1; i < room; i++)
					resiNum[i] = resiNum[i-1] + resiNum[i];
				floor--;
			}
			
			System.out.println(resiNum[room-1]);
			num--;
			/*for(int i = 0; i < room; i++)
				System.out.print(resiNum[i] + " ");*/
			
		}
	}
}
