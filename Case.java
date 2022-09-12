import java.util.*;
public class Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character : ")
		char c = sc.next().charAt(0);
		if (c>='a' && c<='z'){
		    
		    System.out.println("It's Lowercase");
		    }
		    
		    else if (c>='A' && c<='Z'){
		        System.out.println("It's Uppercase");
		        
		        }
	}
}