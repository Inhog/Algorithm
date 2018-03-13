import java.util.Scanner;

public class Study_1138 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count =1;
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			int value = scanner.nextInt();
			int a = 0;
			for(int j=0;j<N;j++) {
				if(arr[j] == 0) {
					if(a==value) {
						arr[j] = count;
						count++;
					}
					a++;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d ",arr[i]);
		}
	}
}
