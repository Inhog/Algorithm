import java.util.*;

// Create by Inho 2018. 4. 4. 오후 7:36:41
// 1260 DFS 와 BFS


public class Study_DFS_BFS {
	static int[][] Graph = new int[1001][1001];
	static int[] BfsVisit = new int[1001];
	static int[] DfsVisit = new int[1001];
	static int N,M,V;
	
	static void DFS(int node){
		DfsVisit[node] = 1; // node 방문
		System.out.printf("%d ",node);
		for(int i=1;i<=N;i++){
			if(DfsVisit[i] != 1 && Graph[node][i] == 1)
				DFS(i);
		}
	}
	
	static void BFS(int node){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(node);
		BfsVisit[node] = 1;
		System.out.printf("%d ",node);
		while(!q.isEmpty()){
			int value = q.peek();		// 삭제하지 않고 맨 앞 값을 반환함.
			q.poll();
			for(int i=1;i<=N;i++){
				if(BfsVisit[i] != 1 && Graph[value][i] == 1){		// 이전 연결된 노드와 다음 노드가 연결되어있고, 방문한적이 없으면.
					BfsVisit[i] = 1;
					System.out.printf("%d ",i);
					q.add(i);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Study_DFS_BFS study = new Study_DFS_BFS();
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		M = scanner.nextInt();
		V = scanner.nextInt();
		scanner.nextLine();
		
		for( int i=1;i<=M;i++){
			int node1,node2;
			node1 = scanner.nextInt();
			node2 = scanner.nextInt();
			scanner.nextLine();
			
			Graph[node1][node2] = Graph[node2][node1] =1;
		}
		
		DFS(V);
		System.out.println("");
		BFS(V);
	}
	

}
