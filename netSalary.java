import java.util.*;
class NetSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Salary : ");
		int s = sc.nextInt();
		System.out.print("Enter Year of Service : ");
		int y= sc.nextInt();
		double c = y>5? s+ s*(.05) : s;
		System.out.println("Your Net Salary is : "+c);
		
	}
}