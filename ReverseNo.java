import java.util.*;
class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. to be Reversed : ");
		int n = sc.nextInt();
		int rev= 0;
		while (n!=0){
		    int r= n%10;
		    rev = (rev*10) + r;
		    n=n/10;
		    }
		System.out.print("Reversed No. is : "+rev);
	}
}