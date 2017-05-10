import java.util.Scanner;


public class BOJ1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int ball = 1;
		int num1 = 0;
		int num2 = 0;
		
		for(int i = testcase; i > 0; i--)
		{
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 == ball)
				ball = num2;
			else if(num2 == ball)
				ball = num1;
		}
		
		System.out.println(ball);
		
	}

}
