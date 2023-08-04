package w0802;

import java.util.Scanner;

public class Main_BJ_11659 {
	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5
		 * i-j idx	val
		 * 1   0	1 dp[0]
		 * 12  1	dp[0] + arr[1]
		 * 13  2	dp[1] + arr[2]
		 * 14  3	dp[2] + arr[3]
		 * 15  4	dp[3] + arr[4]
		 * 
		 * 23  5	dp[2] - dp[0]
		 * 24  6	dp[3] - dp[0]
		 * 25  7	dp[4] - dp[0]
		 * 34  8	dp[3] - dp[1]
		 * 35  9	dp[4] - dp[2]
		 * 45  10	dp[4] - dp[3]
		 */
	
		// [5, 4, 3, 2, 1] -> 나올 수 있는 범위 : 1 + 2 + 3 + 4
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		// 수의 개수
		int M = sc.nextInt();		// 횟수

		int arr[] = new int[N];
		int sum = 0;
		int cnt = 0;
		int dp[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (i == 0)
				dp[i] = arr[i];
			else
				dp[i] = dp[i - 1] + arr[i];
		}
			
		
		for (int t = 0; t < M; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			if (i - 1 == 0)
				System.out.println(dp[j - 1]);
			else
				System.out.println(dp[j - 1] - dp[i - 2]);
		}
		
		
		
	}
}


/*for (int time = 0; time < M; time++) {
int i = sc.nextInt();
int j = sc.nextInt();
i--;
j--;
for (; i <= j; i++) {
	sum += arr[i];
}

System.out.println(sum);
sum = 0;
}*/