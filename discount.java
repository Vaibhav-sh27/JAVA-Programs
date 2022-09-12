import java.util.*;
class Discount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Quantity : ");
		int a = sc.nextInt();
		int t = a*100;
		double c = t>1000? t- t*(.1) : t;
		System.out.println("Your total cost is : "+c);
		
	}
}