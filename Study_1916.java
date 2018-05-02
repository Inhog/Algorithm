import java.util.PriorityQueue;
import java.util.Scanner;
// Create by Inho 2018. 5. 2. 

public class Study_1916 {

	
	public static void main(String[] args){
		int INF = 1000000001;
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt()+1;
		
		int M = sc.nextInt();
		int[] d = new int[N];
		int[][] map = new int[N][N];
		
		for(int i=0;i<N;i++){
			d[i] = INF;
			for(int j=0;j<N;j++){
				map[i][j] = INF;
				if(i==j){
					map[i][j] =0;
				}
			}
		}
		
		for(int i=0;i<M;i++){
			int first = sc.nextInt();
			int second = sc.nextInt();
			int value = sc.nextInt();
			if(map[first][second] > value)
			map[first][second]=value;
		}
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.offer(start);
		d[start] =0;
		while(!q.isEmpty()){
			int node = q.poll();
			for(int i=1;i<N;i++){
				if(d[i] > map[node][i] + d[node]){
					d[i] = map[node][i] + d[node];
					q.offer(i);
				}
			}
		}
		System.out.println(d[end]);
	}
}
