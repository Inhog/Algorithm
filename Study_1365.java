import java.util.Scanner;

// Create by Inho 2018. 3. 13. 오후 4:47:59
// 1365 꼬인 전깃줄

public class Study_1365 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		int[] lis = new int[100001];
		int[] arr = new int[100001];
		int a;
		for(int i=0;i<TC;i++){
			arr[i]=scanner.nextInt();
		}
		int size=1;
		lis[0] =-1;
		lis[size] = 987654321;
		for(int i=0;i<100001;i++){
			if(arr[i] != 0){
				if(lis[size] >= arr[i]){
					a=lowerbound(lis,0,size,arr[i]);
					lis[a] = arr[i];
				}
				else
				lis[++size] = arr[i];
			}
		}
		System.out.println(TC-size);
	}
			
	public static int lowerbound(int[] arr, int start, int end,int target){
		while(start < end){
			int mid =(start+end)/2;
			
			int midVal = arr[mid];
			
			if(midVal < target){
				start = mid+1;
			}else{
				end = mid;
			}
		}	return start;
	}
}
