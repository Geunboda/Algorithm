package w0807;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_BJ_2493 {
	public static void main(String[] args) {
		
		Deque<Integer> stack = new ArrayDeque<>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int ans[] = new int[size];
		int cnt = 0;
		
		for (int i = 0; i < size; i++) {
			int num = sc.nextInt();
			if (i == 0)
				stack.push(num);
			else {
				if (stack.getLast() < num) {
					stack.push(num);
				}
				else {
					
				}
			}
			
		}
		
		
	}
}
