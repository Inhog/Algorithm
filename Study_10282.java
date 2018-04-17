import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Study_10282{
	static int INF = 98765432;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		scanner.nextLine();
		while(TC-->0) {
			int count = 0;
			int N = scanner.nextInt();
			int D = scanner.nextInt();
			int C = scanner.nextInt();
			scanner.nextLine();
			int[][] Graph = new int[N+1][N+1];
			int[] dis = new int[N+1];
			int[] post = new int[N+1];
			for(int i=0;i<=N;i++) {
				for(int j=0;j<=N;j++) {
					Graph[j][i] = INF;
				}
			}
			
			for(int i=0;i<D;i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int s = scanner.nextInt();
				scanner.nextLine();
				Graph[b][a] = s;
			}
			Queue<Integer> q = new LinkedList<Integer>();
			q.add(C);
			count++;
			while((!q.isEmpty())) {
				int node = q.poll();
				for(int i=0;i<=N;i++) {
					if(Graph[node][i] != INF) {
						if(dis[i] > dis[node] + Graph[node][i]) {
							dis[i] = dis[node] + Graph[node][i];
							q.add(i);
							post[i] = node;
						}else{
							dis[i] = dis[node] + Graph[node][i];
							q.add(i);
							count++;
							post[i] = node;
						}
					}
				}
			}
			int max = 0;
			for(int i=0;i<=N;i++) {
				if(max < dis[i]) {
					max = dis[i];
				}
			}
			System.out.println(""+count + " "+max);
		}
	}
}