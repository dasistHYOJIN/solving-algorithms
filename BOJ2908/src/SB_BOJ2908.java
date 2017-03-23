import java.util.Scanner;

public class SB_BOJ2908 {

	public static void main(String[] args) {		
		/*
		 * 숫자를 문자열로 2개 입력받아서
		 * 1-1. 숫자를 뒤집어	 * 1-2. 비교
		 */
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		StringBuffer sb = new StringBuffer(""+num1);
		String st = sb.reverse().toString();
		num1 = Integer.parseInt(st);
		
		sb = new StringBuffer(""+num2);
		st = sb.reverse().toString();
		num2 = Integer.parseInt(st);
		
		System.out.println(num1>num2 ? num1 : num2);
	}

}
