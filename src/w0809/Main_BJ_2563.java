package w0809;

import java.util.Scanner;

public class Main_BJ_2563 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int field[][] = new int[100][100];
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					field[x++][y] = 1;
				}
				y++;
				x = x - 10;
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (field[i][j] == 1)
					sum++;
			}
		}
		
		System.out.println(sum);
	}
}
