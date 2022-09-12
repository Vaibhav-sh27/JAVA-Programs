import java.util.*;
class PersonAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age 1 : ");
		int a = sc.nextInt();
		System.out.print("Enter Age 2 : ");
		int b = sc.nextInt();
		System.out.print("Enter Age 3 : ");
		int c = sc.nextInt();
		int l= a>b? a>c ? a : c : b>c ? b : c;
		int s= a<b? a<c ? a : c : b<c ? b : c;
		System.out.println("Youngest Person is having age of "+s);
		System.out.println("Oldest Person is having age of "+l);
		
	}
}