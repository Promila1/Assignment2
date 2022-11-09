
public class Subset {
	boolean subset(int arr1[],int arr2[],int l1,int l2) {
		
		for(int i=0;i<l2;i++) {
			for(int j=0;j<l1;j++) {
				if(arr2[i]==arr1[j]) 
					break;
				if(j==l1) {
					return false;
				}
				}
			
		}
		return true;
	}
		
	
public static void main(String args[]) {
	
	int arr1[]= {1,2,3,4,5,6};
	int arr2[]= {1,2,3,4};
	int l1=arr1.length;
	int l2=arr2.length;
	Subset o=new Subset();
	
	if(o.subset(arr1, arr2, l1, l2)){
		System.out.println("arr2 is subset of arr1");
	}
}
}
