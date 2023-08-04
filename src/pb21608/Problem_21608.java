package pb21608;

import java.util.ArrayList;
import java.util.Scanner;

class seat{
	int size;
	

	seat(int size) {
		size = this.size;
	}
	
}
public class Problem_21608 {

	public static void main(String[] args) {
		
		
//		seat a = new seat();
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int head = size * size;
		int array [][] = new int[size][size];

		ArrayList<Integer>[] list = new ArrayList[head];
		for (int i = 0; i < size; i++)
			list[i] = new ArrayList<Integer>();

		for (int i = 0; i < size; i++)
			for (int j = 0; j < 5; j++)
				list[i].add(sc.nextInt());

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				
			}
		}
		

	}

}
