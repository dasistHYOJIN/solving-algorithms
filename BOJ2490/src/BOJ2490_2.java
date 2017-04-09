import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2490_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		StringBuilder yoot = new StringBuilder();
		// 한꺼번에 모든 입력값을 stringBuilder 객체로 받고
		// 3개를 기준으로 split

		for (int count = 0, j = 0; j < 3; count = 0, j++) {
			yoot.setLength(0);
			yoot.append(br.readLine().trim());
			
			for (int i = 0; i < 7; i += 2)
				if (yoot.charAt(i) == '1') count++;
			
			switch (count) {
			case 0:
				result.append("D\n");
				break;
			case 1:
				result.append("C\n");
				break;
			case 2:
				result.append("B\n");
				break;
			case 3:
				result.append("A\n");
				break;
			case 4:
				result.append("E\n");
				break;
			}
		}

		System.out.println(result);
	}
}
