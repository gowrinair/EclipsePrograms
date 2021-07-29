package DataStructures;

public class LinearSearch1 {
	
	public static int search(int[] a,int k) {
		
		for(int i=0;i<a.length;i++)
		{	if(a[i]==k)
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int a[]= {1,13,14,16,17};
		int k=18;
		int ans=LinearSearch1.search(a, k);
		System.out.println("Element at "+ ans);
	}

}
