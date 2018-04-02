import java.util.Scanner;

// Create by Inho 2018. 4. 2. 오후 4:43:33
// 삽입정렬
/***
 * 시간 복잡도 O(n^2)
 * 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여,
 * 자신의 위치를 찾아 삽입함.
 * 배열의 두 번째 데이터 부터 연산을 시작함.
 */
public class Study_Insertion_sort {
	public static void main(String[] args) {
	
		Study_Insertion_sort study = new Study_Insertion_sort();
		
		int data[] ={5,4,3,2,1};
		
		study.sort(data);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
	}
	
	
	public void sort(int[] data){
		int size = data.length;
		int temp;
		int j;
		for(int i=1;i<size;i++){
			temp = data[i];
			for(j=i-1;j>=0 && temp <data[j];j--){
				data[j+1] = data[j];
			}		// 위 조건식은 이동해야 할 값보다 작으면 한칸 위로 올리고 
			data[j+1] =temp;		// 이동해야 할 값보다 크면 반복문을 종료시키고 종료한 위치보다 1높은 인덱스에 값을 넣어준다(삽입).
		}
	}
}