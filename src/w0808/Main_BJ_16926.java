package w0808;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_16926 {

	static int dx[] = {1, 0, -1, 0};			// 아래, 오른쪽, 위, 왼쪽
	static int dy[] = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int array[][] = new int[N + 2][M + 2];
		int check[][] = new int[N + 2][M + 2];
		int trgX = 1;
		int trgY = 1;
		int nx, ny, x = 0, y = 0, temp, tmp = 99;
		for (int i = 0; i < N + 2; i++) {
			if (!st.hasMoreElements())
				st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M + 2; j++) {
				if (i == 0 || i == N + 1 || j == 0 || j == M + 1) {
					array[i][j] = -1;
					check[i][j] = -1;
				}
				else {
					array[i][j] = Integer.parseInt(st.nextToken());
					check[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < R; i++) {
			if (check[trgX][trgY] == 0) {
				x = trgX++;
				y = trgY++;
				
			}
		
			if (array[x][y - 1] == -1 && array[x - 1][y] == -1) {
				while (array[x + 1][y] != -1 && check[x + 1][y] != 1) {
					nx = x + dx[0];
					ny = y + dy[0];
					tmp = array[x][y];
					temp = array[nx][ny];
					array[nx][ny] = tmp;
					check[nx][ny] = 1;
					x = nx;
					y = ny;
				}
			}
			else if (array[x][y - 1] == -1 && array[x + 1][y] == -1) {
				while (array[x][y + 1] != -1 && check[x][y + 1] != 1) {
					nx = x + dx[1];
					ny = y + dy[1];
					temp = tmp;
					tmp = array[nx][ny];
					array[nx][ny] = temp;
					check[nx][ny] = 1;
					x = nx;
					y = ny;
				}
			}
			else if (array[x][y + 1] == -1 && array[x + 1][y] == -1) {
				while (array[x - 1][y] != -1 && check[x - 1][y] != 1) {
					nx = x + dx[2];
					ny = y + dy[2];
					temp = tmp;
					tmp = array[nx][ny];
					array[nx][ny] = temp;
					check[nx][ny] = 1;
					x = nx;
					y = ny;
				}
			}
			else if (array[x - 1][y] == -1 && array[x][y + 1] == -1) {
				while (array[x][y - 1] != -1 && check[x][y - 1] != 1) {
					nx = x + dx[3];
					ny = y + dy[3];
					temp = tmp;
					tmp = array[nx][ny];
					array[nx][ny] = temp;
					check[nx][ny] = 1;
					x = nx;
					y = ny;
				}
			}
			
		}
		
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	
	}
}
