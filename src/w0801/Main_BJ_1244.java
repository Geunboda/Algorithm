package w0801;

import java.util.Scanner;

public class Main_BJ_1244 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		
		int num = sc.nextInt();				//학생 수
		
		for (int i = 0; i < num; i++) {
			int sex = sc.nextInt();
			int point = sc.nextInt();
			
			if (sex == 1) {					//남자
				for (int j = 0; j < size; j++) {
					if ((j + 1) % point == 0) {
						if (arr[j] == 0)
							arr[j] = 1;
						else if (arr[j] == 1)
							arr[j] = 0;
					}
				}
			}
			else if (sex == 2) {			//여자
				if (arr[point - 1] == 0)
					arr[point - 1] = 1;
				else
					arr[point - 1] = 0;
				int tmp = 1;
				while (true) {
					
					
					if ((point - 1 - tmp < 0) || (point + tmp > size) || (arr[point - 1 - tmp] != arr[point - 1 + tmp]))
						break;
					else {
						if (arr[point - 1 - tmp] == 0)
							arr[point - 1 - tmp] = 1;
						else
							arr[point - 1 - tmp] = 0;
						
						if (arr[point - 1 + tmp] == 0)
							arr[point - 1 + tmp] = 1;
						else
							arr[point - 1 + tmp] = 0;
					}
					tmp++;
						
				}
			}
			
		}
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (count > 19) {
				System.out.println();
				count = 0;
			}
			System.out.print(arr[i] + " ");
			count++;
		}
	}
}
