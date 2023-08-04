package w0803;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_BJ_2961 {
	
	public static boolean isSelected[];
	public static int N;
	public static int arr[][];
	public static int set[];
	public static int cnt = 0;
	public static void pset(int count) {
		
		if (count == N) {
			int s = 0, b = 0, f = 0;
			for (int i = 0; i < N; i++) {
				if(isSelected[i] && s == 0) {
					s = arr[i][0];
					b += arr[i][1];
					continue;
				}
				if(isSelected[i]) {
					s *= arr[i][0];
					b += arr[i][1];
				}
				else
					f++;
			}
			if (f == 4)
				set[cnt++] = 999999999;
			else
				set[cnt++] = Math.abs(s - b);
//			System.out.println(Arrays.toString(isSelected));
			return;
		}
		else {
			isSelected[count] = true;
			pset(count + 1);
			isSelected[count] = false;
			pset(count + 1);
		}
			
		
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int min;
		N = Integer.parseInt(br.readLine());		//재료 갯수
		arr= new int[N][2];
		isSelected = new boolean[N];
		set = new int[(int)Math.pow(2, N)];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		pset(0);
//		System.out.println(Arrays.toString(set));		
		min = set[0];
		for (int i = 0; i < (int) Math.pow(2,N) - 1; i++) {
			if (set[i] < min)
				min = set[i];
		}
		
		System.out.println(min);
		
	}
}
