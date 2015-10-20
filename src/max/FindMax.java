package max;

public class FindMax {
	public static void main(String args[]){
		int a[]={1,7,9,2,5,4,8,3};
		System.out.println("Max: "+findMax(a, a.length));
	}
	public static int findMax(int a[],int n){
		if(n==1){
			return a[0];
		}else{
			return findMax(a,n-1)>a[n-1]?findMax(a,n-1):a[n-1];
		}
		
	}
}
