import java.util.Scanner;


public class Study_9205{
	static int MAX = 98765;
	static class location{
		int x;
		int y;
		location(){	}
		location(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	public static void floyd(int[][] d, int n) {
		for(int k=0;k<n;k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++){
					if(d[i][j] > d[i][k] + d[k][j]) {
						d[i][j] = d[i][k] + d[k][j];
					}
				}
			}
		}
	}
	public static int getdistance(location a, location b) {
		int dis_x,dis_y;
		if(a.x > b.x){
			 dis_x = a.x -b.x;
		}else {
			 dis_x = b.x - a.x;
		}
		if(a.y > b.y) {
			 dis_y = a.y -b.y;
		}else {
			 dis_y = b.y - a.y;
		}
		return dis_x + dis_y;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		scanner.nextLine();
		
		while(TC-->0) {
			int N = scanner.nextInt();
			int[][] distance = new int[N+2][N+2];
			location[] loc = new location[N+2];
			
			for(int i=0;i<N+2;i++) {
				loc[i] = new location(scanner.nextInt(),scanner.nextInt());
			}
			
			for(int i=0;i<N+2;i++) {
				for(int j =0 ;j<N+2;j++) {
					if(i!=j) {
						distance[i][j] = MAX;
					}
				}
			}
			for(int i=0;i<N+2;i++) {
				for(int j =0 ;j<N+2;j++) {
					if(i==j) {
						continue;
					}
					int dis = getdistance(loc[i],loc[j]);
					
					if(dis <= 1000) {
						distance[i][j] =1;
					}
				}
			}
			
			floyd(distance,N+2);
			
			if(0<distance[0][N+1] && distance[0][N+1] < MAX) {
				System.out.println("happy");
			}else {
				System.out.println("sad");
			}
		}
	}
}