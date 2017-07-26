import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ6321 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter();
		
		int n = Integer.parseInt(br.readLine());
		StringBuffer result = new StringBuffer();
		int t = 1;
		
		while(n-- != 0)
		{
			String name = br.readLine();
			result.append("String #" + t + "\n");
			
			for(int i = 0; i < name.length(); i++)
				if(name.charAt(i) == 'Z')
					result.append("A");
				else
					result.append((char)(name.charAt(i) + 1));
			
			result.append("\n" + "\n");
			t++;
		}
		
		System.out.println(result);

	}

}
