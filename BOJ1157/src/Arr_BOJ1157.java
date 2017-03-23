import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arr_BOJ1157 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim().toUpperCase();
		
		int num[] = new int[26];
		for(int i = 0; i < str.length(); i++)
			num[str.charAt(i) - 'A']++;
		
		int max = 0;
		char c_max = 'a';
		boolean flag = false;
		for(int i = 0; i < 26; i++)
			if(num[i] > max)
			{
				max = num[i];
				c_max = (char) (i+'A');
				flag = false;
			}
			else if(num[i] == max)
				flag = true;
		
		System.out.println(flag ? "?" : c_max);
		
		//	System.out.print(num[i]+" ");
/*		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		
		int num[] = new int[26];
		for(int i = 0; i < str.length(); i++)
			num[str.charAt(i)-65]++;
		
		int max = 0; // 알파벳 자리번호/순서
		boolean a = false;
		for(int i = 0; i < 26; i++)
		{
			
			 * 만약에 max번째 숫자보다 i번째 수가 더 크면
			 * max = i
			 
			if(num[i] > num[max])
			{
				max = i;
				a = false;
				//System.out.println(max + " " + i);
			}
			else if (num[i] == num[max])
				a = true;
			else
				a = false;
		}
		for(int i=0;i<26;i++)
			System.out.print(num[i]+" ");
		System.out.print("\n");
		System.out.println(a ? "?" : (char)(max+65));
		*/
	}
}
