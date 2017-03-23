import java.util.Scanner;

public class BOJ10809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String s = new String(); //char s[] = new char[100];
		int alphabet[] = new int[26];
		
		// 전체 배열 -1로 전부 초기화
		for (int i=0;i<26;i++)
		{
			alphabet[i] = -1;
			//System.out.print(alphabet[i]+" ");
		}
		
		// 1. 문자열을 입력받아
		s = scanner.nextLine();
		//System.out.println(s);
		
		// 5. 반복
		for (int i = 0; i < s.length(); i++)
		{
			int a = s.charAt(i) - 97;// alphabet배열 안에 각 알바벳의 위치(뭐래)
			// 2. 입력받은 문자열의 문자에 해당하는 알파벳이 확인됐는지 체크
			if(alphabet[a] == -1)
			{ // 3. 안됐으면(-1이면) 문자의 순서 집어넣기
				alphabet[a] = i;
			}
			// 4. 확인됐으면 넘어감
		}
		for (int i = 0; i < 26; i++)
			System.out.print(alphabet[i]+" ");
	}
}

