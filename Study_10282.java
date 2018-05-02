import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
// Create by Inho 2018. 5. 2. 

public class Study_10282{
	static class node{
		int a,s;
		node(int a, int s){
			this.a = a;
			this.s = s;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		while(TC-->0) {
			int N = sc.nextInt()+1;
			int D = sc.nextInt();
			int C = sc.nextInt();
			int[] sum = new int[N];
			boolean[] state = new boolean[N];
			ArrayList<node>[] map = new ArrayList[N];
			for(int i=0;i<N;i++){
				map[i] = new ArrayList<node>();
				sum[i] = 987654321;
			}
			
			for(int i=0;i<D;i++){
				int a =sc.nextInt();
				int b = sc.nextInt();
				int s = sc.nextInt();
				
				map[b].add(new node(a,s));
			}
			
			PriorityQueue<Integer> q = new PriorityQueue<>();
			q.add(C);
			sum[C] =0;
			while(!q.isEmpty()){
				int node = q.poll();
				state[node] = true;
				for(int i=0;i<map[node].size();i++){
					int next = map[node].get(i).a;
					if( sum[next] > sum[node] + map[node].get(i).s){
						sum[next] = sum[node] + map[node].get(i).s;
						q.add(next);
					}
				}
			}
			int count =0;
			int max = 0;
			for(int i=0;i<N;i++){
				if(state[i] != false){
					count++;
				}
				if(sum[i] != 987654321 && max < sum[i]){
					max = sum[i];
				}
			}
			System.out.println(count + " " + max);
		}
	}
}