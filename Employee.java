import java.util.*;
class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Age : ");
		int a = sc.nextInt();
		System.out.print("Enter your Sex (M or F) : ");
		char s = sc.next().charAt(0);
		System.out.print("Enter your Merital Status (Y or N) : ");
		char m = sc.next().charAt(0);
		
		if (s=='M' || s=='m'){
		    if (a>20 && a<=40){
		        System.out.println("You can work Anywhere ");
		        }
		    else if(a>40 && a<=60){
		        System.out.println("You can only work in Urban Areas");
		        }
		    }
		else{
		    System.out.println("You can only work in Urban Areas");
		    }
	}
}