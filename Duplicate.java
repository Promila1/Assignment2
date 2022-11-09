
public class Duplicate {
	public static void main(String args[]) {
		int a[]= {1,2,2,3,1,3,4,4};
		int k=0;
		int b[]=new int[10];
		System.out.println("Duplicate Elements in Array");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
					
					b[k]=a[j];
					k++;
				}
			}
		}
		
	}}
