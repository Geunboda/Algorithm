package pb16637;

import java.util.Scanner;
import java.util.Stack;

// Baekjoon 삼성 A형 기출문제, 16637번, 괄호 추가하기(골드3)

public class Main {

	static int len;
	static String str;
	static char[] form;
	static int ans = 0;
	
	public int operate(String form) {
		int cnt = 0;
		char op;
		Stack<Character> stack = new Stack<>();
		stack.push(form.charAt(cnt++));
		
		while (stack.empty()) {
			if (stack.peek() == '(') {
				while (form.charAt(cnt) != ')')
					stack.push(form.charAt(cnt++));
			}
			if (stack.peek() == ')') {
				while (true) {
					if (stack.peek() == ')') 
						stack.pop();
					else if (stack.peek() == '+')
						op = '+';
					else if (stack.peek() == '-')
						op = '-';
					else if (stack.peek() == '+')
						op = '+';
				}
				
			}
		}
		for (int i = 0; i < form.length(); i++) {
			if (form.charAt(i) == '(') {
				
			}
			stack.push(form.charAt(i));
			
		}
		//sdfasdfasdfasdfasd
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		len = sc.nextInt();
		str = sc.next();
		form = new char[len * 2 + 1];
		int cnt = 0;
		
		for (int i = 0; i < len*2+1; i++) {
			if (i % 2 == 1) {
				form[i] = str.charAt(cnt++);
			}
		}
		
		System.out.println(str);
		
//		for (int i = 0; i < len*2+1; i++) {
//			System.out.print(form[i] + "/");
//		}
		
		System.out.println(new String(str));
		
	}
}
