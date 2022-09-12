import java.util.*;
class GreatestNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st no. : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd no. : ");
		int b = sc.nextInt();
		int c= a>b? a: b;
		System.out.println("Greatest no. is "+c);
		
	}
}