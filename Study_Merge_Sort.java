
// Create by Inho 2018. 4. 3. 오후 6:11:11
// 합병정렬

/***
* 시간 복잡도 최악O(nlogn), O(nlogn)
* 분할정복법(Divide-And-Conquer)
* 퀵이랑 비슷하지만 이건 리스트의 길이를 쪼갠후에
* 정렬하면서 합병(merge)한다. 
* 이미 쪼개진 데이터를 정렬하면서 합병하는 부분을 재귀를 사용하여 길이가 n인 리스트로 구성한다
*/

public class Study_Merge_Sort {
	public static void main(String[] args) {
	
		Study_Merge_Sort study = new Study_Merge_Sort();
		
		int data[] ={5,4,3,2,1,11};
		
		study.mergeSort(data,0,data.length-1);
		
		for (int i = 0; i < data.length; i++) {
			System.out.println("data["+i+"] : "+data[i]);
		}
	}
	
	public void mergeSort(int[] data, int left, int right){
		if(left < right){
			int pivot = (left + right)/2;		// divide 할 pivot 구하기
			mergeSort(data,left, pivot);		// 재귀를 통해 리스트의 길이가 더 나눌 수 없을때까지 나눔.
			mergeSort(data,pivot+1,right);
			merge(data,left,pivot,right);		// 그러고 배열 안에서 정렬을하면서 합침.(배열안에서 정렬만 한다고 볼 수있다.)
		}
	}
	
	public void merge(int[] data, int left, int pivot, int right){
//		완전 대체를 해야함.
		int i=left, j=pivot+1, k=left;				// 주어진 데이타와 같은 크기의 배열을 선언하고, 정렬에 필요한 변수도 따로 선언
		int[] temp = new int[data.length];
		while(i<=pivot && j <= right){
			if(data[i]<=data[j])
				temp[k++] = data[i++];		// 맨 왼쪽값이 pivot값 보다 작으면 똑같이 복사한 배열에 맨왼쪽에 넣어준다.(반복)
			else
				temp[k++] = data[j++];		// 오른쪽에선 pivot값이 맨 오른쪽 값보다 작으면 pivot인덱스의 값을 넣어준다. 
		}
		while(j<=right)						// 둘 중 어느 한쪽이 먼저 끝나면 복사 배열에 남은 값들을 넣어준다.
			temp[k++] = data[j++];
		while(i<=pivot)						// ..
			temp[k++] = data[i++];
		for(int l=left;l<=right;l++)		// 같은 크기로 복사하고 정렬을 마친 배열을 data에 넣어준다.
			data[l] = temp[l];
	}
}
