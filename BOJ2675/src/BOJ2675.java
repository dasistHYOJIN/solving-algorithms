import java.util.Scanner;

public class BOJ2675 {

	public static void main(String[] args) { // TODO 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		
        int caseNum = scanner.nextInt();
		
		while (caseNum != 0)
		{
			// 문자열 S를 입력받은 후에
			int r = scanner.nextInt();
			String s = scanner.next(); // 공백미포함
			// s = scan.nextLine(); 공백포함
			String t = new String();
			
			// 각 문자를 R번 반복해 새 문자열 T를 만든 후
			for(int i = 0; i < s.length(); i++)
			{
				for(int j = 0;j<r; j++)
				{
					t += s.charAt(i);
				}
			}
			caseNum--;
			// 출력
			System.out.println(t);
		}
		
	}

}
