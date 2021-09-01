package programming;

public class SortThreeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ar= {1,2,1,2,0,1,0,2,0,2,0,1,0};
		int[] ar= {2,2,2,1,2,1,0,0,0};
		int n=ar.length;
		
		int left=0;
		int current=0;
		int right=n-1;
		
		while(current<right) {
			if(ar[current]==0) {
				int temp=ar[current];
				ar[current]=ar[left];
				ar[left]=temp;
				current++;
				left++;
			}
			if(ar[current]==1) {
				current++;
			}
			if(ar[current]==2) {
				int temp=ar[current];
				ar[current]=ar[right];
				ar[right]=temp;
				right--;
			}
			
		}
		for(int element: ar) {
			System.out.print(element+", ");
		}
	}

}
