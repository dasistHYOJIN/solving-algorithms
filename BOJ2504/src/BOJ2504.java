import java.util.Scanner;
import java.util.Stack;

public class BOJ2504 {

	public static void main(String[] args) {
		/*
		 * ¹®ÀÚ¿­ÀÌ 30ÀÌÇÏ
		 * ´ÝÈû °ýÈ£¸é, p½ºÅÃ¿¡ ¿Å°Ü³õ°í ´ÙÀ½ ±ÛÀÚ È®ÀÎ
		 * 
		 * ¿­¸² °ýÈ£¸é, p½ºÅÃ¿¡ ÀúÀåµÈ ´ÝÈû °ýÈ£¿Í ºñ±³ -> ¸ÂÀ¸¸é Á¡¼ö ¾Æ´Ï¸é 0
		 */
		
		Scanner scan = new Scanner(System.in);
		String tf = scan.nextLine();

		Stack<Character> s = new Stack<Character>();
		Stack<Character> p = new Stack<Character>();
		int score = 0, total = 0;
		
		for(int i=0; i < tf.length();i++)
			s.push(tf.charAt(i));
			
		while(!s.empty())
		{
			switch (s.peek())
			{ //´ÝÈù °ýÈ£¸é
			case ')':
			case ']':
				p.push(s.pop());
				//System.out.println(score);
				break;
			// 	¿­¸° °ýÈ£¸é
			case '(':
				if(!p.empty() && p.pop() == ')')
				{
					s.pop();
					score = 2;
				}
				else
				{
					total = 0;
					break;
				}
				System.out.println(score);
				break;
			case '[':
				if(!p.empty() && p.pop() == ']')
				{
					s.pop();
					score = 3;
				}
				else
				{
					total = 0;
					break;
				}
				System.out.println(score);
				break;
			}
		}
		
		/*while(!s.empty())
		{
			//System.out.print(s.pop());
			
			if(s.peek() == ']' || s.peek() == ')') // ´ÝÈû °ýÈ£¸é
				p.push(s.pop());
			else if(s.peek() == '[')
			{
				if(p.peek() == ']')
				{
					p.pop();
					score += 3;
				}
				else score = 0;
			}
			else if(s.peek() == '(') // ¿­¸² °ýÈ£¸é
			{
				if(p.peek() == ')')
				{
					p.pop();
					score += 2;
				}
				else score = 0;
			}
				//System.out.print(s.pop());
*/			
			/*else // ¿­¸² °ýÈ£¸é
			{
				if(p.peek() == ']' && s.peek() == '[')
					score += 3;
				else if(p.peek() == ')' && s.peek() == '(')
					score += 2;
				else
					score = 0;
			}*/
			
		

	}

}
