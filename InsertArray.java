import java.util.*;


class InsertArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter index ");
		int idx = sc.nextInt();
		System.out.println("Enter value  ");
		int a=sc.nextInt();
		int flag=0;
		int[] arr1 = {12,34,56,67,78};
          
          
          int [] arr2= new int[arr1.length];
          
          
          for (int i=0; i<arr1.length;i++){
              arr2[i]= arr1[i];
              
              }
              System.out.println(Arrays.toString(arr2));
              
              
              
              
              
              arr1 = new int[arr2.length+1];
             
           for (int i=0; i<arr2.length;i++){
              if (i==idx){
              arr1[i]= a;
              flag=1;
              }
              else if (flag==1){
                  
                  arr1[i]=arr2[i-1];
                  }
                  
              else{
                  arr1[i]=arr2[i];
                  
                  }
           }
             
             arr1[arr1.length-1]= 60;
             
             System.out.println(Arrays.toString(arr1));
             
             
            
            
              
              
              
             
		
	}
}