import java.util.Scanner;

// Create by Inho 2018. 3. 8. 오후 2:11:45
// 2698 인접한 비트의 개수

public class Study_5557 {
	public static void main(String[] args) {
		int[] num = new int[101];
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[][] DP = new int[N][2];
		for(int i=0;i<=N;i++){
			num[i] = scanner.nextInt();
		}
	}
}