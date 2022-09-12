import java.util.*;

 class ArrayMax {
	public static void main(String[] args) {
		int[] A ={1,11,3,4,5,6,7,8,9,10};
		int i=0;
		int a=0;
		while (i<A.length){
		    if (A[i]>a){
		        
		         a=A[i];
		        
		        }
		        i++;
		    }
		System.out.println(a);
		
	}
}