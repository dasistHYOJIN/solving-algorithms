/*import java.util.Scanner;

public class BOJ2908 {

	public static void main(String[] args) {		
		
		 * 숫자를 2개 입력받아서
		 * 1-1. 자릿수 비교	 * 1-2. 자리값 비교 -> 자릿수가 같을 때는 가장 작은 자릿수가 큰 쪽이 더 큼
		 * 2-1. 숫자를 뒤집어	 * 2-2. 비교
		 
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num1_1 = 0, num2_1 = 0;
		int temp;
		
		while(num1 > 0)
		{
			temp = num1%10;
			num1 = num1/10;
			num1_1 = num1_1*10 + temp;
		}
		while(num2 > 0)
		{
			temp = num2%10;
			num2 = num2/10;
			num2_1 = num2_1*10 + temp;
		}

		System.out.println(num1_1>num2_1? num1_1 : num2_1);
	}

}
*/