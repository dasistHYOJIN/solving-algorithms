import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1547 {
	static int ball = 1;
	
	public static void main(String[] args) throws Exception {
		/*
		 * 첫째 줄에 컵의 위치를 바꾼 횟수 M이 주어지며, M은 50보다 작거나 같은 자연수이다.
		 * 둘째 줄부터 M개의 줄에는 컵의 위치를 바꾼 방법 X와 Y가 주어지며, X번 컵과 Y번 컵의 위치를 서로 바꾸는 것을 의미한다.
		 * 컵을 이동시키는 중에 공이 컵에서 빠져나오는 경우는 없다. X와 Y의 값은 3보다 작거나 같고, X와 Y가 같을 수도 있다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		StringBuilder change;
		while(testCase-- != 0)
		{
			change = new StringBuilder(br.readLine().trim());
			String num[] = change.toString().split(" ");
			
			temp(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
		}
		
		System.out.println((ball >= 1 && ball <= 3) ? ball : -1);
	}
	
	private static void temp(int a, int b) {
		// 만약에 받은 숫자 2개 중에 ball과 일치하는 게 있으면 바꿔
		if(a == ball) ball = b;
		else if(b == ball) ball = a;
	}

}
