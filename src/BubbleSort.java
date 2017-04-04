
public class BubbleSort {
	void swap(int a,int b){
		int c;
		c=a;
		a=b;
		b=c;
	}
	public static void BubbleAlgo(int [] a){
		int c;
		int len= a.length;
		for(int i=len-1;i>0;i--){
			for(int j = 0; j<len-1;j++){
				if(a[j]>a[j+1]){
					c =a[j];
					a[j] = a[j+1];
					a[j+1] = c;
				}

			}
		}
	}

public static void main(String [] args){
	
	
	int [] a = {23,45,12,34,65,98};
	
BubbleAlgo(a);	
for(int i=0; i<a.length-1;i++){
System.out.println(a[i]);}
}
}
