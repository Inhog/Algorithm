import java.util.ArrayList;
import java.util.Scanner;

// Create by Inho 2018. 4. 27. 
// 1991 트리순회
public class Study_1991 {
	static class Node {
		char left;
		char right;
	}
	static Node[] Nodes;
	
	static void preorder(char root){
		if (root == '.') return;
		else {
			System.out.print(root);
			preorder(Nodes[root-'A'].left);
			preorder(Nodes[root-'A'].right);
		}
	}
	static void inorder(char root){
		if (root == '.') return;
		else {
			inorder(Nodes[root-'A'].left);
			System.out.print(root);
			inorder(Nodes[root-'A'].right);
		}
	}
	static void postorder(char root){
		if (root == '.') return;
		else {
			postorder(Nodes[root-'A'].left);
			postorder(Nodes[root-'A'].right);
			System.out.print(root);
		}
	}
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		Nodes = new Node[N];
		for(int i=0;i<N;i++){
			Nodes[i] = new Node();
		}
		
		for(int i =0;i<N;i++){
			String input = scanner.nextLine();
			String token[] = input.split(" ");
			Nodes[token[0].charAt(0)-'A'].left = token[1].charAt(0);
			Nodes[token[0].charAt(0)-'A'].right = token[2].charAt(0);
		}
		preorder('A');
		System.out.println("");
		inorder('A');
		System.out.println("");
		postorder('A');
	}
}
