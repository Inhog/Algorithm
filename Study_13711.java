import java.util.Scanner;

// Create by Inho 2018. 3. 9. 오후 5:09:35
//  13711 최장 공통 부분 수열 LCS4(Longest Common Subsequence)

public class Study_13711 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String first = new String("");
		String second = new String("");
		int[][] LCS1 = new int[N+1][N+1];
		
		for(int j=0;j<=1;j++){
		for(int i = 1; i<=N;i++){
			if(j==0){
				first += scanner.nextInt();
				}
			else{
				second += scanner.nextInt();
				}
			}
		}
		
		for(int i = 0;i<=N;i++){
			LCS1[0][i] = 0;
		}

		for(int i =1;i<=N;i++){
			for(int j=1;j<=N;j++){
				if(first.charAt(i-1) == second.charAt(j-1)){
					LCS1[i][j] = LCS1[i-1][j-1] + 1;
				}
				else{
					LCS1[i][j] = Math.max(LCS1[i-1][j],LCS1[i][j-1]);
				}
			}
		}
		System.out.println(LCS1[N][N]);
	}
}
