import java.util.*;

// Create by Inho 2018. 4. 9. 오전 8:56:17
// 7576 토마토


public class Study_7576 {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static class Tomato{
		int x,y;
		Tomato(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		scanner.nextLine();
		int[][] Box = new int[N][M];
		Queue<Tomato> q = new LinkedList<Tomato>();
		Tomato[] tomato = new Tomato[N*M];
		int count =0;
		int max =0;
		for(int i = 0; i< N ;i++){
			for(int j = 0 ;j<M;j++){
				Box[i][j] = scanner.nextInt();
				
				
				if(Box[i][j] == 1){
					tomato[count++] = new Tomato(j,i);
					q.add(tomato[count-1]);
				
				}
			}
			scanner.nextLine();
		}
		
		while(!q.isEmpty()){
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();
			for(int j=0;j<4;j++){
				int next_x = x+dx[j];
				int next_y = y+dy[j];
				if(next_x >= 0 && next_y >=0 && next_x <M && next_y <N){
					if(Box[next_y][next_x] == 0){
						Box[next_y][next_x] = Box[y][x]+1;
						q.add(new Tomato(next_x,next_y));
					}else{
						if(Box[next_y][next_x] > Box[y][x]+1){
							Box[next_y][next_x] = Box[y][x]+1;
							q.add(new Tomato(next_x,next_y));
						}
					}
				}
				
			}
		}
		for(int i = 0; i< N ;i++){
			for(int j = 0 ;j<M;j++){
				if( max < Box[i][j]){
					max = Box[i][j];
				}
			}
		}
		for(int i = 0; i< N ;i++){
			for(int j = 0 ;j<M;j++){
				if( Box[i][j] == 0){
					max = 0;
				}
			}
		}
		System.out.println(max-1);
	}
}
