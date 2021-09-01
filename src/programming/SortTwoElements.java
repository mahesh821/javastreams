package programming;

public class SortTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,0,0,0,1};
		int n=ar.length;
		
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if(ar[i]==1) {
				ar[i]=ar[i]^ar[j]; // swap without 3rd variable
				ar[j]=ar[i]^ar[j];
				ar[i]=ar[i]^ar[j];
				j--;
			}
			else if(ar[i]==0) {
				i++;
			}
			else if(ar[j]==1) {
				j--;
			}
		}
		
		for(int element: ar) {
			System.out.print(element+", ");
		}
	}

}
