import java.util.Scanner;

// Create by Inho 2018. 3. 8. 오후 2:11:45
// 2698 인접한 비트의 개수

public class Study_2698 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][][] DP = new int[101][101][2];
		for(int j=0;j<=100;j++){
			for(int k=0;k<=100;k++){
				DP[j][k][0] = DP[j][k][1]=0;
			}
		}
		int TC = scanner.nextInt();
		while(--TC>=0){
			int N = scanner.nextInt();
			int K = scanner.nextInt();			
			
			DP[1][0][0]=DP[1][0][1]=1;		// 초기값 초기화. [1][0][0] = 0 , [1][0][1] = 1
			for(int j=2;j<=N;j++){
				for(int k=0;k<j;k++){				// 맨 뒤 값이 1일때만 ++;
					DP[j][k][0] = DP[j-1][k][0] + DP[j-1][k][1];
					DP[j][k][1] = DP[j-1][k][0] + ((k>=1)?DP[j-1][k-1][1]:0);
				}
			}
			System.out.println(DP[N][K][0]+DP[N][K][1]);
		}
	}
}