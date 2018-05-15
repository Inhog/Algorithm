import java.util.*;

// 11375 열혈강호
// Create by Inho 2018. 5. 15. 
public class Study_11375 {
	static boolean[] visited;
	static ArrayList<Integer>[] edge;
	static int[] A,B;
	static int count =0;
	static boolean dfs(int start){
		visited[start]=true;
		for(int i=0;i<edge[start].size();i++){
			int next =edge[start].get(i);
			if(B[next]==-1||(!visited[B[next]] && dfs(B[next]))){
				A[start] = next;
				B[next] = start;
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		A = new int[1001];
		B = new int[1001];
		visited = new boolean[1001];
		edge = new ArrayList[1001];
		for(int i=0;i<N+1;i++){
			edge[i] = new ArrayList<Integer>();
			A[i] = -1;
			B[i] = -1;
		}
		for(int i=0;i<N;i++){
			int S = sc.nextInt();
			for(int j=0;j<S;j++){
				int value = sc.nextInt();
				edge[i].add(value);
			}
		}
		for(int i=0;i<N;i++){
			if(A[i] == -1){
				for(int j=0;j<visited.length;j++){
					visited[j] = false;
				}
				if(dfs(i)) count++;
			}
		}
		System.out.println(count);
	}
}
