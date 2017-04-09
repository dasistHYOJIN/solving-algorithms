import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10828 {

	//static int stack[] = new int[10000];
	static int[] stack;
	static int i = -1;
	
	public static void main(String[] args) throws Exception {
		/*
		 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		 * push X: 정수 X를 스택에 넣는 연산이다.
		 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 스택에 들어있는 정수의 개수를 출력한다.
		 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
		 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine().trim());
		stack = new int[testCase];
		while (testCase != 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(br.readLine());
		
			String[] a = sb.toString().split(" ");
			switch (a[0]) {
			case "push" :
				push(Integer.parseInt(a[1]));
				break;
			case "pop" :
				System.out.println(pop());
				break;
			case "size" :
				System.out.println(size());
				break;
			case "empty" :
				System.out.println(empty());
				break;
			case "top" :
				System.out.println(top());
				break;
			default :
				break;
			}
			
			testCase--;
		}
	}

	static void push(int x){
		i++;
		stack[i] = x;
	}
	
	static int pop(){
		return (i == -1 ? i : stack[i--]);
	}
	
	static int size(){
		return i+1;
	}
	
	static int empty(){
		return (i == -1 ? 1 : 0);
	}
	
	static int top(){
		return (i == -1 ? i : stack[i]);
	}
}
