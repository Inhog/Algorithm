import java.util.Scanner;

// Create by Inho 2018. 3. 7. 오전 9:13:07
// 백준 9461번 파도반 수열 

public class Study_9461 {

	public static void main(String[] args) {
		long[] P = new long[101];
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		int TC = Integer.parseInt(temp);
		
		P[0] = 0;
		P[1] = 1;
		P[2] = 1;
		P[3] = 1;
		P[4] = 2;
		for(int i=5;i<P.length;i++){
			P[i]= P[i-5]+P[i-1];
		}
		
		for(int j =0;j<TC;j++){
		int num = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(P[num]);
		}
		
	}

}
