import java.util.*;

// Create by Inho 2018. 4. 16. 오후 12:05:59
// 2935 소음

public class Study_2935 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String i = scanner.nextLine();
		String b = scanner.nextLine();
		
		int a_size = a.length();
		int b_size = b.length();
		
		if(i.equals("*")){
			System.out.print(1);
			for(int j = 0;j<a_size+b_size-2;j++){
				System.out.print(0);
			}
			System.out.println();
		}else if(i.equals("+")){
			if(a_size > b_size){
				System.out.print(1);
				for(int j=0;j<a_size-1;j++){
					if(j==a_size-b_size-1){
					System.out.print(1);
					}
					else{
						System.out.print(0);
					}
				}
			}else if(a_size < b_size){
				System.out.print(1);
				for(int j=0;j<b_size-1;j++){
					if(j==b_size-a_size-1){
					System.out.print(1);
					}
					else{
						System.out.print(0);
					}
				}
			}else{
				for(int j=0;j<a_size;j++){
					if(j==0){
						System.out.print(2);
					}else{
						System.out.print(0);
					}
				}
			}
		}
	}
}
