import java.util.Scanner;

// Create by Inho 2018. 3. 7. 오후 2:43:42
// 2156 포도주시식

public class Study_2156 {
	
	public static void main(String[] args) {
		int[] wine = new int[10001];
		int[] DP = new int[10001];
		
		Scanner scanner = new Scanner(System.in);
		
		int Maxwine = scanner.nextInt();
		
		for(int i=1;i<=Maxwine;i++){
			int wine_value = scanner.nextInt();
			wine[i] = wine_value;
		}
		
		DP[0] = wine[0] = 0;
		for(int i=1;i<3&&i<=Maxwine;i++){
			if(i == 2)
				DP[2] = DP[1]+ wine[2];
			else
				DP[1]=wine[1];
		}
		for(int i=3;i<=Maxwine;i++){
			int value = DP[i-1] > DP[i-2]+wine[i]?DP[i-1]:DP[i-2]+wine[i];
				
			DP[i] = value > DP[i-3]+wine[i-1]+wine[i]?value:DP[i-3]+wine[i-1]+wine[i];
			}
		System.out.println(DP[Maxwine]);
	}
}

		

