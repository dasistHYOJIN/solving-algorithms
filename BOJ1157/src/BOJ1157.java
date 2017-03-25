import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BOJ1157 {

	public static void main(String[] args) {
		/*
		 * HashMap에 알파벳 빈도 수 저장
		 * map의 value 비교 출력
		 */
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		/*HashMap<Character, Integer> map = new HashMap<Character, Integer>(); // HashMap은 순서를 저장하지 않는다*/
		for(int i = 0; i < str.length(); i++)
		{
			if(map.get(str.charAt(i)) == null)
				map.put(str.charAt(i), 1);
			else
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
		}
		
		System.out.println(map);
		
		Set<Entry<Character, Integer>> set = map.entrySet();
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		int max = 0;
		char c_max = 0;
		boolean a = false;
		while (itr.hasNext()) //for(int i = 0; i < map.size(); i++)
		{
			Map.Entry entry = (Map.Entry)itr.next();
			int temp = (int)entry.getValue();
			if(temp > max)
			{
				max = temp;
				c_max = (char)entry.getKey();
				a = false;
			}
			else if (temp == max)
				a = true;
		}

		System.out.println(map);
		System.out.println(a ? "?" :c_max);

	}

}
