package w0804;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_BJ_2164 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Deque<Integer> queue = new ArrayDeque<Integer>();
		
		for (int i = 1; i <= N; i++)
			queue.add(i);
		
		while (true) {
			if (queue.size() == 1) {
				System.out.println(queue.peek());
				return;
			}
			queue.poll();
			if (queue.size() == 1) {
				System.out.println(queue.peek());
				return;
			}
			queue.add(queue.poll());
			if (queue.size() == 1) {
				System.out.println(queue.peek());
				return;
			}
		}
		
	}
}
