package rough.work;

public class Rough {
	
	static void swap(int[] arr, int x, int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	static void quickSorting(int[] array, int left, int right){
		if(array==null||array.length==0) return;
		if(right-left<0) return;
		int pivot = array[right]; int i=left; int j=right;
		while(i<=j){
			while(array[i]<pivot) i++;
			while(array[j]>pivot) j--;
			if(i<=j) {
				swap(array,i,j);
				i++; j--;
			}
		}
		quickSorting(array,left,j);
		quickSorting(array,i,right);
	}

	public static void main(String[] args) {
		int[] arr= {5,2,9,4,1,8,7,3,6};
		quickSorting(arr, 0, arr.length-1);
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println("2nd version");
	}

}
