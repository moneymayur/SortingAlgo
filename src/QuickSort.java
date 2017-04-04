
public class QuickSort {

	public static int partition(int [] a, int lo, int hi){
		int pivot = a[hi];
		int  i = lo-1 ;
		int j= hi+1;
		while(a[++i]>pivot && pivot<a[--j]){
			if(i>=j) 
				return j;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return j;
		}
		
	
	public static void quicksortAlgo(int [] a, int lo, int hi){
		if(lo<hi){
			int p = partition(a,lo,hi);
			quicksortAlgo(a,lo,p);
			quicksortAlgo(a,p+1,hi);
		}
	}
	
	public static void main(String[] args){
		 int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		 quicksortAlgo(input, 1 ,8);
			for(int j = 0; j<input.length-1 ;j++){
				System.out.println(input[j]);
				
			}
	}
	
	} 

