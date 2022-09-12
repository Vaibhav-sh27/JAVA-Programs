import java.util.*;
class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks : ");
		int m = sc.nextInt();
		char g;
		if (m > 80) {
			g = 'A';
			} 
		else if (m > 60 && m <= 80) {
		    g= 'B';
		    }
	    else if (m > 50 && m <= 60) {
		    g= 'C';
		    }
		else if (m > 45 && m <= 50) {
		    g= 'D';
		    }
		else if (m > 25 && m <= 45) {
		    g= 'E';
	    	}
		else {
		    g= 'F';
		    }

		System.out.println("Your Grade  is : "+ g);
	}
}