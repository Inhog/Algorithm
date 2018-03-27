import java.util.Scanner;

// Create by Inho 2018. 3. 27. 오전 10:22:05
// 10828 스택

public class Study_10828 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int TC = scanner.nextInt();
		scanner.nextLine();
		int[] stack = new int[10000];
		int state = 0;
		while(TC--> 0){
			String message = scanner.nextLine();
			String[] tokens = message.split(" ");
			switch(tokens[0]){
			case "size":
				System.out.println(state);
				break;
			case "pop":
				if(state == 0){ 
					System.out.println("-1");
					break;
				}
				else{
					state--;
					System.out.println(stack[state]);
					stack[state]=0;
					break;
				}
			case "empty":
				if(state ==0){
					System.out.println("1");
					break;
				}
				else{
					System.out.println("0");
					break;
					}
			case "top":
				if(state == 0){
					System.out.println("-1");
					break;
				}
				else{
					System.out.println(stack[state-1]);
					break;
				}
			case "push":
				int value = Integer.valueOf(tokens[1]);
				stack[state] = value;
				state++;
				break;
			}
		}
	}
}