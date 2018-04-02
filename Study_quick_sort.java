
//Create by Inho 2018. 4. 2. 오후 6:44:24
//퀵정렬
/***
* 시간 복잡도 최악O(n^2), O(nlogn)
* 데이터 가운데서 하나의 원소를 고름(pivot 선정)
* povot 앞에는 pivot보다 작은 값이 오고, pivot 뒤에는 pivot보다 큰 값들이 오도록 둘을 분할한다.
* 분할된 두 개의 데이터에 대해 재귀함수를 통해 이 과정을 반복한다.
*/
public class Study_quick_sort {
	public static void main(String[] args) {
	
		Study_quick_sort study = new Study_quick_sort();
		
		int data[] ={5,4,3,2,1,11};
		
		study.sort(data,0,data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
	}
	
	
	public void sort(int[] data,int l, int r){
		int left = l;
		int right = r;
		int pivot = data[(l+r)/2];
		do{
			while(data[left] < pivot) left++;
			while(data[right] > pivot) right--;
			if(left <= right){
			int temp = data[left];
			data[left] = data[right];
			data[right] = temp;
			left++; right--;
			}
		}while(left <= right);
			
				if(l < right) sort(data,l,right);
				if(r > left) sort(data,left,r);
	}	
}