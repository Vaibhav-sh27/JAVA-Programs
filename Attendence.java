import java.util.*;
class Attendence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of classes Held : ");
		float h = sc.nextInt();
		System.out.print("Enter no. of classes Attended : ");
		float a = sc.nextInt();
		System.out.print("Enter 'Y' if you have a Medical case or 'N' if not : ");
		char m= sc.next().charAt(0);
		
		if (((a/h)*(100)) >= 75){
		    System.out.println("You are Allowed to sit in exams" );
		    }
		else if (m=='Y' || m=='y') {
		    System.out.println("You are Allowed to sit in exams");
		    }
		else {
		    System.out.print("You are Not Allowed to sit in exams");
		    }		
	}
}