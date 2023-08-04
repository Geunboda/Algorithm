package w0803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_12891 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int len = Integer.parseInt(st.nextToken());
		int partLen = Integer.parseInt(st.nextToken());
		String str = br.readLine();
		
		int DNA[] = new int[4];		// {A C G T}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++)
			DNA[i] = Integer.parseInt(st.nextToken());
		
		String part[] = new String[len - partLen + 1];
		
		for (int i = 0; i < len - partLen + 1; i++) {
			part[i] = str.substring(i, i+partLen);
		}
		
		
	}
}
