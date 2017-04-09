import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10845 {

	static int[] stack;
	static int front = -1, back = -1;
	public static void main(String[] args) throws Exception {
		/*
		 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
		 * 명령은 총 여섯 가지이다.
		 * push X: 정수 X를 큐에 넣는 연산이다.
		 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * size: 큐에 들어있는 정수의 개수를 출력한다.
		 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
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
			case "front" :
				System.out.println(front());
				break;
			case "back" :
				System.out.println(back());
				break;
			default :
				break;
			}
			
			testCase--;
		}
		
		for(int i = 0; i<stack.length; i++)
			System.out.println(stack[i]);
	}
	

	static void push(int x){
		
		if (front == -1 && back == -1)
		{
			front++;
			back++;
			stack[front] = x;
		}
		else
		{
			back++;
			stack[back] = x;
		}
	}
	
	static int pop(){
		return ((back == -1) || (front > back)) ? -1 : stack[front++];
	}
	
	static int size(){
		return ((back == -1 && front == -1) ? 0 : back - front + 1);
	}
	
	static int empty(){
		return ((front == -1 && back == -1) || (front > back)) ? 1 : 0;
	}

	static int front(){
		return ((front == -1) || (front > back)) ? -1 : stack[front];
	}
	
	static int back(){
		return ((back == -1) || (front > back)) ? -1 : stack[back];
	}

}
