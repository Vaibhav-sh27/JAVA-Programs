import java.util.*;
class Rate {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int hr = sc.nextInt();
		 float rate= sc.nextInt();
		float t;
		if (hr>8)
		{
		    float a= rate*8;
		    float b= ((rate*(0.5f))+rate)*(hr-8);
		    t= a+b;
		    }
		 else{
		     t= rate*hr;
		     }
		  System.out.println(t);
	}
}