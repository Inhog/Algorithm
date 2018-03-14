import java.util.Scanner;
import java.util.StringTokenizer;

// Create by Inho 2018. 3. 12. 오후 2:51:38
//  9084 동전

public class Study_9084 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		while(--TC>=0){
			int count = 0;
			int N = scanner.nextInt();
			int[] M = new int[N+1];
			for(int i=1;i<=N;i++){
				M[i] = scanner.nextInt();
			}
			int value = scanner.nextInt();
			int[] dp = new int[value+1];
			
			dp[0]=1;
			for(int i=1;i<=N;i++){
				for(int j=M[i];j<=value;j++){
					dp[j] +=dp[j-M[i]];
				}
			}
			System.out.println(dp[value]);
			}
			
		}
}
