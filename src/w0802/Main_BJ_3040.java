package w0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_3040 {

	public static int arr[];
	public static boolean isSelected[];
	public static int real[];
	
	public static void Solution(int cnt) {
		
		if (cnt == 7) {
			return;
		}
		else {
			isSelected[cnt] = true;
			Solution(cnt + 1);
			isSelected[cnt] = false;
			Solution(cnt + 1);
			
		}
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		real = new int[7];
		
	}
}
