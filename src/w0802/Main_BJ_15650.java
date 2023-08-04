package w0802;

import java.util.Scanner;

public class Main_BJ_15650 {

	// func(int M, int N)
	// isSelected에 선택 된 것인지 체크, idx는 뽑힌 숫자 - 1
	// [ , ]
	public static int M;				// 뽑는 갯수 1
	public static int N;				// 숫자 크기 3
	public static int arr[];
	public static boolean isSelected[];
	
//	public static void function(int cnt) {
//		
//		if (cnt == M) {
//			for (int i = 0; i < M; i++) {
//				System.out.print(arr[i] + " ");
//			}
//			System.out.println();
//			return;
//		}
//		for (int i = 1; i <= N; i++) {			
//			if (isSelected[i - 1])
//				continue;
//			arr[cnt] = i;
//			isSelected[i - 1] = true;
//			function(cnt + 1);
//			isSelected[i - 1] = false;
//		}
//		 
//	}
	
	public static void function (int cnt, int start) {
		
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = start; i <= N; i++) {
			arr[cnt] = i;
			function(cnt + 1, i + 1);
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		isSelected = new boolean[N];
		function(0, 1);

	}


}
