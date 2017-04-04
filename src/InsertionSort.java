
public class InsertionSort {
	
	public static void insertionSortAlgo(int[] a){
		int len = a.length;
		for(int j = 1; j<len ;j++){
			int key = a[j];
			int i = j-1;
			while((i>-1)&&(a[i]>key)){
				a[i+1] = a[i];
				i--;
			}
			
			a[i+1] = key;
		}
	}
	
	public static void main(String [] args) {
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        insertionSortAlgo(input);
		for(int j = 0; j<input.length-1 ;j++){
			System.out.println(input[j]);
			
		}

		
	}
	
	

}
