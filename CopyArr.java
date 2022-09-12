import java.util.*;

class CopyArr {
	public static void main(String[] args) {
		
		//object[] obj = new Object[5];
//		obj[0]=10;
//		obj[1]='java';
//		obj[2]=new String("hello");



          int[] arr1 = {12,34,56,67,78};
          
          
          int [] arr2= new int[arr1.length];
          
          
          for (int i=0; i<arr1.length;i++){
              arr2[i]= arr1[i];
              
              }
              System.out.println(Arrays.toString(arr2));
              
             arr1 = new int[arr2.length+1];
             
           for (int i=0; i<arr2.length;i++){
              arr1[i]= arr2[i];
              
              }
             
             arr1[arr1.length-1]= 60;
             
             System.out.println(Arrays.toString(arr1));
		
	}
}