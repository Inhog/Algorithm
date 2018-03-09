import java.util.Arrays;
import java.util.Scanner;

// Create by Inho 2018. 3. 7. 오후 2:43:42
// 6359 만취한 상범

public class Study_6359 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		for(int i=0;i<TC;i++){
			boolean[] room = new boolean[101];
			Arrays.fill(room, false);
			int count=0;
			int N = scanner.nextInt();
			for(int b=1;b<=N;b++){
				for(int j=1;j<=N;j++){
					if(j%b==0)
						room[j] = !room[j];
				}
			}
			for(int c=1;c<=N;c++){
				if(room[c]==true){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}

		

