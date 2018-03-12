import java.util.Scanner;

// Create by Inho 2018. 3. 9. 오후 4:10:07
//  1958 최장 공통 부분 수열 LCS3(Longest Common Subsequence)

public class Study_1958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		String second = scanner.nextLine();
		String third = scanner.nextLine();
		
		System.out.println(LCS(first,second,third));
		
	}
	public static int LCS(String first, String second, String third){
		
		int[][][] LCS = new int[first.length()+1][second.length()+1][third.length()+1];
//		String[][] LCS1 = new String[first.length()+1][second.length()+1];
		
		for(int i = 0;i<=third.length();i++){
			LCS[0][0][i] = 0;
//			for(int j=0;j<=first.length();j++){
//			LCS1[j][i] = "";
//			}
		}
		
		for(int i =1;i<=first.length();i++){
			for(int j=1;j<=second.length();j++){
				for(int k=1;k<=third.length();k++){
					if((first.charAt(i-1) == second.charAt(j-1)) &&
							(second.charAt(j-1) == third.charAt(k-1)))
							{
					LCS[i][j][k] = LCS[i-1][j-1][k-1] + 1;
					//LCS1[i][j] = LCS1[i-1][j-1] + first.charAt(i-1);
					}
					else{
					LCS[i][j][k] = Math.max(LCS[i-1][j][k],Math.max(LCS[i][j-1][k], LCS[i][j][k-1]));
//					if(LCS1[i][j-1].length() >= LCS1[i-1][j].length()){
//						LCS1[i][j] = LCS1[i][j-1];
//					}else{
//						LCS1[i][j] = LCS1[i-1][j];
//					}
					}
				}
			}
		}
		return LCS[first.length()][second.length()][third.length()];
	}
}