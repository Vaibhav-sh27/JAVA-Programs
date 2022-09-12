import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 1;
		int st = 1;
		int sp= n-1;
		while (r <= n) {
			int i = 1;
			while (i<=sp){
			    System.out.print("  ");
			    i++;
			    }
			int j= 1;
			while (j <= st) {
				System.out.print("* ");
				j++;
			}
			sp--;
			System.out.println();
			r++;
			st+=2;


		}
	}
}