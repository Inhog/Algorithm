import java.util.Scanner;

// Create by Inho 2018. 3. 26. 오후 7:22:50
// 1010 다리놓기

public class Study_1010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		scanner.nextLine();
		while(TC-->0){
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int[][] DP = new int[N+1][M+1];
			
			for(int i=0;i<=M;i++){
				DP[1][i] = i;
			}
			for(int i=2;i<=N;i++){
				for(int j=i;j<=M;j++){
					for(int k = j-1;k>=i-1;k--){
						DP[i][j] += DP[i-1][k];
					}
				}
			}
			System.out.println(DP[N][M]);
		}
		
	}
}