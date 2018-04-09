import java.util.*;

// Create by Inho 2018. 4. 9. 오후 7:19:33
// 1753 최단경로

public class Study_1753 {
	static class Edge{
		int v,w;
		Edge(int end, int value){
			this.v = end;
			this.w = value;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int V = scanner.nextInt();
		int E = scanner.nextInt();
		scanner.nextLine();
		int K = scanner.nextInt();
		scanner.nextLine();
		int[] sum = new int[V];
		int[] D = new int[V];
		ArrayList<Edge>[] map = new ArrayList[V];
		for(int i=0;i<V;i++){
			map[i] = new ArrayList<Edge>();
		}
		
		for(int i=0;i<E;i++){
			int u,v,w;
			u = scanner.nextInt();
			v = scanner.nextInt();
			w = scanner.nextInt();
			scanner.nextLine();
			map[u-1].add(new Edge(v,w));
		}
		
		
		
		method(K-1,map,D,sum);
		
		
		for(int i = 0;i<V;i++){
			if(K-1 == i){
				System.out.println(0);
				continue;
			}else if(sum[i] == 0){
				System.out.println("INF");
				continue;
			}
			System.out.println(sum[i]);
		}
		
		
	}

	private static void method(int k, ArrayList<Edge>[] map, int[] d, int[] sum) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(k);
		while(!q.isEmpty()){
			int node = q.peek();
			q.poll();
			for(int i=0;i<map[node].size();i++){
				int v=map[node].get(i).v-1;
				if(sum[v] > sum[node] + map[node].get(i).w){
					sum[v] = sum[node] + map[node].get(i).w;
					d[v] = node;
					q.add(v);
				}else{
					if(sum[v] == 0){
						sum[v] = sum[node] + map[node].get(i).w;
						d[v] = node;
						q.add(v);
					}
				}
			}
		}
	}
}
