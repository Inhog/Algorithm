import java.util.Scanner;

// Create by Inho 2018. 3. 9. 오후 2:46:39
//  9252 최장 공통 부분 수열 LCS2(Longest Common Subsequence)

public class Study_9252 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		
		int[][] LCS = new int[first.length()+1][second.length()+1];
		String[][] LCS1 = new String[first.length()+1][second.length()+1];
		
		for(int i = 0;i<=second.length();i++){
			LCS[0][i] = 0;
			for(int j=0;j<=first.length();j++){
			LCS1[j][i] = "";
			}
		}
		
		
		for(int i =1;i<=first.length();i++){
			for(int j=1;j<=second.length();j++)
			{
				if(first.charAt(i-1) == second.charAt(j-1)){
					LCS[i][j] = LCS[i-1][j-1] + 1;
					LCS1[i][j] = LCS1[i-1][j-1] + first.charAt(i-1);
				}
				else{
					LCS[i][j] = Math.max(LCS[i][j-1], LCS[i-1][j]);
					if(LCS1[i][j-1].length() >= LCS1[i-1][j].length()){
						LCS1[i][j] = LCS1[i][j-1];
					}else{
						LCS1[i][j] = LCS1[i-1][j];
					}
				}
			}
		}
		System.out.println(LCS[first.length()][second.length()]);
		System.out.println(LCS1[first.length()][second.length()]);
	}
}