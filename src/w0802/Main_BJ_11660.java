package w0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_11660 {

	public static int arr[][];
	public static int dp[][];
	public static int pos[][];

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[N][N];
		dp = new int[N][N];
		pos = new int[M][4];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (i == 0 && j == 0) {
					dp[i][j] = arr[i][j];
					continue;
				}
				else if (i == 0)
					dp[i][j] = dp[i][j - 1] + arr[i][j];
				else if (j == 0)
					dp[i][j] = dp[i - 1][j] + arr[i][j];
				else
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i][j];
			}
		}
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int sum = 0;
			if (x1 == 1 && y1 == 1) {
				sum = dp[x2 - 1][y2 - 1];
				System.out.println(sum);
				continue;
			}
			else if (x1 == 1)
				sum = dp[x2 - 1][y2 - 1] - dp[x2 - 1][y1 - 2];
			else if (y1 == 1)
				sum = dp[x2 - 1][y2 - 1] - dp[x1 - 2][y2 - 1];
			if (x1 != 1 && y1 != 1)
				sum = dp[x2 - 1][y2 - 1] - dp[x1 - 2][y2 - 1] - dp[x2 - 1][y1 - 2] + dp[x1 - 2][y1 - 2];
			
			System.out.println(sum);
			
		}

	}
}
