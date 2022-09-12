import java.util.Scanner;

class Student{
    String name;
    byte age;
    int roll;
    
}


class Start {
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		//Scanner sc= new Scanner(System.in);
		System.out.print("Enter Name");
		String name = sc.next();
		String nam = sc.nextLine();
		byte age = sc.nextByte();
		double price = sc.nextDouble();
		char naa = sc.next().charAt(0);
		System.out.println("Your name"+ name);
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println("Name"+s1.name);
		System.out.println("age"+s2.age);
		System.out.println("roll"+s1.roll);
		}
}