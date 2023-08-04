package pb17070;

import java.util.Scanner;

public class Problem_17070 {

	static int answer;
	static int size;
	static int array[][];
	static int visit[][];

	static int dx[] = { 0, 1, 1, 1, 0, -1, -1, -1 };
	static int dy[] = { 1, 1, 0, -1, -1, -1, 0, 1 };

	public void dfs(int x1, int y1, int x2, int y2) {

		if (x2 == size - 1 && y2 == size - 1) {
			answer++;
		} else {
			for (int i = 0; i < 8; i++) {
				int nx = x2 + dx[i];
				int ny = y2 + dy[i];

				// 현재 상태가 세로인 경우
				if (x2 == x1 + 1 && y1 == y2) {
					if (nx >= 0 && nx < size && ny >= 0 && ny < size && array[nx][ny] == 0) {
						if (nx == x2 + 1 && ny == y2) {
							if (visit[nx][ny] == 0) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}
						} else if (nx == x2 + 1 && ny == y2 + 1) {
							if (visit[nx][ny] == 0 && visit[nx - 1][ny] == 0 && visit[nx][ny - 1] == 0 ) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}

						}
					}
				}

				// 현재 상태가 대각선인 경우
				else if (x2 == x1 + 1 && y2 == y1 + 1) {
					if (nx >= 0 && nx < size && ny >= 0 && ny < size && array[nx][ny] == 0) {
						if ((nx == x2 + 1 && ny == y2) || (nx == x2 && ny == y2 + 1)) {
							if (visit[nx][ny] == 0) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}
						} else if (nx == x2 + 1 && ny == y2 + 1) {
							if (visit[nx][ny] == 0 && visit[nx - 1][ny] == 0 && visit[nx][ny - 1] == 0) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}
						}
					}
				}

				// 현재 상태가 가로인 경우
				else if (x2 == x1 && y2 == y1 + 1) {
					if (nx >= 0 && nx < size && ny >= 0 && ny < size && array[nx][ny] == 0) {
						if (nx == x2 && ny == y2 + 1) {
							if (visit[nx][ny] == 0) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}
						} else if (nx == x2 + 1 && ny == y2 + 1) {
							if (visit[nx][ny] == 0 && visit[nx - 1][ny] == 0 && visit[nx][ny - 1] == 0) {
								visit[nx][ny] = 1;
								dfs(x2, y2, nx, ny);
								visit[nx][ny] = 0;
							}
						}
					}
				} else {
					System.out.println("Error");
					return;
				}

			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size][size];
		visit = new int[size][size];

		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++) {
				array[i][j] = sc.nextInt();
				visit[i][j] = array[i][j];
			}

		visit[0][0] = 1;
		visit[0][1] = 1;
		Problem_17070 sol = new Problem_17070();
		sol.dfs(0, 0, 0, 1);

		System.out.println(answer);

	}

}
