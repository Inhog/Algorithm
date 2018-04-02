import java.util.Scanner;

// Create by Inho 2018. 4. 2. 오전 8:36:58
// 선택정렬
/***
 * 시간 복잡도 O(n^2)
 * 주어진 데이터 중 최소값을 찾아 맨 앞에 위치한 값과 바꾸어줌
 * - 정렬 1회
 * 정렬된 데이터를 제외하고 위 과정을 반복함.
 */
public class Study_selection_sort {
	public static void main(String[] args) {
	
		Study_selection_sort study = new Study_selection_sort();
		
		int data[] ={5,4,3,2,1};
		
		study.sort(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
	}
	
	
	public void sort(int[] data){
		int size = data.length;
		int min; // 최소값을 가진 데이터의 인덱스 저장변수
		int temp;
		
		for(int i=0;i<size-1;i++){
			min = i;
			for(int j=i+1;j<size;j++){
				if(data[min] > data[j]){
					min =j;
				}
			}
			temp = data[min];
			data[min] = data[i];
			data[i] =temp; 
		}
	}
}